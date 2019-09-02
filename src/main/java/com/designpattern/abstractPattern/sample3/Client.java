package com.designpattern.abstractPattern.sample3;



public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getInstance();

		System.out.println("Creating a family of objects:");

		factory.createProductA();
		factory.createProductB();

		System.out.println("Family of objects created.");
	}
}
