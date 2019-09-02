package com.designpattern.abstractPattern.sample2;

public class Factory1 {
	public static Order createOrder() {
		System.out.println(" Order1 object created.");
		return new Order1();
	}

	public static Product createProduct() {
		System.out.println(" Product1 obejct created.");

		return new Product1();
	}
}
