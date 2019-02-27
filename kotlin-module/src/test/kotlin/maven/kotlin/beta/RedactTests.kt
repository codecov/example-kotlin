package maven.kotlin.beta

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RedactTests {
    val secret = "secret"
    val redact = Redact(secret)

    @Test fun value() {
        assertEquals(secret, redact.pii)
    }

    @Test fun string() {
       val s = "$redact"
       assertFalse(s.contains(secret), "$s shouldn't contain $secret")
    }

    @Test fun json() {
       val s = redact.toJson()
       assertTrue(s.contains(secret), "$s should contain $secret")
    }


}