grammar SwiftToJava;

options
{
	language=Java;
}

@parser::header
{
}

@parser::members
{
	static String prefixCodeGen = "public class Main\n{\n\tpublic static void main(String args[]){\n";

    static String suffixCodeGen = "\t}\n}";

    public static void main(String args[]){
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        sout(prefixCodeGen);
        ParseTree tree = parser.init();
        sout(suffixCodeGen);

        // begin parsing at init rule
        // print LISP-style tree
        //System.out.println(tree.toStringTree(parser));
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

//TODO: Проверка на то, что ID второй раз не объявляется
//TODO: Проверка на совпадение типов
//TODO: Проверка на то, что такой ID существует
//TODO: Выводить код не в консоль, а в файл
//TODO: Not in bool


startRule  : (initialization | forCycle | ifStatAverage)*;
initialization :
    //var float: Float = ...
    VAR ID COLON FLOAT ASSIGN
    {
        sout("\t\tfloat " + $ID.text + " = ");
    }
    floatValue {sout(";\n")}
    |
    VAR ID COLON INTEGER ASSIGN
    {
        sout("\t\tint " + $ID.text + " = ")
    }
    intValue {sout(";\n")};


varChange:
    //cat = ...
    ID ASSIGN
    {
        sout("\t\t" + $ID.text + " = ");
    }
    (intValue | floatValue) {sout(";\n")};


forCycle :
    //for _ in 1...n {
    (FOR i=ID IN (a=INT|a=ID) RANGE (b=INT|b=ID) LCURBR
    {
        sout("\t\tfor (int " + $i.text + " = " + $a.text + "; " + $i.text + " <= " + $b.text + "; " + $i.text + "++) {\n\t\t\t");
    }
    |
    //for _ in 1..<n {
    FOR i=ID IN (a=INT|a=ID) RANGEB (b=INT|b=ID) LCURBR
    {
        sout("\t\tfor (int " + $i.text + " = " + $a.text + "; " + $i.text + " < " + $b.text + "; " + $i.text + "++) {\n\t\t\t");
    })
    (possibleBlocks | ifStatCycle | breakRule)*
    RCURBR
    {
        sout("\t\t}");
    };


ifStatAverage :
    //if (bool) {sth}   |   if bool {sth}
    IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR)  LCURBR {sout(" {\n\t\t\t");}
        (possibleBlocks | ifStatAverage)*
    RCURBR {sout("}\n");}
    ( | ELSE LCURBR {sout("\t\telse {"\n\t\t\t);}
        (possibleBlocks | ifStatAverage)*
        RCURBR {sout("}\n");}
    );


ifStatCycle:
    //if (bool) {sth}   |   if bool {sth}
    IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR)  LCURBR {sout(" {\n\t\t\t");}
        (possibleBlocks | ifStatCycle | breakRule)*
    RCURBR {sout("}\n");}
    ( | ELSE LCURBR {sout("\t\telse {"\n\t\t\t);}
        (possibleBlocks | ifStatCycle | breakRule)*
        RCURBR {sout("}\n");}
    );


printCom :
    //print('dfdf") | print(cat) | print(cat + cat + "cat") ...
    PRINT LBR
    {
        sout("\t\tSystem.out.println(");
    }
    (STRING {sout($STRING.text);} | ID {sout($ID.text);})
    (PLUS ID {sout(" + " + $ID.text)} | PLUS STRING {sout(" + " + $STRING.text)})*
    RBR
    {
        sout(");\n");
    };


possibleBlocks : (initialization | varChange | printCom | forCycle);


boolForm :
    // a + d <= b - c
    NOT LBR {sout("!(");} boolForm RBR {sout(")");}
    |
    (intValue | floatValue)
            (s=EQUAL|s=NEQUAL|s=GREATER|s=GROREQ|s=LESS|s=LESSOREQ){sout(" " + $s.text + " ")}
                                                                        (intValue | floatValue);


breakRule :
    BREAK {sout("\t\t\tbreak;\n")};


floatValue :
    // 1.0 + 2 - abc...
    (a=FL|a=INT|a=ID) {sout($a.text)}
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (a=FL|a=INT|a=ID) {sout(" " + $s.text + " " + $a.text)}
    |
    LBR {sout(" (");} (intValue | floatValue) RBR {sout(")");}
    ))*;


intValue :
    // 1 + abc
    (a=INT|a=ID) {sout($a.text)}
    (((s=PLUS|s=MINUS|s=MULT|s=MOD) (a=INT|a=ID) {sout(" " + $s.text + " " + $a.text)}
    |
    (s=OR|s=AND|s=XOR) (a=INT|a=ID) {sout(" " + $s.text[0] + " " + $a.text)}
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