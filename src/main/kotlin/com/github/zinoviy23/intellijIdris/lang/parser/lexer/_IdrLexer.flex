package com.github.zinoviy23.intellijIdris.lang.parser.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.ArrayDeque;

import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
%%

%{
    private ArrayDeque<Integer> indentationLevel = new ArrayDeque<>();

    private void handleWhiteSpace() {
        var len = yylength();
        if (indentationLevel.isEmpty()) {
            indentationLevel.addLast(len);
            yybegin(IN_OPEN);
            return;
        }
        var last = indentationLevel.getLast();
        if (last < len) {
            indentationLevel.addLast(len);
            yybegin(IN_OPEN);
        }
        else if (last == len) {
            yybegin(IN_OPEN);
        }
        else if (last > len) {
            indentationLevel.removeLast();
        }
    }

    private IElementType handleClose() {
        if (!indentationLevel.isEmpty()) {
            indentationLevel.clear();
            return null;
        }
        return null;
    }

    private IElementType l() {
        yybegin(IN_LINE);
        yypushback(yylength());
        return handleClose();
    }
%}

%class _IdrLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

EOL=\r|\n|\r\n
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS})+
VARIDREGEXP=([a-zA-Z_][a-zA-Z_0-9']+)|[a-zA-Z]
INTEGER_LIT=([1-9][0-9]*|0)
LINE_COMMENT_START="--"[^{LINE_WS}\r\n]*
DOC_COMMENT_START="|||"[^{LINE_WS}\r\n]*
DIRECTIVE_START="%"[^{LINE_WS}\r\n]*
OPERATOR=[+\-*/=.:_<>$&|\\]+
PLACEHOLDER=_

%state IN_LINE_COMMENT
%state IN_DOC_COMMENT
%state IN_ID
%state IN_DIRECTIVE_START
%state IN_DIRECTIVE
%state IN_STRING_LITERAL
%state IN_OPEN
%state IN_LINE

%%
<YYINITIAL> {
    {EOL}                { return EOL; }
    {WHITE_SPACE}+       { handleWhiteSpace(); return WHITE_SPACE; }
    [^]                  { var l = l(); if (l != null) return l; }
}

<IN_LINE> {
    {EOL}                { yybegin(YYINITIAL); return EOL; }
    {WHITE_SPACE}+       { return WHITE_SPACE; }
    {LINE_COMMENT_START} { yybegin(IN_LINE_COMMENT);  yypushback(yylength() - 2); return LINE_COMMENT_START; }
    {DOC_COMMENT_START}  { yybegin(IN_DOC_COMMENT); yypushback(yylength() - 3); return DOC_COMMENT_START; }
    {DIRECTIVE_START}    { yybegin(IN_DIRECTIVE_START); yypushback(yylength() - 1);  return DIRECTIVE_START; }
    "infix"              { return KW_INFIX; }
    "infixl"             { return KW_INFIXL; }
    "infixr"             { return KW_INFIXR; }
    "prefix"             { return KW_PREFIX; }
    "module"             { return KW_MODULE; }
    "import"             { return KW_IMPORT; }
    "case"               { return KW_CASE; }
    "of"                 { return KW_OF; }
    "if"                 { return KW_IF; }
    "then"               { return KW_THEN; }
    "else"               { return KW_ELSE; }
    "where"              { return KW_WHERE; }
    "let"                { return KW_LET; }
    "in"                 { return KW_IN; }
    "export"             { return KW_EXPORT; }
    "partial"            { return KW_PARTIAL; }
    "total"              { return KW_TOTAL; }
    {VARIDREGEXP}        { yybegin(IN_ID); return IDENTIFICATOR; }
    {INTEGER_LIT}        { return INTEGER_LITERAL; }
    "\""                 { yybegin(IN_STRING_LITERAL); return STRING_QUOTE; }
    "->"                 { return TYPE_SIGN; }
    "=>"                 { return ARROW_SIGN; }
    "="                  { return EQ_SIGN; }
    ":"                  { return COLON_SIGN; }
    "("                  { return LPAR; }
    ")"                  { return RPAR; }
    ","                  { return COMMA; }
    "["                  { return LBRACKET; }
    "]"                  { return RBRACKET; }
    "\\"                 { return BACKSLASH; }
    {PLACEHOLDER}        { return PLACEHOLDER; }
    {OPERATOR}           { return OPERATOR; }
    [^]                  { return BAD_CHARACTER; }
}

<IN_LINE_COMMENT, IN_DOC_COMMENT> {
    {EOL}           { yybegin(YYINITIAL); return EOL; }
}

<IN_LINE_COMMENT> {
    [^\n\r]+        { return LINE_COMMENT_TEXT; }
}

<IN_DOC_COMMENT> {
    [^\n\r]+        { return DOC_COMMENT_TEXT; }
}

<IN_ID> {
    {VARIDREGEXP}   { return IDENTIFICATOR; }
    "."             { return IDENTIFICATOR_SEP; }
    [^]             { yypushback(1); yybegin(IN_LINE); }
}

<IN_DIRECTIVE_START> {
    "lib"                { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "link"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "flag"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "include"            { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "hide"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "freeze"             { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "thaw"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "access"             { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "default"            { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "logging"            { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "dynamic"            { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "name"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "error_handlers"     { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "language"           { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "deprecated"         { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "fragile"            { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    "used"               { yybegin(IN_DIRECTIVE); return DIRECTIVE_TYPE; }
    [^]                  { yybegin(IN_LINE); return BAD_CHARACTER; }
}

<IN_DIRECTIVE> {
    {EOL}            { yybegin(YYINITIAL); return EOL; }
    {WHITE_SPACE}    { return WHITE_SPACE; }
    [^\n\r]+         { return DIRECTIVE_CONTENT; }
}

<IN_STRING_LITERAL> {
    {EOL}        { yybegin(YYINITIAL); return EOL; }
    "\""         { yybegin(IN_LINE); return STRING_QUOTE; }
    [^\n\r\"]+   { return STRING_CONTENT; }
}

<IN_OPEN> {
    [^]   { yypushback(1); yybegin(IN_LINE); return OPEN; }
}

<<EOF>>   {
          var l = handleClose(); return l;
      }