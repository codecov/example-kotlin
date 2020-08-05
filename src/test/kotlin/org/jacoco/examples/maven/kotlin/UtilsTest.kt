package org.jacoco.examples.maven.kotlin

import org.junit.Assert
import org.junit.Test

class UtilsTest {

    @Test
    fun testFoo() {
        Assert.assertEquals("bar", foo())
    }

    @Test
    fun testDoubleLen() {
        Assert.assertEquals(12, "length".doubleLen)
    }

    @Test
    fun testDoubleStr() {
        Assert.assertEquals("4242", 42.doubleStr)
    }

    @Test
    fun testBar1() {
        Assert.assertEquals("negative!", bar(-100.31))
    }

    @Test
    fun testBar2() {
        Assert.assertEquals("positive!", bar(1.23))
    }

    @Test
    fun testBar3() {
        Assert.assertEquals("flat zero!", bar(0.0))
    }

    @Test
    fun testBar4() {
        Assert.assertEquals("flat zero!", bar(-0.0))
    }

    @Test
    fun testMyFun() {
        Assert.assertEquals("33", myFun())
    }
}
