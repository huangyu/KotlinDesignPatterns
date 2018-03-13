package com.huangyu.momento

fun main(args: Array<String>) {
	val caretaker = Caretaker(null)
	val originator = Originator("State1")
	println("init state: " + originator.state)
	caretaker.memento = originator.save()
	originator.state = "State2"
	println("current state: " + originator.state)
	originator.restore(caretaker.memento)
	println("restore state: " + originator.state)
}