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

	@Test
	public void diffOfTwoArrayTest()
	{
		assertArrayEquals(new int[]{ 0, 7, 3, 3 }, ArrayMain.diffOfTwoArray(new int[]{ 2, 6, 7 }, new int[]{ 1, 0, 0, 0 }));
	}

	@Test
	public void reverseOfArrayTest()
	{
		assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, ArrayMain.reverseOfArray(new int[]{ 1, 2, 3, 4, 5 }));
		assertArrayEquals(new int[]{ 4, 3, 2, 1 }, ArrayMain.reverseOfArray(new int[]{ 1, 2, 3, 4 }));
	}

	@Test
	public void rotateAnArrayTest()
	{
		assertArrayEquals(new int[]{ 4, 5, 1, 2, 3 }, ArrayMain.rotateAnArray(new int[]{ 1, 2, 3, 4, 5 }, 2));
		assertArrayEquals(new int[]{ 4, 5, 1, 2, 3 }, ArrayMain.rotateAnArray(new int[]{ 1, 2, 3, 4, 5 }, -3));
		assertArrayEquals(new int[]{ 4, 5, 1, 2, 3 }, ArrayMain.rotateAnArray(new int[]{ 1, 2, 3, 4, 5 }, 537));
		assertArrayEquals(new int[]{ 1, 2, 3, 4, 5 }, ArrayMain.rotateAnArray(new int[]{ 1, 2, 3, 4, 5 }, -45));
	}

	@Test
	public void inverseOfAnArrayTest()
	{
		assertArrayEquals(new int[]{ 4, 2, 3, 0, 1 }, ArrayMain.inverseOfAnArray(new int[]{ 3, 4, 1, 2, 0 }));
	}
}
