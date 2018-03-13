package com.huangyu.visitor

fun main(args: Array<String>) {
	val visitor = Visitor()
	visitor.visit(ConcreteElementA("ElementA"))
	visitor.visit(ConcreteElementB("ElementB"))
}