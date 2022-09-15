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

	@Test
	public void infixEvaluationTest()
	{
		String exp = "2+6*4/8-3";
		int ans = StackMain.infixEvaluation(exp);

		assertEquals(2, ans);
	}

	@Test
	public void infixConversionTest()
	{
		String exp = "a*(b-c+d)/e";
		String[] ans = StackMain.infixConversion(exp);

		assertEquals("/*a+-bcde", ans[0]);
		assertEquals("abc-d+*e/", ans[1]);
	}

	@Test
	public void postfixEvaluationAndConversionTest()
	{
		String exp = "264*8/+3-";
		String[] ans = StackMain.postfixEvaluationAndConversion(exp);

		assertEquals("2", ans[0]);
		assertEquals("((2+((6*4)/8))-3)", ans[1]);
		assertEquals("-+2/*6483", ans[2]);
	}

	@Test
	public void prefixEvaluationAndConversionTest()
	{
		String exp = "-+2/*6483";
		String[] ans = StackMain.prefixEvaluationAndConversion(exp);

		assertEquals("2", ans[0]);
		assertEquals("((2+((6*4)/8))-3)", ans[1]);
		assertEquals("264*8/+3-", ans[2]);
	}
	@Test
	public void findCelebrityTest()
	{
		int[][] arr1 = {{0, 0, 0, 0}, {1,0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};
		int ans1 = StackMain.findCelebrity(arr1);

		assertEquals(0, ans1);

		int[][] arr2 = {{0, 0, 0, 0}, {1,0, 1, 1}, {0, 1, 0, 1}, {1, 1, 1, 0}};
		int ans2 = StackMain.findCelebrity(arr2);

		assertEquals(-1, ans2);
	}
}
