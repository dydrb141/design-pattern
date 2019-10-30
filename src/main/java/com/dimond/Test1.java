package com.dimond;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {
	protected String field;

	static Map<String, String> map = new ConcurrentHashMap<>();
	protected Test1() {

	}
	protected void method() {

		System.out.println("ststst");


	}

	public static void main(String[] args) {
		map.put("teszt", "Test");
	}
}
