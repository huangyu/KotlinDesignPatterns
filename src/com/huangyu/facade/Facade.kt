package com.huangyu.facade

class Facade {

	class SubSystemA {
		fun methodA() {}
	}

	class SubSystemB {
		fun methodB() {}
	}

	class SubSystemC {
		fun methodC() {}
	}

	val subSA: SubSystemA = SubSystemA()
	val subSB: SubSystemB = SubSystemB()
	val subSC: SubSystemC = SubSystemC()

	fun operation() {}

}