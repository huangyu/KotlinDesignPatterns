package com.huangyu.mediator

interface IMediator {
	fun register(colleagur: AColleague)
	fun operation(i: Int)
}

class Mediator : IMediator {
	var colleagues: MutableList<AColleague> = mutableListOf()

	override fun register(colleagur: AColleague) {
		colleagues.add(colleagur)
	}

	override fun operation(i: Int) {
		colleagues.get(i).operation()
	}
}

abstract class AColleague(val mediator: IMediator) {
	abstract fun selfMethod()
	abstract fun communicate(i: Int)
	abstract fun operation()
}

class ConcreteColleague(val name: String, mediator: IMediator) : AColleague(mediator) {
	override fun selfMethod() {}

	override fun communicate(i: Int) {
		mediator.operation(i)
	}

	override fun operation() {
		println(name + "operation")
	}
}