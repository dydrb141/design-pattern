package com.dimond;

public interface GodFather {
	default void myFather() {
		System.out.println("GrandFather");
	}
}

interface FatherA extends GodFather {
	@Override
	default void myFather() {
		System.out.println("FatherA");
	}
}

interface FatherB extends GodFather {
	@Override
	default void myFather() {
		System.out.println("FatherB");
	}
}

interface Son extends FatherA, FatherB {

	@Override default void myFather() {
		//super.
	}
}

interface A {
	default void hello() {
		System.out.println("helloA");
	}
}

interface B extends A {
	default void hello() {
		System.out.println("helloB");
	}
}

class C implements A, B {
	private String l;

	public C(){

	}
	public C(String c) {
		this(c, c);

		this.l = c;
	}

	public C(String e, String f) {

	}
	public static void main(String[] args) {
		C c = new C();
		c.hello();
	}
}

