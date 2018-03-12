package com.huangyu.bridge

class Bridge {

	interface Implemetor {
		fun operationImpl()
	}

	class ConcreteImplemetorA : Implemetor {
		override fun operationImpl() {
			println("ConcreteImplemetorA")
		}
	}

	class ConcreteImplemetorB : Implemetor {
		override fun operationImpl() {
			println("ConcreteImplemetorB")
		}
	}

	abstract class Abstraction(val impl: Implemetor) {
		abstract fun operation()
	}

	class RefinedAbstraction : Abstraction(impl = ConcreteImplemetorA()) {
		override fun operation() {
			impl.operationImpl()
		}
	}

}