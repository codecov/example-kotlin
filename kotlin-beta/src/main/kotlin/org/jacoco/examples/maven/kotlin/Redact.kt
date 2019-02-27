package org.jacoco.examples.maven.kotlin

data class Redact(
        val pii: String
) {
    override fun toString(): String {
        return super.toString().replace(pii, "<redacted>")
    }

    fun toJson(): String {
        return pii
    }
}