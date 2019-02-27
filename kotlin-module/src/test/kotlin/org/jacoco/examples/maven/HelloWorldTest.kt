package org.jacoco.examples.maven

import junit.framework.TestCase
import org.jacoco.examples.maven.HelloWorld

//import kotlin.test.assertEquals

class HelloWorldTest : TestCase() {

	fun testAssert() : Unit {
		assertEquals("Hello World!", HelloWorld().getMessage(false))
	}

	fun testAssertTrue() : Unit {
		assertEquals("Hello Universe!", HelloWorld().getMessage(true))
	}
}
