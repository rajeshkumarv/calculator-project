package com.java.calc.operations;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {
	Operation opr = null;

	@Before
	public void createOperationObj() {
		opr = new Operation();
	}

	@Test
	public void add() {
		assertEquals(7, opr.add(5,2));
	}
}
