package dev.jaib.ds.pep.beginner.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionMainTest
{
	@Test
	public void maxOfArrayTest()
	{
		int[] arr = {15, 30, 40, 4, 11, 9};
		assertEquals(40, RecursionMain.maxOfArray(arr, 0));
	}

	@Test
	public void firstIndexTest()
	{
		int[] arr = {15, 30, 40, 4, 11, 9, 4, 11};
		assertEquals(3, RecursionMain.firstIndex(arr, 0, 4));
		assertEquals(4, RecursionMain.firstIndex(arr, 0, 11));
		assertEquals(-1, RecursionMain.firstIndex(arr, 0, 1));
	}

	@Test
	public void lastIndexTest()
	{
		int[] arr = {15, 30, 40, 4, 11, 9, 4, 11};
		assertEquals(6, RecursionMain.lastIndex(arr, 0, 4));
		assertEquals(7, RecursionMain.lastIndex(arr, 0, 11));
		assertEquals(-1, RecursionMain.lastIndex(arr, 0, 1));
	}

	@Test
	public void allIndicesTest()
	{
		int[] arr = {15, 30, 40, 4, 11, 9, 4, 11};
		assertArrayEquals(new int[]{3, 6}, RecursionMain.allIndices(arr, 4, 0, 0));
		assertArrayEquals(new int[]{4, 7}, RecursionMain.allIndices(arr, 11, 0, 0));
		assertArrayEquals(new int[]{}, RecursionMain.allIndices(arr, 1, 0, 0));
	}

	@Test
	public void getSubsequenceTest()
	{
		String[] arr = {"", "c", "b", "bc", "a", "ac", "ab", "abc"};
		assertArrayEquals(arr, RecursionMain.getSubsequence("abc").toArray());
	}

	@Test
	public void getKPCTest()
	{
		String[] arr = {"vt", "wt", "xt", "vu", "wu", "xu"};
		assertArrayEquals(arr, RecursionMain.getKPC("78").toArray());
	}

	@Test
	public void ggetStairPathsTest()
	{
		int stairs3 = 3;
		String[] arr3 = {"111", "12", "21", "3"};
		assertArrayEquals(arr3, RecursionMain.getStairPaths(stairs3).toArray());

		int stairs4 = 4;
		String[] arr4 = {"1111", "112", "121", "13", "211", "22", "31"};
		assertArrayEquals(arr4, RecursionMain.getStairPaths(stairs4).toArray());
	}


}
