package com.hunagyu.factory

class AbstractFactory {

	abstract class AProductA(val name: String)

	class ProductA1 : AProductA("ProductA1")
	class ProductA2 : AProductA("ProductA2")

	abstract class AProductB(val name: String)

	class ProductB1 : AProductB("ProductB1")
	class ProductB2 : AProductB("ProductB2")

	interface IFactory {
		fun makeProductA(): AProductA
		fun makeProductB(): AProductB
	}

	class FactoryA : IFactory {
		override fun makeProductA() = ProductA1()
		override fun makeProductB() = ProductB1()
	}

	class FactoryB : IFactory {
		override fun makeProductA() = ProductA2()
		override fun makeProductB() = ProductB2()
	}

}