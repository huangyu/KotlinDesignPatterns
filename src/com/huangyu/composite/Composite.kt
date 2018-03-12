package com.huangyu.component

abstract class Component {
	abstract fun operation()
}

class Composite : Component() {
	val list: MutableList<Component> = mutableListOf()
	override fun operation() {}
	fun getChild(position: Int) {
		list.get(position)
	}

	fun addChild(c: Component) {
		list.add(c)
	}

	fun removeChild(c: Component) {
		list.remove(c)
	}
}

class Leaf : Component() {
	override fun operation() {
		// TODO
	}
}