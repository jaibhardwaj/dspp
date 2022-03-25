package dev.jaib.ds.pep.gettingstarted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicMathProblemsTest
{
	@Test
	public void countDigitsInANumberTest()
	{
		assertEquals(6, BasicMathProblems.countDigitsInANumber(123456));
		assertEquals(0, BasicMathProblems.countDigitsInANumber(0));
	}

	@Test
	public void reverseANumberTest()
	{
		assertEquals(654321, BasicMathProblems.reverseANumber(123456));
		assertEquals(654321, BasicMathProblems.reverseANumber(1234560));
	}

	@Test
	public void inverseOfANumberTest()
	{
		assertEquals(73425681, BasicMathProblems.inverseOfANumber(28346751));
		assertEquals(416253, BasicMathProblems.inverseOfANumber(426135));
	}

	@Test
	public void rotateANumberTest()
	{
		assertEquals(984562, BasicMathProblems.rotateANumber2(562984, -9));
		assertEquals(629845, BasicMathProblems.rotateANumber2(562984, 5));
	}

	@Test
	public void isPythagoreanTripletTest()
	{
		assertTrue(BasicMathProblems.isPythagoreanTriplet(5, 3, 4));
		assertFalse(BasicMathProblems.isPythagoreanTriplet(5, 10, 12));
	}
}
