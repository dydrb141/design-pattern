package com.designpattern.singleton;

public class SoccerCoarchLazyHolder {
	private SoccerCoarchLazyHolder() {
	}

	public static SoccerCoarchLazyHolder getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final SoccerCoarchLazyHolder INSTANCE = new SoccerCoarchLazyHolder();
	}
}
