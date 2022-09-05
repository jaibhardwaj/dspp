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
}
