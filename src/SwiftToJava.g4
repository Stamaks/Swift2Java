grammar SwiftToJava;

options
{
	language=Java;
}

@parser::header
{
    import java.util.*;
    import javax.management.openmbean.KeyAlreadyExistsException;
    import com.sun.corba.se.impl.io.TypeMismatchException;
    import java.io.File;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.nio.file.StandardOpenOption;
}

@parser::members
{
	static String prefixCodeGen = "public class Main\n{\n\tpublic static void main(String args[]){\n";

    static String suffixCodeGen = "\t}\n}";

    static Map<String, String> table = new HashMap<>();

    public boolean isVarChange = false;
    public String varChangeType = "";

    static ArrayList<String> reservedNames = new ArrayList<String>(
                           Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case",
                                   "catch", "char", "class", "const", "continue", "default", "double", "do", "else", "enum",
                                   "extends", "false",
                           "final", "finally", "float", "for", "goto", "if",
                           "implements", "import", "instanceof", "int", "interface", "long",
                           "native", "new", "null", "package", "private", "protected",
                           "public", "return", "short", "static", "strictfp", "super",
                           "switch", "synchronized", "this", "throw", "throws", "transient",
                           "true", "try", "void", "volatile", "while"));

//    public static void main(String args[]){
//        CharStream input = CharStreams.fromStream(System.in);
//        // create a lexer that feeds off of input CharStream
//        SwiftToJavaLexer lexer = new SwiftToJavaLexer(input);
//        // create a buffer of tokens pulled from the lexer
//        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
//        // create a parser that feeds off the tokens buffer
//        SwiftToJavaParser parser = new SwiftToJavaParser(tokens);
//
//        sout(prefixCodeGen);
//        ParseTree tree = parser.startRule();
//        sout(suffixCodeGen);
//
//    }
    public void assigned(String id, String type){
        if (table.containsKey(id)) {
                throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
                                                    ": variable " + id + " is already assigned!");
            }
            if (reservedNames.contains(id)) {
                if (table.containsKey(id)) {
                        throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
                                                            ": variable _" + id + " is already assigned!");
                }
                table.put("_" + id, type);
            }
            else {
                table.put(id, type);
            }
    }

    public void exists(String id){
        if (!table.containsKey(id)) {
            if (reservedNames.contains(id) && !table.containsKey("_" + id)) {
                throw new NoSuchElementException("Line: " + getContext().start.getLine() +
                                           ": variable _" + id + " wasn't assigned!");
            }
        }
    }

    public String getID(String id){
        if (reservedNames.contains(id))
            return "_" + id;
        else
            return id;
    }

    public void typeMismatch(String id, String wrongType){
        if (table.get(id).equals(wrongType)) {
            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
                                                          ": variable " + id + " has wrong type!");
        }
    }

    public static void sout(String str){
        System.out.print(str);

        String path = "translatedCode.java";
        File f = new File(path);
        if(!f.exists() && !f.isDirectory()) {
            try{
                f.createNewFile();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        try {
            Files.write(Paths.get(path), str.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

@lexer::header
{
}

@lexer::members
{
}

//TODO: Подсчет табов?
//TODO: Скрипты


startRule  : (initialization | forCycle | ifStatAverage | varChange | printCom)*;
initialization :
    //var float: Float = ...
    VAR ID COLON FLOAT ASSIGN
    {
        assigned($ID.text, "float");
        sout("\t\tfloat " + getID($ID.text) + " = ");

    }
    floatValue {sout(";\n");}
    |
    VAR ID COLON INTEGER ASSIGN
    {
        assigned($ID.text, "int");
        sout("\t\tint " + getID($ID.text) + " = ");

    }
    intValue {sout(";\n");};


varChange:
    //cat = ...
    ID ASSIGN
    {
        exists($ID.text);
        sout("\t\t" + getID($ID.text) + " = ");
        isVarChange = true;
        varChangeType = table.get(getID($ID.text));
    }
    (intValue | floatValue) {sout(";\n");};


forCycle :
    //for _ in 1...n {
    (FOR i=ID IN (a=INT|a=ID {exists($a.text);}) RANGE (b=INT|b=ID {exists($b.text);}) LCURBR
    {
        String a_id = $a.text;
        if (!a_id.matches("[.0-9]+"))
            a_id = getID(a_id);

        String b_id = $b.text;
        if (!b_id.matches("[.0-9]+"))
            b_id = getID(b_id);

        assigned($i.text, "float");
        String i_id = getID($i.text);

        sout("\t\tfor (int " + i_id + " = " + a_id + "; " + i_id + " <= " + b_id + "; " + i_id + "++) {\n\t\t\t");
    }
    |
    //for _ in 1..<n {
    FOR i=ID IN (a=INT|a=ID {exists($a.text);}) RANGEB (b=INT|b=ID {exists($b.text);}) LCURBR
    {
        String a_id = $a.text;
        if (!a_id.matches("[.0-9]+"))
            a_id = getID(a_id);

        String b_id = $b.text;
        if (!b_id.matches("[.0-9]+"))
            b_id = getID(b_id);

        assigned($i.text, "float");
        String i_id = getID($i.text);

        sout("\t\tfor (int " + i_id + " = " + a_id + "; " + i_id + " <= " + b_id + "; " + i_id + "++) {\n\t\t\t");
    }
    )
    (possibleBlocks | ifStatCycle | breakRule)*
    RCURBR
    {
        sout("\t\t}\n");
    };


ifStatAverage :
    //if (bool) sth   |   if bool sth
    (IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR) {sout(" \n\t\t\t");}
            (possibleBlocks | ifStatAverage)? {sout("\n");}
    )
    |
    //if (bool) {sth}   |   if bool {sth}
    IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR)  LCURBR {sout(" {\n\t\t\t");}
        (possibleBlocks | ifStatAverage)*
    RCURBR {sout("\t\t}\n");}
    ( | ELSE LCURBR {sout("\t\telse {\n\t\t\t");}
        (possibleBlocks | ifStatAverage)*
        RCURBR {sout("\t\t}\n");}
      | ELSE {sout("\t\telse \n\t\t\t");}
        (possibleBlocks | ifStatAverage)? {sout("\n");}
    );


ifStatCycle:
   //if (bool) sth   |   if bool sth
       (IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR) {sout(" \n\t\t\t");}
               (possibleBlocks | ifStatCycle | breakRule)? {sout("\n");}
       )
       |
       //if (bool) {sth}   |   if bool {sth}
       IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR)  LCURBR {sout(" {\n\t\t\t");}
           (possibleBlocks | ifStatCycle | breakRule)*
       RCURBR {sout("}\n");}
       ( | ELSE LCURBR {sout("\t\telse {\n\t\t\t");}
           (possibleBlocks | ifStatCycle | breakRule)*
           RCURBR {sout("}\n");}
         | ELSE {sout("\t\telse \n\t\t\t");}
           (possibleBlocks | ifStatCycle | breakRule)? {sout("\n");}
       );


printCom :
    //print('dfdf") | print(cat) | print(cat + cat + "cat") ...
    PRINT LBR {sout("\t\tSystem.out.println(");}
        (STRING {sout($STRING.text);}
        |
        (intValue | floatValue))
//        ID
//        {
//        exists($ID.text);
//        sout(getID($ID.text));
//        })?
        (PLUS (intValue | floatValue)
//        PLUS ID
//        {
//        exists($ID.text);
//        sout(" + " + getID($ID.text));
//        }
        |
        PLUS STRING {sout(" + " + $STRING.text);})*
    RBR {sout(");\n");};


possibleBlocks : (initialization | varChange | printCom | forCycle);


boolForm :
    // a + d <= b - c
    NOT LBR {sout("!(");} boolForm RBR {sout(")");}
    |
    (intValue | floatValue)
            (s=EQUAL|s=NEQUAL|s=GREATER|s=GROREQ|s=LESS|s=LESSOREQ){sout(" " + $s.text + " ");}
                                                                        (intValue | floatValue);


breakRule :
    BREAK {sout("\t\t\tbreak;\n");};


floatValue :
    // 1.0 + 2 - abc...
    (FL {sout($FL.text + "f");} | INT {sout($INT.text + "f");} | ID
    {
    if (isVarChange) {
        if (varChangeType.equals("int")) {
            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
                                                        ": cannot assign float to int!");
        }
        isVarChange = false;
    }
    exists($ID.text);
    sout(getID($ID.text));
    })
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (a=FL|a=INT|a=ID {exists($a.text);})
    {
        String a_id = $a.text;
        if (!a_id.matches("[.0-9]+"))
            a_id = getID(a_id);
        else
            a_id += "f";
        sout(" " + $s.text + " " + a_id);
    }
    |
    LBR {sout(" (");} (intValue | floatValue) RBR {sout(")");}
    ))*;


