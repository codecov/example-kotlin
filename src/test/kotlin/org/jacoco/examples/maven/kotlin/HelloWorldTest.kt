package org.jacoco.examples.maven.kotlin

import org.junit.Assert
import org.junit.Test

class HelloWorldTest {

    @Test
    fun testAssert() {
        Assert.assertEquals("Hello World!", HelloWorld().getMessage(false))
    }
}
