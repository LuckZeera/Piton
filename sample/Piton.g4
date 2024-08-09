grammar Piton;

inicio: algoritmo EOF;
declaracoes: tipo ID | tipo ID ATR (ID|NUM|'('operacao')');
argumento: ID | NUM | operacao; 
algoritmo: (instr)+;
instr: atrib | acao | se | enquanto | para | funcao_vazio | funcao_nao_vazio | declaracoes | retorna;
atrib: operacao ATR ID;
acao: SAI(ID|NUM|operacao)|ENT ID;
operacao: operando (operacao_cauda)?;
operando: NUM|ID|chamada_funcao;
operacao_cauda: OP_ART operando (operacao_cauda)*;
se: IF condicao (instr)* (senao|senao_se)?;
condicao: operando OP_REL operando (logica)*;
logica: OP_LOG (condicao);
senao: ELSE (instr)*;
senao_se: ELIF condicao (instr)* (senao_se)?;
enquanto: ENQ condicao (instr)*;
para: PARA atrib ATE (ID | NUM) (instr)*;
funcao_vazio: VAZ ID AP (declaracoes)* FP (instr)*;
funcao_nao_vazio: tipo ID AP (declaracoes)* FP (instr)*;
retorna: RET (ID|NUM|operacao);
chamada_funcao: ID AP (argumento)* FP;


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