intValue :
    // 1 + abc
    (a=INT|a=ID {exists($a.text);})
    {
        String a_id = $a.text;
        if (!a_id.matches("[.0-9]+")) {
            a_id = getID(a_id);
            if (isVarChange) {
                if (!varChangeType.equals("float")) {
                    typeMismatch(a_id, "float");
                }
            }
            else {
                typeMismatch(a_id, "float");
            }
        }
        if (a_id.contains(".")) {
            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
                                                                      ": number " + a_id + " has wrong type!");
        }
        sout(a_id);
    }
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (b=INT|b=ID {exists($b.text);})
    {
        String b_id = $b.text;
        if (!b_id.matches("[.0-9]+")) {
            b_id = getID(b_id);
            if (isVarChange) {
                if (!varChangeType.equals("float")) {
                    typeMismatch(b_id, "float");
                }
            }
            else {
                typeMismatch(b_id, "float");
            }
        }
        sout(" " + $s.text + " " + b_id);
    }
    |
    (s=OR|s=AND|s=XOR) (b=INT|b=ID {exists($b.text);})
    {
        String b_id = $b.text;
        if (!b_id.matches("[.0-9]+")){
             b_id = getID(b_id);
             if (isVarChange) {
                 if (!varChangeType.equals("float")) {
                     typeMismatch(b_id, "int");
                 }
             }
             else {
                 typeMismatch(b_id, "float");
             }
        }
        sout(" " + $s.text + " " + b_id);
    }
    |
    LBR {sout(" (");} intValue RBR {sout(")");}
    ))*;


