package com.huangyu.visitor

interface IElement {
	fun accept(visitor: IVisitor)
	fun operation()
}

class ConcreteElementA(val name: String) : IElement {
	override fun accept(visitor: IVisitor) = visitor.visit(this)
	override fun operation() {
		println("$name")
	}
}

class ConcreteElementB(val name: String) : IElement {
	override fun accept(visitor: IVisitor) = visitor.visit(this)
	override fun operation() {
		println("$name")
	}
}

interface IVisitor {
	fun visit(elementA: ConcreteElementA)
	fun visit(elementB: ConcreteElementB)
}

class Visitor : IVisitor {
	override fun visit(elementA: ConcreteElementA) {
		elementA.operation()
	}

	override fun visit(elementB: ConcreteElementB) {
		elementB.operation()
	}
}