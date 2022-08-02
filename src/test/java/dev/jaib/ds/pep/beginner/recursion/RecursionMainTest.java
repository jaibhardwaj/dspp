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
}
