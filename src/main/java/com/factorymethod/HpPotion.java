package com.factorymethod;

public class HpPotion implements Item {
	@Override public void use() {
		System.out.println("체력회복");
	}
}
