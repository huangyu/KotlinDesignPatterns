package com.huangyu.interpreter

class Interpreter {

	class Context {
		fun assign() {}
		fun lookup() {}

		val map: Map<String, String> = mapOf()
	}

	interface Expression {
		fun interpret()
	}

	class TerminalExpression : Expression {
		override fun interpret() {}
	}

	class NoneTerminalExpression : Expression {
		override fun interpret() {}
	}

}