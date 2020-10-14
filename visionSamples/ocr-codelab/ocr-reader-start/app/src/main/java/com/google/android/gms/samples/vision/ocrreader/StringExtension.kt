package com.google.android.gms.samples.vision.ocrreader

import java.util.regex.Matcher
import java.util.regex.Pattern

object StringExtension {

    fun extractDigits(text : String?): String {
        if (text == null) {
            return ""
        }
        val p: Pattern = Pattern.compile("(\\d{6})")
        val m: Matcher = p.matcher(text)
        return if (m.find()) {
            m.group(0)
        } else ""
    }
}