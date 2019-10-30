package com.designpattern.singleton;

public class SoccerCoach {
	public static SoccerCoach SOCCER_COACH = null;

	private SoccerCoach() {
	}

	public static SoccerCoach getInstance() {
		if (SOCCER_COACH == null) {
			SOCCER_COACH = new SoccerCoach();
		}

		return SOCCER_COACH;
	}
}
