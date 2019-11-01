package com.starategy;

import com.dimond.Test1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test2 extends Test1 {
	public Test2() {
		super();
		this.field = "value";
		super.method();
	}

	public static void main(String[] args) {
		int a = 1;
		int b  = a;

		a = 4;
		//System.out.println(a);
		//System.out.println(b);

		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		Stream<String[]> temp = Arrays.stream(data);
		temp.flatMap(x -> Arrays.stream(x)).forEach(System.out::println);

		AtomicInteger integer = new AtomicInteger();



	}
}
