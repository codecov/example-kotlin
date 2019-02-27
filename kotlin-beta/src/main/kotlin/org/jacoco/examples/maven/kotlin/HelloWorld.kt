package org.jacoco.examples.maven.kotlin

class HelloWorld {

	public fun getMessage(bigger : Boolean) : String {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
