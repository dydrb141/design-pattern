package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FlyWeghitManager {
	Map<String, FlyWegiht> pool ;

	public FlyWeghitManager() {
		pool = new TreeMap<>();
	}

	public FlyWegiht getFlyWeghit (String key) {
		FlyWegiht flyWegiht = pool.get(key);

		if (flyWegiht == null) {
			flyWegiht = new FlyWegiht(key);
			pool.put(key, flyWegiht);
			System.out.println("새로생성 : " + key);
		} else {
			System.out.println("재사용 : " + key);
		}

		return flyWegiht;
	}
}
