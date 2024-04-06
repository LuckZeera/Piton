grammar Piton;

tipo: 'I' | 'C' | 'B' | 'S' | 'F';
ATR: ':';
OP_ART: '+' | '-' | '*' | '#' | '/';
PARA: 'PARA';
ATE: 'ATE';
ENQ: 'ENQUANTO';
OP_REL: '<' | '<=' | '>' | '>=' | '==' | '!=';
OP_LOG: 'OU' | 'E' | 'NAO';
VAZ: 'VAZIO';
ENT: 'ENTRADA';
SAI: 'SAIDA';
IF: '?';
ELSE: '%';
ELIF: '%?';
RET: 'RETORNA';
ID: LETRA(DIGITO | LETRA)*;
NUM: DIGITO + ('.'DIGITO+)?;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
AP: '(';
FP: ')';
EB: [ \r\t\n]* ->skip;
ErrorChar: . ;

