package dev.jaib.ds.pep.beginner.stack;

import org.junit.jupiter.api.Test;

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
}
