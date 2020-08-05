package org.jacoco.examples.maven.kotlin

fun foo(): String {
    return "bar"
}

val String.doubleLen: Int
    get() = 2 * length

val Int.doubleStr: String
    get() = toString() + toString()

fun bar(x: Double): String {
    if (x < 0.0) {
        return "negative!"
    }
    if (x > 0.0) {
        return "positive!"
    }
    return "flat zero!"
}

fun myFun(): String {
    fun myInnerFun(): Double {
        return 3.14
    }
    return myInnerFun().toInt().doubleStr
}
