package dev.jamoo.eolian.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class EolianFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, LANG_INSTANCE) {
    override fun getFileType(): FileType {
        return EolianFileType.INSTANCE
    }

    override fun toString(): String {
        return "Eolian File"
    }
}