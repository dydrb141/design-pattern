package com.designpattern.decorator;

public abstract class DisplayDecorator extends FootballEquipment {
	private FootballEquipment footballEquipment;

	public DisplayDecorator(FootballEquipment footballEquipment) {
		this.footballEquipment = footballEquipment;
	}

	@Override
	public void footballEquipment() {
		footballEquipment.footballEquipment();
	}
}
