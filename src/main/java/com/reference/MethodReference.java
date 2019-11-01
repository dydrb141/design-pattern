package com.reference;

public class MethodReference {
	public static String convert(Integer number, Conversion function) {
		return function.convert(number);
	}

	public static void main(String[] args) {
		//람다로 넘길 수 있다.
		MethodReference.convert(100, (number) -> String.valueOf(number));
		//valueOf() 메소드가 Integer를 받고 String을 반환하는 조건에 일치
		//따라서 메소드 참조로 대체할 수 있다.
		MethodReference.convert(100, String::valueOf);
	}

}

@FunctionalInterface
interface Conversion {
	String convert(Integer number);
}