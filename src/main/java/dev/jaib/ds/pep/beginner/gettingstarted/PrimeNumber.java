package dev.jaib.ds.pep.beginner.gettingstarted;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("isNumberPrime: " + isNumberPrime(14));
	}

	/**
	 * To check whether a number is prime or not
	 *
	 * @param n the number to check
	 * @return true if number is prime else false
	 */
	public static boolean isNumberPrime(int n)
	{
		if( n <= 0 )
		{
			return false;
		}
		if( n == 1 )
		{
			return true;
		}
		for( int i = 2; i * i <= n; i++ )
		{
			if( n % i == 0 )
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * To get the all the prime number between low and high
	 * Constraints (2 <= low < high < 10 ^ 6)
	 *
	 * @param low the lower range
	 * @param high the higher range
	 * @return the list of prime numbers
	 */
	public static List<Integer> printPrimeTillN(int low, int high)
	{
		List<Integer> list = new ArrayList<>();

		if( low < 3 || low > high )
		{
			return list;
		}

		for( int i = low; i <= high; i++ )
		{
			boolean prime = true;


			for( int div = 2; div * div <= i; div++ )
			{
				if( i % div == 0 )
				{
					prime = false;
					break;
				}
			}

			if( prime )
			{
				list.add(i);
			}
		}

		return list;
	}

}
