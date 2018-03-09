package com.huangyu.prototype

class Prototype {

	data class Product(var name:String) {}
	
	val prototype = Product("product")
	
	// Shallow copy
	val product = prototype.copy()

}