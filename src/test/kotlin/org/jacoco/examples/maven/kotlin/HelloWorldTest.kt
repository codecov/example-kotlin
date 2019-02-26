package org.jacoco.examples.maven.kotlin

import junit.framework.TestCase
import kotlin.test.assertEquals

class HelloWorldTest : TestCase() {

	fun testAssert() : Unit {
		assertEquals("Hello World!", HelloWorld().getMessage(false))
	}

	fun testAssert() : Unit {
		assertEquals("Hello World!", HelloWorld().getMessage(true))
	}
}
