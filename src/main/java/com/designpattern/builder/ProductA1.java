package com.designpattern.builder;

public class ProductA1 implements ProductA {
	@Override
	public String getCoupon() {
		return "ProductA1 Coupon";
	}

	@Override
	public String getName() {
		return "ProductA1";
	}
}
