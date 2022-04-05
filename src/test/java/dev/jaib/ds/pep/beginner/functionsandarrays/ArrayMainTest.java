package dev.jaib.ds.pep.beginner.functionsandarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMainTest
{
	@Test
	public void spanOfAnArrayTest()
	{
		assertEquals(4, ArrayMain.spanOfAnArray(new int[]{ 1, 2, 3, 4, 5}));
	}

	@Test
	public void findElementIndexTest()
	{
		assertEquals(-1, ArrayMain.findElementIndex(new int[]{ 1, 2, 3, 4, 5}, 8));
		assertEquals(0, ArrayMain.findElementIndex(new int[]{ 1, 2, 3, 4, 5}, 1));
	}

	@Test
	public void sumOfTwoArrayTest()
	{
		assertArrayEquals(new int[]{1, 4, 2, 1, 8, 6}, ArrayMain.sumOfTwoArray(new int[]{ 3, 1, 0, 7, 5}, new int[]{ 1, 1, 1, 1, 1, 1}));
	}
}
