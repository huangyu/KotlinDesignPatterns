package com.huangyu.template

interface ITemplate {
	fun templateMethod(methodA: () -> Unit, methodB: () -> Unit, methodC: () -> Unit)
}

class Template : ITemplate {

	override fun templateMethod(methodA: () -> Unit, methodB: () -> Unit, methodC: () -> Unit) {
		methodA()
		methodB()
		methodC()
	}

}