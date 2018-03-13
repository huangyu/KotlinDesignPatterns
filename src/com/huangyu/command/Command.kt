package com.huangyu.command

interface ICommand {
	fun request()
}

class Command : ICommand {
	val receiver: Receiver = Receiver()

	override fun request() {
		receiver.action()
	}
}

class Invoker {
	var command: ICommand = Command()

	fun call() {
		command.request()
	}
}

class Receiver {
	fun action() {
		println("Receiver do action")
	}
}

