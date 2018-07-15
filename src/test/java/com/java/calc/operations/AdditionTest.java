package com.java.calc.operations;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTest {

	Operation opr = null;

	private int[] operands;
	private int result;

	public AdditionTest(int result, int... operands) {

		if (operands.length == 0)
			this.operands = null;
		else
			this.operands = operands;

		this.result = result;
	}

	@Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { 29, new int[] { 2, 3, 4, 9, 11 } }, { 6, new int[] { 3, 3 } },
				{ 32, new int[] { 4, 3, 4, 4, 7, 10 } } });
	}

	@Before
	public void createOperationObj() {
		opr = new Operation();
	}

	@After
	public void makeOperationObjNull() {
		opr = null;
	}

	@Test
	public void testAdd() {
		assertEquals("testing addition: ", result, opr.add(operands));
	}

}
