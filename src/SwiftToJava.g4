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
	static String prefixCodeGen =
	@"public class Main
    {
        public static void main(String args[]){
    ";

    static String suffixCodeGen =
    @"
            }
    }
    ";
}
//Reserved words
VAR   : 'var';
FOR   : 'for';
IN    : 'in';
BREAK : 'break';
IF    : 'if';
ELSE  : 'else';

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
MULT    : '*';
MOD     : '%';

//Identifiers
//Идентификаторы
ID : [a-zA-Z]+ {};

//Literals
//Литералы

fragment DIGIT : [0-9] ; // not a token by itself
// фрагмент - не самостоятельная лексема

INT : DIGIT+ ; // references the DIGIT helper rule
// ссылается на фрагмент DIGIT

// String
// Строка
fragment QUOTATIONMARK : '"';
STRING : QUOTATIONMARK ~["]+ QUOTATIONMARK;

LBRACKET : '{';
RBRACKET : '}';

WS : [ \t\r\n]+ { Skip(); } ;