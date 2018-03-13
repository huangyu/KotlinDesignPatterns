package com.huangyu.strategy

class Strategy(inline val method: () -> Unit) {
	fun algorithm() {
		method()
	}
}