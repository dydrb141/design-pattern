package com.designpattern.observer;

import com.designpattern.utils.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class FootballPlayer extends FootballPlayerManager {
	ConcurrentHashMap<String, BigDecimal> map = new ConcurrentHashMap<>();

	public void addPlayer(String name, BigDecimal salary) {
		map.put(name, salary);
		notifyObservers();
	}

	public Map<String, BigDecimal> getTopThreeFootballPlayer() {
		return map
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		        //collection 만들어 줄때 순서를 보장하는 LinkedHashMapd을 사용해줘야 원하는 순서를 보장해서 넘겨줌
		        //HashSet으로 받으면 오더링 하는 이유가 없이 순서를 보장하지 않음
	}


	public BigDecimal getFootballPlaySalary(String name) {
		if (StringUtils.isEmpty(name)) {
			return new BigDecimal(0);
		}

		return Objects.isNull(map.get(name)) ? new BigDecimal(0) : map.get(name);
	}


}
