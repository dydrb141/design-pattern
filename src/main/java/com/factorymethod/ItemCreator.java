package com.factorymethod;

public  abstract class ItemCreator {
	public Item create() {
		Item item;

		requestItemInfo();
		item = createItem();
		createItemLog();

		return item;
	}

	abstract protected void requestItemInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();

}
