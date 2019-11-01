package com.designpattern.composite;

public class Main {
	public static void main(String[] args) {
		NikeFootballShoes nikeFootballShoes = new NikeFootballShoes(300000);
		HearBand hearBand = new HearBand(2000);
		KneeGuard kneeGuard = new KneeGuard(10000);

		FootballEquipmentPrice footballEquipmentPrice = new FootballEquipmentPrice();
		footballEquipmentPrice.addFootbalEquipment(nikeFootballShoes);
		footballEquipmentPrice.addFootbalEquipment(hearBand);
		footballEquipmentPrice.addFootbalEquipment(kneeGuard);

		System.out.println(footballEquipmentPrice.price());

	}
}
