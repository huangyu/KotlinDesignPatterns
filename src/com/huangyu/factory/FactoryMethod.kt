package com.hunagyu.factory

class FactoryMethod {

	abstract class AProduct(val name: String)

	class ProductA : AProduct("ProductA")
	class ProductB : AProduct("ProductB")

	interface IFactory {
		fun makeProduct(): AProduct
	}

	class FactoryA : IFactory {
		override fun makeProduct() = ProductA()
	}

	class FactoryB : IFactory {
		override fun makeProduct() = ProductB()
	}

}
