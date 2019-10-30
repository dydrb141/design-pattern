package com.designpattern.strategy;

public class Soccer {
	private Shoot shoot;

	public void setShoot(Shoot shoot) {
		this.shoot = shoot;
	}

	public void shooting() {
		System.out.println(shoot.shoot());
	}

}
