package com.designpattern.builder;

public interface Builder {
	void buildPartA();
	void buildPartB();
	ComplexObject getResult();
}
