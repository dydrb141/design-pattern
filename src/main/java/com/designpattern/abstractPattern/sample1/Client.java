package com.designpattern.abstractPattern.sample1;

public class Client {
	private ProductA productA;
	private ProductB productB;
	private AbstractFactory factory;

	public Client(AbstractFactory factory) {
		this.factory = factory;
	}

	public String operation() {
		System.out.println("Client : Delegating creating objects to a factory object.");
		productA = factory.createProductA();
		productB = factory.createProductB();

		return "Hello World from " + productA.getName() + " and " + productB.getName() + "!";
	}
}
