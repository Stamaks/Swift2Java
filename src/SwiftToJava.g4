grammar SwiftToJava;

options
{
	language=Java;
}

@parser::header
{
    import java.util.*;
    import javax.management.openmbean.KeyAlreadyExistsException;
}

@parser::members
{
	static String prefixCodeGen = "public class Main\n{\n\tpublic static void main(String args[]){\n";

    static String suffixCodeGen = "\t}\n}";

    static Map<String, String> table = new HashMap<>();

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
    if (reservedNames.contains(id) && !table.containsKey("_" + id)) {
            throw new NoSuchElementException("Line: " + getContext().start.getLine() +
                                       ": variable _" + id + " wasn't assigned!");
        }
        if (!table.containsKey(id)) {
                    throw new NoSuchElementException("Line: " + getContext().start.getLine() +
                                               ": variable " + id + " wasn't assigned!");
        }
    }

    public static void sout(String str){
        System.out.print(str);
    }
}

@lexer::header
{
}

@lexer::members
{
}

//TODO: Выводить код не в консоль, а в файл
//TODO: Подсчет табов?
//TODO: Скрипты


startRule  : (initialization | forCycle | ifStatAverage | varChange | printCom)*;
initialization :
    //var float: Float = ...
    VAR ID COLON FLOAT ASSIGN
    {
        assigned($ID.text, "float");
        if (reservedNames.contains($ID.text))
            sout("\t\tfloat _" + $ID.text + " = ");
        else
            sout("\t\tfloat " + $ID.text + " = ");
    }
    floatValue {sout(";\n");}
    |
    VAR ID COLON INTEGER ASSIGN
    {
        assigned($ID.text, "int");
        if (reservedNames.contains($ID.text))
            sout("\t\tint _" + $ID.text + " = ");
        else
            sout("\t\tint " + $ID.text + " = ");
    }
    intValue {sout(";\n");};


varChange:
    //cat = ...
    ID ASSIGN
    {
        exists($ID.text);
        sout("\t\t" + $ID.text + " = ");
    }
    (intValue | floatValue) {sout(";\n");};


forCycle :
    //for _ in 1...n {
    (FOR i=ID IN (a=INT|a=ID {exists($a.text)}) RANGE (b=INT|b=ID {exists($b.text)}) LCURBR
    {
        assigned($i.text, "float");

        if (reservedNames.contains($ID.text))
            sout("\t\tfor (int _" + $i.text + " = " + $a.text + "; _" + $i.text + " <= " + $b.text + "; _" + $i.text + "++) {\n\t\t\t");
        else
            sout("\t\tfor (int " + $i.text + " = " + $a.text + "; " + $i.text + " <= " + $b.text + "; " + $i.text + "++) {\n\t\t\t");
    }
    |
    //for _ in 1..<n {
    FOR i=ID IN (a=INT|a=ID {exists($a.text)}) RANGEB (b=INT|b=ID {exists($b.text)}) LCURBR
    {
        if (reservedNames.contains($ID.text))
                    sout("\t\tfor (int _" + $i.text + " = " + $a.text + "; _" + $i.text + " < " + $b.text + "; _" + $i.text + "++) {\n\t\t\t");
                else
                    sout("\t\tfor (int " + $i.text + " = " + $a.text + "; " + $i.text + " < " + $b.text + "; " + $i.text + "++) {\n\t\t\t");
        })
    (possibleBlocks | ifStatCycle | breakRule)*
    RCURBR
    {
        sout("\t\t}");
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
    RCURBR {sout("}\n");}
    ( | ELSE LCURBR {sout("\t\telse {\n\t\t\t");}
        (possibleBlocks | ifStatAverage)*
        RCURBR {sout("}\n");}
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
        ID
        {
        exists($ID.text);
        sout($ID.text);
        })?
        (PLUS ID
        {
        exists($ID.text);
        sout(" + " + $ID.text);
        }
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
    exists($ID.text);
    sout($ID.text);
    })
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (a=FL|a=INT|a=ID {exists($a.text);}) {sout(" " + $s.text + " " + $a.text);}
    |
    LBR {sout(" (");} (intValue | floatValue) RBR {sout(")");}
    ))*;


intValue :
    // 1 + abc
    (a=INT|a=ID {exists($a.text);}) {sout($a.text);}
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (a=INT|a=ID {exists($a.text);}) {sout(" " + $s.text + " " + $a.text);}
    |
    (s=OR|s=AND|s=XOR) (a=INT|a=ID {exists($a.text);}) {sout(" " + $s.text + " " + $a.text);}
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
