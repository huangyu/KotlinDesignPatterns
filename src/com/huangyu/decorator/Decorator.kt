package com.huangyu.decorator

class Decorator {
	class Component {
		fun operation() {
			println("operation")
		}
	}

	fun Component.decorate(method: Component.() -> Unit) {
		println("do before")
		method()
		println("do after")
	}

	fun testDecorate() {
		Component().run {
			decorate {
				operation()
			}
		}
	}
}