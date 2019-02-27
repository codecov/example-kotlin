package maven.kotlin.beta

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