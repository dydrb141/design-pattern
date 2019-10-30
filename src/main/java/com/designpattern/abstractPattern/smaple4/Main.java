package com.designpattern.abstractPattern.smaple4;

public class Main {
	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getBody());
		System.out.println(wheel.getWheel());
	}
}

