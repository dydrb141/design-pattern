package com.designpattern.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexObject {
	private List<Product> children = new ArrayList<>();

	public String getParts() {
		Iterator<Product> iterator = children.iterator();
		String str = "Complex Object made up of";

		while (iterator.hasNext()) {
			str += iterator.next().getName();
		}

		return str;
	}

	public boolean add(Product child) {
		return children.add(child);
	}

	public Iterator<Product> iterator() {
		return children.iterator();
	}
}
