package com.designpattern.templateMethod;

public abstract class Soccer {
	public String longPass() {
		return "LongPass";
	}

	public String shortPass() {
		return "ShortPass";
	}

	public String kneeTrapping() {
		return "kneeTrapping";
	}

	public String chestTrapping() {
		return "chestTrapping";
	}

	public void longPassAndKneeTrappingAfterShoot() {
		System.out.println(this.longPass());
		System.out.println(this.kneeTrapping());
		System.out.println(this.shoot());
	}

	public void shortPassAndchestTrappingAfterShoot() {
		System.out.println(this.shortPass());
		System.out.println(this.chestTrapping());
		System.out.println(this.shoot());
	}

	abstract String shoot();
}
