package com.designpattern.templateMethod;

public class Main {
	public static void main(String[] args) {
		Soccer chong = new ChongalShoot();
		Soccer dock = new DocksuriShoot();

		chong.longPassAndKneeTrappingAfterShoot();
		dock.shortPassAndchestTrappingAfterShoot();
	}


}
