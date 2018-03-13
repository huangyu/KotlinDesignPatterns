package com.huangyu.observer

import kotlin.properties.Delegates

interface IObserver {
	fun update(state: String)
}

class Obeserver : IObserver {
	override fun update(state: String) {
		println(state)
	}
}

class Observable {
	var observers: MutableList<IObserver> = mutableListOf()

	fun attach(observer: IObserver) {
		observers.add(observer)
	}

	fun detach(observer: IObserver) {
		observers.remove(observer)
	}

	var state: String by Delegates.observable("0") {
		prop, old, new ->
		for (observer in observers) {
			observer.update("$old -> $new")
		}
	}
}