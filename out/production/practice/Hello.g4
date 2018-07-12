grammar Hello;
r : 'hello' IDID;
IDID : 'hello' | 'lo';
ID : [a-z]+ ;
WS : [\t\r\n]+ -> skip ;