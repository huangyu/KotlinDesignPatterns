package com.huangyu.momento

data class Memento(var state: String?)

data class Originator(var state: String?) {
	fun save() = Memento(this.state)

	fun restore(memento: Memento?) {
		this.state = memento?.state
	}
}

data class Caretaker(var memento: Memento?)
	
