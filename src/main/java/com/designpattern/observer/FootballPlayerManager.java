package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class FootballPlayerManager {
	List<FootballPalyerObserver> observers = new ArrayList<>();
	
	public void attach(FootballPalyerObserver observer) {
		observers.add(observer);
	}
	
	public void detach(FootballPalyerObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (FootballPalyerObserver observer : observers) {
			observer.footballPlayerUpdate();
		}
	}

}
