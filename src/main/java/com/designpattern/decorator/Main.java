package com.designpattern.decorator;

public class Main {
	public static void main(String[] args) {
		FootballEquipment equipment = new FootballPlayer(); //기본 몸뚱아리
		equipment.footballEquipment();

		FootballEquipment equipment1 = new NikeGuard(new FootballPlayer()); //몸뚱아리 + 나이키 정강이 보호대 장착
		equipment1.footballEquipment();

		FootballEquipment equipment2 = new NikeFootballShoes(new NikeGuard(new FootballPlayer())); //몸뚱아리 + 나이키 정강이 보호대 장착  + 나이키 축구화 장착
		equipment2.footballEquipment();
	}
}
