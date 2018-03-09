package com.huangyu.factory

import com.hunagyu.factory.FactoryMethod
import com.hunagyu.factory.AbstractFactory

fun main(args: Array<String>) {
	println("SimpleFactory")
	println(SimpleFactory.Factory().makeProduct("A")?.name)
	println(SimpleFactory.Factory().makeProduct("B")?.name)
	
	println("FactoryMethod")
	println(FactoryMethod.FactoryA().makeProduct().name)
	println(FactoryMethod.FactoryB().makeProduct().name)
	
	println("AbstractFactory")
	println(AbstractFactory.FactoryA().makeProductA().name)
	println(AbstractFactory.FactoryA().makeProductB().name)
	println(AbstractFactory.FactoryB().makeProductA().name)
	println(AbstractFactory.FactoryB().makeProductB().name)
}
