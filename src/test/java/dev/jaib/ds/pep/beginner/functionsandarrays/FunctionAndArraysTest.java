package dev.jaib.ds.pep.beginner.functionsandarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionAndArraysTest
{
	@Test
	public void getDigitFrequencyTest()
	{
		assertEquals(3, FunctionAndArraysMain.getDigitFrequency(994543234, 4));
		assertEquals(4, FunctionAndArraysMain.getDigitFrequency(12121212, 1));
		assertEquals(1, FunctionAndArraysMain.getDigitFrequency(0, 0));
		assertEquals(0, FunctionAndArraysMain.getDigitFrequency(0, 1));
	}

	@Test
	public void decimalToAnyBaseTest()
	{
		assertEquals(111001, FunctionAndArraysMain.decimalToAnyBase(57, 2));
	}

	@Test
	public void anyBaseToDecimalTest()
	{
		assertEquals(57, FunctionAndArraysMain.anyBaseToDecimal(111001, 2));
	}

	@Test
	public void anyBaseToAnyBaseTest()
	{
		assertEquals(2010, FunctionAndArraysMain.anyBaseToAnyBase(111001, 2, 3));
	}

	@Test
	public void anyBaseAdditionTest()
	{
		assertEquals(1000, FunctionAndArraysMain.anyBaseAddition(8, 777, 1));
		assertEquals(1212, FunctionAndArraysMain.anyBaseAddition(8, 236, 754));
	}

	@Test
	public void anyBaseSubtractionTest()
	{
		assertEquals(77, FunctionAndArraysMain.anyBaseSubtraction(8, 1, 100));
		assertEquals(734, FunctionAndArraysMain.anyBaseSubtraction(8, 256, 1212));
	}

	@Test
	public void anyBaseMultiplicationTest()
	{
		assertEquals(204710, FunctionAndArraysMain.anyBaseMultiplication(8, 2156, 74));
		assertEquals(43320, FunctionAndArraysMain.anyBaseMultiplication(5, 1220, 31));
	}
}
