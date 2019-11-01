package com.designpattern.composite;

import java.util.concurrent.atomic.AtomicInteger;

public class NikeFootballShoes implements FootballEquipment {
	private int price;

	public NikeFootballShoes(int price) {
		this.price = price;
	}

	@Override public int price() {
		return price;
	}
}

class KneeGuard implements FootballEquipment {
	int price;

	public KneeGuard(int price) {
		this.price = price;
	}

	@Override public int price() {
		return price;
	}
}

class HearBand implements FootballEquipment {
	int price;

	public HearBand(int price) {
		this.price = price;
	}

	@Override public int price() {
		return price;
	}
}
