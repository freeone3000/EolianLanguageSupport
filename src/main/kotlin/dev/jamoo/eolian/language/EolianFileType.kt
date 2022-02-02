package dev.jamoo.eolian.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class EolianFileType : LanguageFileType(LANG_INSTANCE) {
    companion object {
        @Suppress("unused") // used in plugin configuration
        @JvmStatic
        val INSTANCE = EolianFileType()
    }

    override fun getName() : String {
        return "Eolian"
    }

    override fun getDescription() : String {
        return "Eolian template for Enlightenment UI widgets"
    }

    override fun getDefaultExtension(): String {
        return "eo"
    }

    override fun getIcon(): Icon {
        return EOLIAN_ICON
    }
}