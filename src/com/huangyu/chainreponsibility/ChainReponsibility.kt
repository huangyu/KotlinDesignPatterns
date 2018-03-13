package com.huangyu.chainreponsibility

class ChainReponsibility {

	interface Handler {
		var next: Handler?
		fun doHandle()
	}

	class ConcreteHandlerA() : Handler {
		override var next: Handler? = ConcreteHandlerB()
		override fun doHandle() {}
	}

	class ConcreteHandlerB() : Handler {
		override var next: Handler? = ConcreteHandlerC()
		override fun doHandle() {}
	}

	class ConcreteHandlerC() : Handler {
		override var next: Handler? = null
		override fun doHandle() {}
	}

}