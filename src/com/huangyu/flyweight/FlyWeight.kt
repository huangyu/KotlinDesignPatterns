package com.huangyu.flyweight

abstract class AFlyWeight {
	abstract fun operation()
}

class ConcreteFlyWeight : AFlyWeight() {
	override fun operation() {
		println("ConcreteFlyWeight")
	}
}

class UnsharedFlyWeight : AFlyWeight() {
	override fun operation() {
		println("UnsharedFlyWeight")
	}
}

enum class FlyWeight {
	CONCRETE, UNSHARED
}

class FlyWeightFactory {
	private val map: HashMap<FlyWeight, AFlyWeight> = HashMap()

	init {
		map.put(FlyWeight.CONCRETE, ConcreteFlyWeight())
		map.put(FlyWeight.UNSHARED, UnsharedFlyWeight())
	}

	fun getFlyWeight(key: FlyWeight): AFlyWeight {
		return map.getValue(key)
	}
}