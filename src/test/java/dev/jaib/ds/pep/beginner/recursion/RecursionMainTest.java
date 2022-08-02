package dev.jaib.ds.pep.beginner.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionMainTest
{
	@Test
	public void maxOfArray()
	{
		int[] arr = {15, 30, 40, 4, 11, 9};
		assertEquals(40, RecursionMain.maxOfArray(arr, 0));
	}

	@Test
	public void firstIndex()
	{
		int[] arr = {15, 30, 40, 4, 11, 9, 4, 11};
		assertEquals(3, RecursionMain.firstIndex(arr, 0, 4));
		assertEquals(4, RecursionMain.firstIndex(arr, 0, 11));
		assertEquals(-1, RecursionMain.firstIndex(arr, 0, 1));
	}

	@Test
	public void lastIndex()
	{
		int[] arr = {15, 30, 40, 4, 11, 9, 4, 11};
		assertEquals(6, RecursionMain.lastIndex(arr, 0, 4));
		assertEquals(7, RecursionMain.lastIndex(arr, 0, 11));
		assertEquals(-1, RecursionMain.lastIndex(arr, 0, 1));
	}
}
