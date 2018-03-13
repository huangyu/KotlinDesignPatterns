package com.huangyu.strategy

class Strategy(inline val method: () -> Any) {
	fun algorithm() {
		method()
	}
}