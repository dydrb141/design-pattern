package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class FootballPlayerManager {
	List<FootballPlayerObserver> observers = new ArrayList<>();
	
	public void attach(FootballPlayerObserver observer) {
		observers.add(observer);
	}
	
	public void detach(FootballPlayerObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (FootballPlayerObserver observer : observers) {
			observer.footballPlayerUpdate();
		}
	}

}
