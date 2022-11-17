package dev.jaib.ds.pep.beginner.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoStackInAnArrayTest
{

	@Test
	public void twoStackInAnArrayTest()
	{
		TwoStackInAnArray twoStackInAnArray = new TwoStackInAnArray(10);

		twoStackInAnArray.push1(1);
		twoStackInAnArray.push1(2);
		twoStackInAnArray.push1(3);
		twoStackInAnArray.push1(4);
		twoStackInAnArray.push1(5);
		twoStackInAnArray.push1(6);

		twoStackInAnArray.push2(8);
		twoStackInAnArray.push2(9);
		twoStackInAnArray.push2(10);

		assertEquals(6, twoStackInAnArray.size1());
		assertEquals(3, twoStackInAnArray.size2());

		assertEquals(6, twoStackInAnArray.top1());
		assertEquals(10, twoStackInAnArray.top2());

		assertEquals(6, twoStackInAnArray.pop1());
		assertEquals(10, twoStackInAnArray.pop2());
	}
}