package com.github.zinoviy23.intellijIdris.lang.parser.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
%%

%class _IdrLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

EOL=\r|\n|\r\n
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS})+
VARIDREGEXP=([a-zA-Z_][a-zA-Z_0-9']+)|[a-z]
INTEGER_LIT=[1-9][0-9]*
OPERATOR=[+\-*/=.:_<>$&|]+

%%
<YYINITIAL> {
    {EOL}           { return EOL; }
    {WHITE_SPACE}+  { return WHITE_SPACE; }
    "case"          { return KW_CASE; }
    "of"            { return KW_OF; }
    "if"            { return KW_IF; }
    "then"          { return KW_THEN; }
    "else"          { return KW_ELSE; }
    {VARIDREGEXP}   { return IDENTIFICATOR; }
    {INTEGER_LIT}   { return INTEGER_LITERAL; }
    "->"            { return TYPE_SIGN; }
    "=>"            { return ARROW_SIGN; }
    "="             { return EQ_SIGN; }
    ":"             { return COLON_SIGN; }
    "("             { return LPAR; }
    ")"             { return RPAR; }
    ","             { return COMMA; }
    "["             { return LBRACKET; }
    "]"             { return RBRACKET; }
    {OPERATOR}      { return OPERATOR; }
    [^]             { return BAD_CHARACTER; }
}