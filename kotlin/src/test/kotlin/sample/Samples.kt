package sample

operator fun <T> Sample<T, *>.component1(): T = input

operator fun <T> Sample<*, T>.component2(): T = output

operator fun Sample<*, *>.component3(): String = message
