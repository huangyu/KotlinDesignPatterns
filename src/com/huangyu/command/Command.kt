package com.huangyu.command

class Command {

	interface ICommand {
		fun request()
	}

	class ConcreteCommand : ICommand {
		val receiver: Receiver = Receiver()

		override fun request() {
			receiver.action()
		}
	}

	class Invoker {
		var command: ICommand = ConcreteCommand()

		fun call() {
			command.request()
		}
	}

	class Receiver {
		fun action() {
			println("Receiver do action")
		}
	}

}