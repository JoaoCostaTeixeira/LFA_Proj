grammar CSVerify;

program: line* EOF;
line: type NEWLINE;
type: ((ID | NUM)',')+;

ID: [a-zA-Z]+;
NUM: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t\r\n]+ -> skip;
