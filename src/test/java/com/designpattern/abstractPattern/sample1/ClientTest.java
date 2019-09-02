package com.designpattern.abstractPattern.sample1;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class ClientTest extends TestCase {
	Client client = new Client(new FactoryMock());

	public void testOperation() {
		assertEquals("Hello World from ProductAMock and ProductBMock!", client.operation());
	}

}