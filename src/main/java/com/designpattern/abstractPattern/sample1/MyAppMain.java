package com.designpattern.abstractPattern.sample1;

public class MyAppMain {
	public static void main(String[] args) {
		Client client = new Client(new Factory1());

		System.out.println(client.operation());
	}
}
