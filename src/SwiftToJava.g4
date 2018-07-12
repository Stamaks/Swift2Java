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


startRule  : (initialization | forCycle | ifStat)*;
initialization :
    //var float: Float = ...
    VAR ID COLON FLOAT ASSIGN
    {
        sout("\t\tfloat " + $ID.text + " = ");
    }
    rightFloatValue
    |
    VAR ID COLON INTEGER ASSIGN
    {
        sout("\t\tint " + $ID.text + " = ")
    }
    rightIntValue;


varChange:
    //cat = ...
    ID ASSIGN
    {
        sout("\t\t" + $ID.text + " = ");
    }
    (rightIntValue | rightFloatValue);


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
    (initialization | varChange | printCom | forCycle | ifStat | breakRule | )*
    RCURBR
    {
        sout("\t\t}");
    };


ifStat :
    //if (bool) {sth}   |   if bool {sth}
    IF  (LBR {sout("\t\tif (");} boolForm RBR {sout(")");} | boolForm RBR)  LCURBR {sout(" {\n\t\t\t");}
        (initialization | varChange | printCom | forCycle | ifStat | )*
    RCURBR {sout("}\n");}
    ( | ELSE LCURBR {sout("\t\telse {"\n\t\t\t);}
        (initialization | varChange | printCom | forCycle | ifStat | )*
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
        sout(")\n");
    };


rightFloatValue :
    //... 1.0 + 2 + abc...
    (a=FL|a=INT|a=ID) {sout($a.text)} (PLUS (a=FL|a=INT|a=ID) {sout(" + " + $a.text)})* {sout(";\n")};


rightIntValue :
    // 1 + abc
    (a=INT|a=ID) {sout($a.text)} (PLUS (a=INT|a=ID) {sout(" + " + $a.text)})* {sout(";\n")};

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
SCOLON  : ';';
RANGE   : '...';
RANGEB  : '..<';


//Identifiers
ID : [a-zA-Z_]+ {};

//Literals
fragment DIGIT : [0-9] ; // not a token by itself

INT : DIGIT+ ; // references the DIGIT helper rule
FL : DIGIT+ '.' DIGIT+;

// String
// Строка
fragment QUOTATIONMARK : '"';
STRING : QUOTATIONMARK ~["]+ QUOTATIONMARK;

LCURBR : '{';
RCURBR : '}';
LBR   : '(';
RBR    : ')';

WS : [ \t\r\n;]+ -> skip ;