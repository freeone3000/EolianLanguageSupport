package generated;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;
%%

%{
  public _EolianLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _EolianLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "any"              { return ANY; }
  "error"            { return ERROR; }


}

[^] { return BAD_CHARACTER; }
