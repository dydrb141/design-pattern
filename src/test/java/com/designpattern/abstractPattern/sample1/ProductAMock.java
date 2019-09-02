package com.designpattern.abstractPattern.sample1;

public class ProductAMock implements ProductA{
	@Override public String getName() {
		return "ProductAMock";
	}
}

class ProductBMock implements ProductB {
	@Override public String getName() {
		return "ProductBMock";
	}
}
