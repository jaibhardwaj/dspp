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
	public void getStairPathsTest()
	{
		int stairs3 = 3;
		String[] arr3 = {"111", "12", "21", "3"};
		assertArrayEquals(arr3, RecursionMain.getStairPaths(stairs3).toArray());

		int stairs4 = 4;
		String[] arr4 = {"1111", "112", "121", "13", "211", "22", "31"};
		assertArrayEquals(arr4, RecursionMain.getStairPaths(stairs4).toArray());
	}

	@Test
	public void getMazePathsTest()
	{
		String[] arr3 = {"hhvv", "hvhv", "hvvh", "vhhv", "vhvh", "vvhh"};
		assertArrayEquals(arr3, RecursionMain.getMazePaths(1, 1, 3, 3).toArray());
	}

	@Test
	public void getMazePathWIthJumpsTest()
	{
		String[] arr3 = {"h1h1v1v1", "h1h1v2", "h1v1h1v1", "h1v1v1h1", "h1v1d1", "h1v2h1", "h1d1v1", "h2v1v1", "h2v2",
				"v1h1h1v1", "v1h1v1h1", "v1h1d1", "v1h2v1", "v1v1h1h1", "v1v1h2", "v1d1h1", "v2h1h1", "v2h2", "d1h1v1", "d1v1h1", "d1d1", "d2"};
		assertArrayEquals(arr3, RecursionMain.getMazePathWIthJumps(1, 1, 3, 3).toArray());
	}


}
