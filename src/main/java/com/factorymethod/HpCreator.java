package com.factorymethod;

import java.util.Date;

public class HpCreator extends ItemCreator {

	@Override protected void requestItemInfo() {
		System.out.println("데이터베이스에서 회복 물략의 정보를 가져옴");
	}

	@Override protected void createItemLog() {
		System.out.println("회복 물약을 새로 생성" + new Date());
	}

	@Override protected Item createItem() {
		return new HpPotion();
	}
}
