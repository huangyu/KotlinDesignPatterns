package com.huangyu.builder

class Product(val name: String?, val num: Int) {
	private constructor(builder: Builder) : this(builder.name, builder.num)

	class Builder(var name: String? = null, var num: Int = 0) {
		fun build() = Product(this)
	}

	companion object {
		inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
	}
}

