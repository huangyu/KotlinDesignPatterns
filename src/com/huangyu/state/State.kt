package com.huangyu.state

sealed class State(val name: String) {
	abstract fun handle()
	class ConcreteStateA : State(name = "StateA") {
		override fun handle() {
			println("$name")
		}
	}

	class ConcreteStateB : State(name = "StateB") {
		override fun handle() {
			println("$name")
		}
	}
}

class Context {
	private var state: State = State.ConcreteStateA()

	val name: String get() = state.name

	fun request() {
		state.handle()
	}

	fun setState(state: State) {
		this.state = state
	}
}