package com.designpattern.decorator;

public class NikeGuard extends DisplayDecorator {
	public NikeGuard(FootballEquipment footballEquipment) {
		super(footballEquipment);
	}

	@Override
	public void footballEquipment() {
		super.footballEquipment();
		addNikeGuard();
	}

	private void addNikeGuard() {
		System.out.println("나이키 정강이 보호대 장착");
	}
}

class NikeFootballShoes extends DisplayDecorator {
	public NikeFootballShoes(FootballEquipment footballEquipment) {
		super(footballEquipment);
	}

	@Override
	public void footballEquipment() {
		super.footballEquipment();
		addNikeShoes();
	}

	private void addNikeShoes() {
		System.out.println("나이키 축구화 장착");
	}
}