//Reserved words
VAR   : 'var';
FOR   : 'for';
IN    : 'in';
BREAK : 'break';
IF    : 'if';
ELSE  : 'else';
PRINT : 'print';
INTEGER : 'Int';
FLOAT : 'Float';

//Operators
ASSIGN	: '=' ;
PLUS	: '+' ;
MINUS	: '-' ;
EQUAL   : '==';
NEQUAL  : '!=';
GREATER : '>';
GROREQ  : '>=';
LESS    : '<';
LESSOREQ: '<=';
XOR     : '^';
AND     : '&&';
OR      : '||';
NOT     : '!';
MULT    : '*';
MOD     : '%';
QUEST   : '?';
COLON   : ':';
RANGE   : '...';
RANGEB  : '..<';


//Identifiers
ID : [a-zA-Z_]+ {};

//Literals
fragment DIGIT : [0-9] ; // not a token by itself

INT : DIGIT+ ; // references the DIGIT helper rule
FL : DIGIT+ '.' DIGIT+;

// String
fragment QUOTATIONMARK : '"';
STRING : QUOTATIONMARK ~["]+ QUOTATIONMARK;

LCURBR : '{';
RCURBR : '}';
LBR   : '(';
RBR    : ')';

WS : [ \t\r\n;]+ -> skip ;
