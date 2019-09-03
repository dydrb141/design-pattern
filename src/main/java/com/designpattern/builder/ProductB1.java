package com.designpattern.builder;

public class ProductB1 implements ProductB {
	@Override public String getCoupon() {
		return "ProductB1 Coupon";
	}

	@Override public String getName() {
		return "ProductB1";
	}
}
