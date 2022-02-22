package dev.jamoo.eolian.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import generated.GeneratedParser
import generated.GeneratedTypes

class EolianParser : ParserDefinition {
    companion object {
        val COMMENT = TokenSet.create(GeneratedTypes.COMMENT)
        val FILE = IFileElementType(LANG_INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer {
        return EolianLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return GeneratedParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return super.getWhitespaceTokens()
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENT
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        TODO("Not yet implemented")
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return EolianFile(viewProvider)
    }
}