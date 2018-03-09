package com.huangyu.builder

fun main(args: Array<String>) {

	val product = Builder.Product.buildProduct {
		name = "name"
		num = 1
	}
	
	println(product.name);
	println(product.num);

}