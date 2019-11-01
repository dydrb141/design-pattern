package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class FootballEquipmentPrice implements  FootballEquipment {
	List<FootballEquipment> equipmentList = new ArrayList<>();

	public void addFootbalEquipment(FootballEquipment equipment) {
		equipmentList.add(equipment);
	}

	@Override
	public int price() {
		int price = 0;

		for (FootballEquipment footballEquipment : equipmentList) {
			price += footballEquipment.price();
		}

		return price;
	}
}
