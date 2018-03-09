package com.huangyu.adapter

interface Target {
	fun request()
}

class Adaptee {
	fun ask() {
		println("ask")
	}
}

class Adapter(val adaptee: Adaptee) : Target {
	override fun request() {
		adaptee.ask()
	}
}