package com.huangyu.proxy

interface ISubject {
	fun request()
}

class RealSubject : ISubject {
	override fun request() {}
}

class Proxy : ISubject {
	private val subject = RealSubject()

	fun preRequest() {}
	fun postRequest() {}

	override fun request() {
		preRequest()
		subject.request()
		postRequest()
	}
}