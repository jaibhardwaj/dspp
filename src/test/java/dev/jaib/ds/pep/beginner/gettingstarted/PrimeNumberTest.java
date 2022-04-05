package dev.jaib.ds.pep.beginner.gettingstarted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimeNumberTest
{
	@Test
	public void isNUmberPrimeTest()
	{
		assertTrue(PrimeNumber.isNumberPrime(13));
		assertFalse(PrimeNumber.isNumberPrime(10));
		assertFalse(PrimeNumber.isNumberPrime(-1));
		assertFalse(PrimeNumber.isNumberPrime(0));
		assertTrue(PrimeNumber.isNumberPrime(2));
		assertTrue(PrimeNumber.isNumberPrime(1));
	}

	@Test
	public void printPrimeTillN()
	{
		assertEquals(6, PrimeNumber.printPrimeTillN(6, 24).size());
		assertEquals(7, PrimeNumber.printPrimeTillN(50, 80).size());
	}
}
