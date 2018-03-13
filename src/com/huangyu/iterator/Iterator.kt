package com.huangyu.iterator

interface Aggretate<T> {
	val iterator: Iterator<T>
}

class ConcreteAggretate(val words: List<String>) : Aggretate<String> {
	override val iterator = words.iterator()
}

operator fun ConcreteAggretate.iterator(): Iterator<String> = words.iterator()
