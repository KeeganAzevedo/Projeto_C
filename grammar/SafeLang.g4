grammar SafeLang;

// ============================================================
// Parser rules
// ============================================================

program
    : separator* statement (separator+ statement)* separator* EOF
    | separator* EOF
    ;

separator
    : SEMI
    ;

statement
    : useStmt
    | typeDef
    | unitDef
    | prefixDef
    | varDecl
    | varDeclAssign
    | assignment
    | writeStmt
    | writelnStmt
    ;

// ------------------------------------------------------------
// Compile-time file inclusion
// Example:
//   use "physics.sl";
// ------------------------------------------------------------

useStmt
    : USE STRING_LITERAL
    ;

// ------------------------------------------------------------
// Dimensional type definitions
//
// Independent dimensions:
//   type NMEC [nmec]: integer;
//   type Grade [val]: real;
//   type Length [meter,m]: real;
//
// Dependent dimensions:
//   type Velocity := Length/Time: real;
//   type Acceleration := Velocity/Time: real;
//   type Force [newton,N] := Mass*Acceleration: real;
// ------------------------------------------------------------

typeDef
    : TYPE ID unitSpec? typeDimExpr? COLON numericType
    ;

typeDimExpr
    : DECL_ASSIGN dimensionExpr
    ;

unitSpec
    : LBRACK ID (COMMA ID)? RBRACK
    ;

numericType
    : INTEGER
    | REAL
    ;

// ------------------------------------------------------------
// Alternative unit definitions
// Example:
//   unit Length [inch,in] := 0.0254*meter;
// ------------------------------------------------------------

unitDef
    : UNIT ID unitSpec DECL_ASSIGN expr
    ;

// ------------------------------------------------------------
// Prefix definitions — advanced, but harmless to parse now
// Example:
//   prefix k := 1e3: real;
// ------------------------------------------------------------

prefixDef
    : PREFIX ID DECL_ASSIGN expr COLON numericType
    ;

// ------------------------------------------------------------
// Variables and assignments
//
// Declarations:
//   r: real;
//   n: NMEC;
//   name: string;
//
// Declaration with initialization:
//   i :=? integer(read "Integer: ") :integer;
//   x := 10 :integer;
//
// Assignments:
//   r := i;
//   l := 10*meter;
//   l :=? real(read "Distance: ")*meter;
// ------------------------------------------------------------

varDecl
    : ID COLON typeRef
    ;

varDeclAssign
    : ID assignOp expr COLON typeRef
    ;

assignment
    : ID assignOp expr
    ;

assignOp
    : DECL_ASSIGN
    | TRY_ASSIGN
    ;

typeRef
    : INTEGER
    | REAL
    | STRING
    | ID
    ;

// ------------------------------------------------------------
// IO
//
// Examples:
//   write "Integers: ", string(i);
//   writeln;
//   writeln "Reals: ", string(r);
//   read "Integer: "
// ------------------------------------------------------------

writeStmt
    : WRITE exprList
    ;

writelnStmt
    : WRITELN exprList?
    ;

exprList
    : expr (COMMA expr)*
    ;

// ============================================================
// Dimension algebra for type definitions
// ============================================================

dimensionExpr
    : dimensionProduct
    ;

dimensionProduct
    : dimensionPower ((MUL | REAL_DIV) dimensionPower)*
    ;

dimensionPower
    : dimensionAtom (POW INTEGER_LITERAL)?
    ;

dimensionAtom
    : ID
    | LPAREN dimensionExpr RPAREN
    ;

// ============================================================
// Expressions
// ============================================================

expr
    : additive
    ;

additive
    : multiplicative ((PLUS | MINUS) multiplicative)*
    ;

multiplicative
    : power ((MUL | REAL_DIV | INT_DIV | REM) power)*
    ;

power
    : unary (POW power)?
    ;

unary
    : (PLUS | MINUS) unary
    | primary
    ;

primary
    : literal
    | ID
    | conversion
    | formatExpr
    | readExpr
    | LPAREN expr RPAREN
    ;

conversion
    : conversionType LPAREN expr RPAREN
    ;

conversionType
    : INTEGER
    | REAL
    | STRING
    ;

formatExpr
    : FORMAT LPAREN expr COMMA expr RPAREN
    ;

readExpr
    : READ STRING_LITERAL
    ;

literal
    : INTEGER_LITERAL
    | REAL_LITERAL
    | STRING_LITERAL
    ;

// ============================================================
// Lexer rules
// ============================================================

// Keywords
USE     : 'use';
TYPE    : 'type';
UNIT    : 'unit';
PREFIX  : 'prefix';
WRITE   : 'write';
WRITELN : 'writeln';
READ    : 'read';
FORMAT  : 'format';
INTEGER : 'integer';
REAL    : 'real';
STRING  : 'string';

// Operators and punctuation
TRY_ASSIGN  : ':=?';
DECL_ASSIGN : ':=';
INT_DIV     : '//';
REM         : '\\\\';
REAL_DIV    : '/';
POW         : '^';
PLUS        : '+';
MINUS       : '-';
MUL         : '*';
COLON       : ':';
SEMI        : ';';
COMMA       : ',';
LPAREN      : '(';
RPAREN      : ')';
LBRACK      : '[';
RBRACK      : ']';

// Literals
// Supports:
//   10
//   1.333
//   0.3e10
//   1e-3

REAL_LITERAL
    : DIGIT+ '.' DIGIT+ EXPONENT?
    | DIGIT+ EXPONENT
    ;

INTEGER_LITERAL
    : DIGIT+
    ;

STRING_LITERAL
    : '"' (ESC_SEQ | ~["\\\r\n])* '"'
    ;

ID
    : LETTER (LETTER | DIGIT | '_')*
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z_]
    ;

fragment EXPONENT
    : [eE] [+-]? DIGIT+
    ;

fragment ESC_SEQ
    : '\\' [btnfr"\\]
    ;

// Comments and whitespace
// Single-line comments start with #.
// Multi-line comments are delimited by ## ... ##.

MULTILINE_COMMENT
    : '##' .*? '##' -> skip
    ;

LINE_COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
