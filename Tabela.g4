grammar Tabela;

program: statList EOF;
statList:stat*;
stat: read NEWLINE | newTable NEWLINE | saveFile NEWLINE | removeColumn NEWLINE | removeLine NEWLINE | addColumn NEWLINE | addLine NEWLINE
      | printTable NEWLINE | equals NEWLINE | getColumn NEWLINE | getLine NEWLINE | sum NEWLINE;
read: e1 = ID2 '.read(' e2 = ID2 '.csv)';
newTable: e1 = ID2 '.newTable('e2 = ID2','e3 = ID2')';
saveFile:  e1 = ID2 '.saveFile(' e2 = ID2 '.csv)';
removeColumn: e1 = ID2 '.removeColumn(' e2 = ID2 ')';
removeLine: e1 = ID2 '.removeLine(' e2 = ID2 ')';
addColumn: e1 = ID2 '.addColumn(' e2=ID2 ')';
addLine: e1 = ID2 '.addLine()';
printTable: e1 = ID2 '.printTable()';
equals: e1 = ID2 '=' e2 = ID2;
getColumn: e1 = ID2 '.getColumn(' e2 = ID2 ')';
getLine: e1 = ID2 '.getLine(' e2 = ID2 ')' ;
sum: e1=ID2 '.sum(' e2=ID2 ',' e3=ID2 ')';
ID2: [a-zA-Z0-9]+;
NEWLINE: '\r'? '\n';
WS : [ \t\r\n]+ -> skip ;
