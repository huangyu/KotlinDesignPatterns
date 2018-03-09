package com.huangyu.factory

class SimpleFactory {

	abstract class AProduct(val name: String)

	class ProductA : AProduct("ProductA")
	class ProductB : AProduct("ProductB")

	interface IFactory {
		fun makeProduct(name: String): AProduct?
	}

	class Factory : IFactory {
		override fun makeProduct(name: String): AProduct? {
			when (name) {
				"A" -> return ProductA()
				"B" -> return ProductB()
				else -> return null
			}
		}
	}

}