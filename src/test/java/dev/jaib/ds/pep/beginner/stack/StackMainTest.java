package dev.jaib.ds.pep.beginner.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackMainTest
{
	@Test
	public void duplicateBracketsTest()
	{
		String str1 = "((a+b)+(c+d))";
		boolean str1Result = StackMain.duplicateBrackets(str1);
		assertFalse(str1Result);

		String str2 = "(a+b)+((c+d))";
		boolean str2Result = StackMain.duplicateBrackets(str2);
		assertTrue(str2Result);
	}

	@Test
	public void balancedBracketsTest()
	{
		String str1 = "[(a+b)+{(c+d)*(e/f)}]";
		boolean str1Result = StackMain.balancedBrackets(str1);
		assertTrue(str1Result);

		String str2 = "[(a+b)+{(c+d)*(e/f)]}";
		boolean str2Result = StackMain.balancedBrackets(str2);
		assertFalse(str2Result);

		String str3 = "[(a+b)+{(c+d)*(e/f)}";
		boolean str3Result = StackMain.balancedBrackets(str3);
		assertFalse(str3Result);

		String str4 = "([(a+b)+{(c+d)*(e/f)}]";
		boolean str4Result = StackMain.balancedBrackets(str4);
		assertFalse(str4Result);
	}

	@Test
	public void ngetrTest()
	{
		int[] arr1 = {2, 5, 9, 3, 1, 12, 6, 8, 7};
		int[] result = {5, 9, 12, 12, 12, -1, 8, -1, -1};
		int[] ans = StackMain.ngetr(arr1);

		assertArrayEquals(result, ans);
	}

	@Test
	public void stockSpanTest()
	{
		int[] arr1 = {2, 5, 9, 3, 1, 12, 6, 8, 7};
		int[] result = {1, 2, 3, 1, 1, 6, 1, 2, 1};
		int[] ans = StackMain.stockSpan(arr1);

		assertArrayEquals(result, ans);

	}

	@Test
	public void largestAreaHistogramTest()
	{
		int[] arr = {6, 2, 5, 4, 5, 1, 6};
		int ans = StackMain.largestAreaHistogram(arr);

		assertEquals(12, ans);

	}

	@Test
	public void slidingWindowMaximumTest()
	{
		int[] arr1 = {2, 5, 9, 3, 1, 12, 6, 8, 7};
		int[] result = {9, 9, 12, 12, 12, 12};
		int[] ans = StackMain.slidingWindowMaximum(arr1, 4);

		assertArrayEquals(result, ans);

	}
}
