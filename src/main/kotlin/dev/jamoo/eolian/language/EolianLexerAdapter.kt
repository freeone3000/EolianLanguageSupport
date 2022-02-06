package dev.jamoo.eolian.language

import com.intellij.lexer.FlexAdapter

class EolianLexerAdapter : FlexAdapter(EolianLexer(null))