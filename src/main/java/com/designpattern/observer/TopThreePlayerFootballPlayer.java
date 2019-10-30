package com.designpattern.observer;
import java.math.BigDecimal;
import java.util.Map;

public class TopThreePlayerFootballPlayer implements FootballPalyerObserver {
	private FootballPlayer footballPlayer;

	public TopThreePlayerFootballPlayer(FootballPlayer footballPlayer) {
		this.footballPlayer = footballPlayer;
	}

	@Override
	public void footballPlayerUpdate() {
		printMyTeamTopPlayer(footballPlayer.getTopThreeFootballPlayer());

	}

	public void printMyTeamTopPlayer(Map<String, BigDecimal> myTeamTopPlayers) {
		System.out.println("--------------------------------------------");
		myTeamTopPlayers.keySet().forEach(System.out::println);
	}
}
