package com.designpattern.abstractPattern.sample2;

public class Client {
	public static void main(String[] args) {
		System.out.println("Crateing an order object:");
		Factory1.createOrder();

		System.out.println("Createing a product object:");
		Factory1.createProduct();
	}
}
