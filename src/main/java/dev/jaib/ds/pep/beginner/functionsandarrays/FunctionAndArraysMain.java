package dev.jaib.ds.pep.beginner.functionsandarrays;

public class FunctionAndArraysMain
{
	public static void main(String[] args)
	{

	}

	/**
	 * Digit Frequency
	 * Easy
	 *
	 * 1. You are given a number n.
	 * 2. You are given a digit d.
	 * 3. You are required to calculate the frequency of digit d in number n.
	 *
	 * Constraints
	 * 0 <= n <= 10^9
	 * 0 <= d <= 9
	 *
	 * Format
	 * Input
	 * A number n
	 * A digit d
	 *
	 * Output
	 * A number representing frequency of digit d in number n
	 *
	 * Example
	 * Sample Input
	 *
	 * 994543234
	 *  4
	 *
	 * Sample Output
	 * 3
	 * @param n the number
	 * @param d the digit
	 * @return the count of digit
	 */
	public static int getDigitFrequency(int n, int d)
	{
		if( n == 0 )
		{
			if( d == 0 )
			{
				return 1;
			}

			return 0;
		}

		int count = 0;

		while(n > 0)
		{
			if( d == n % 10 )
			{
				count++;
			}

			n = n / 10;
		}

		return count;
	}

	/**
	 * Decimal To Any Base
	 * Easy
	 *
	 * 1. You are given a decimal number n.
	 * 2. You are given a base b.
	 * 3. You are required to convert the number n into its corresponding value in base b.
	 *
	 * Constraints
	 * 0 <= d <= 512
	 * 2 <= b <= 10
	 *
	 * Format
	 * Input
	 * A number n
	 * A base b
	 *
	 * Output
	 * A number representing corresponding value of n in number system of base b
	 *
	 * Example
	 * Sample Input
	 *
	 * 57
	 *  2
	 *
	 * Sample Output
	 * 111001
	 * @param n the number
	 * @param tb the dstination base
	 * @return from decimal to destination base number
	 */
	public static int decimalToAnyBase(int n, int tb)
	{
		int conv = 0;
		int multiplier = 1;

		while(n > 0)
		{
			int r = n % tb;
			conv += r * multiplier;
			n = n / tb;
			multiplier *= 10;
		}

		return conv;
	}

	/**
	 * Any Base To Decimal
	 * Easy
	 *
	 * 1. You are given a number n.
	 * 2. You are given a base b. n is a number on base b.
	 * 3. You are required to convert the number n into its corresponding value in decimal number system.
	 *
	 * Constraints
	 * 0 <= d <= 1000000000
	 * 2 <= b <= 10
	 *
	 * Format
	 * Input
	 * A number n
	 * A base b
	 *
	 * Output
	 * A decimal number representing corresponding value of n in base b.
	 *
	 * Example
	 * Sample Input
	 *
	 * 111001
	 * 2
	 *
	 * Sample Output
	 * 57
	 * @param n the number
	 * @param tb the any base
	 * @return to decimal
	 */
	public static int anyBaseToDecimal(int n, int tb)
	{
		int conv = 0;
		int multiplier = 1;

		while(n > 0)
		{
			int r = n % 10;
			conv += r * multiplier;
			n = n / 10;
			multiplier *= tb;
		}

		return conv;
	}

	/**
	 * Any Base To Any Base
	 * Easy
	 *
	 * 1. You are given a number n.
	 * 2. You are given a base b1. n is a number on base b.
	 * 3. You are given another base b2.
	 * 4. You are required to convert the number n of base b1 to a number in base b2.
	 *
	 * Constraints
	 * 0 <= n <= 512
	 * 2 <= b1 <= 10
	 * 2 <= b2 <= 10
	 *
	 * Format
	 * Input
	 * A number n
	 * A base b1
	 * A base b2
	 *
	 * Output
	 * A number of base b2 equal in value to n of base b1.
	 *
	 * Example
	 * Sample Input
	 *
	 * 111001
	 * 2
	 * 3
	 *
	 * Sample Output
	 * 2010
	 *
	 * @param n the number
	 * @param sourceBase the source base
	 * @param destinationBase the destination base
	 * @return the number from source base number to destination base number
	 */
	public static int anyBaseToAnyBase(int n, int sourceBase, int destinationBase)
	{
		int decimalNumber = anyBaseToDecimal(n, sourceBase);

		return decimalToAnyBase(decimalNumber, destinationBase);
	}

	/**
	 * Any Base Addition
	 * Easy
	 *
	 * 1. You are given a base b. 2. You are given two numbers n1 and n2 of base b. 3. You are required to add the two numbes and print their value in base b.
	 *
	 *
	 * Constraints
	 * 2 <= b <= 10 0 <= n1 <= 256 0 <= n2 <= 256
	 *
	 *
	 * Format
	 * Input
	 * A base b A number n1 A number n2
	 *
	 *
	 * Output
	 * A number representing the sum of n1 and n2 in base b.
	 *
	 *
	 * Example
	 * Sample Input
	 *
	 * 8
	 * 777
	 * 1
	 *
	 * Sample Output
	 * 1000
	 *
	 * @param b the base of numbers
	 * @param n1 the first number
	 * @param n2 the second number
	 * @return the addition of two number
	 */
	public static int anyBaseAddition(int b, int n1, int n2)
	{

		int totalSum = 0;
		int multi = 1;
		int carry = 0;

		while(n1 > 0 || n2 > 0 || carry > 0)
		{
			int r1 = n1 % 10;
			int r2 = n2 % 10;

			int sum = r1 + r2 + carry;

			int val = sum % b;

			carry = sum / b;

			totalSum += val * multi;
			multi *= 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
		}

		return totalSum;
	}

	/**
	 * Any Base Subtraction
	 * Easy
	 *
	 * 1. You are given a base b.
	 * 2. You are given two numbers n1 and n2 of base b.
	 * 3. You are required to subtract n1 from n2 and print the value.
	 *
	 * Constraints
	 * 2 <= b <= 10
	 * 0 <= n1 <= 256
	 * n1 <= n2 <= 256
	 *
	 * Format
	 * Input
	 * A base b
	 * A number n1
	 * A number n2
	 *
	 * Output
	 * A number of base b equal in value to n2 - n1.
	 *
	 * Example
	 * Sample Input
	 *
	 * 8
	 * 1
	 * 100
	 *
	 * Sample Output
	 * 77
	 *
	 * @param b the base of numbers
	 * @param n1 the first number
	 * @param n2 the second number
	 * @return the subtraction result
	 */
	public static int anyBaseSubtraction(int b, int n1, int n2)
	{
		int total = 0;
		int carry = 0;
		int mult = 1;

		while(n2 > 0)
		{
			int r1 = n1 % 10;
			int r2 = n2 % 10;

			int val = r2 - r1 - carry;

			if( val < 0 )
			{
				val += b;
				carry = 1;

			}
			else
			{
				carry = 0;
			}


			total += val * mult;
			mult *= 10;

			n1 = n1 / 10;
			n2 = n2 / 10;

		}

		return total;
	}

	/**
	 * Any Base Multiplication
	 * Easy
	 *
	 * 1. You are given a base b.
	 * 2. You are given two numbers n1 and n2 of base b.
	 * 3. You are required to multiply n1 and n2 and print the value.
	 *
	 * Constraints
	 * 2 <= b <= 10
	 * 0 <= n1 <= 10000
	 * 0 <= n2 <= 10000
	 *
	 * Format
	 * Input
	 * A base b
	 * A number n1
	 * A number n2
	 *
	 * Output
	 * A number of base b equal in value to n2 * n1.
	 *
	 * Example
	 * Sample Input
	 *
	 * 5
	 * 1220
	 * 31
	 *
	 * Sample Output
	 * 43320
	 *
	 * @param b the base of numbers
	 * @param n1 the first number
	 * @param n2 the second number
	 * @return the multiplication of n1 and n2 with base b
	 */
	public static int anyBaseMultiplication(int b, int n1, int n2)
	{
		int totalPr = 0;
		int p = 1;

		while(n2 > 0)
		{
			int d1 = n2 % 10;
			n2 = n2 / 10;
			int sdp = getProductAsSingleDigit(b, n1, d1);

			totalPr = anyBaseAddition(b, totalPr, sdp * p);
			p *= 10;
		}

		return totalPr;
	}

	private static int getProductAsSingleDigit(int b, int n1, int d1)
	{
		int pr = 0;
		int multi = 1;
		int carry = 0;

		while(n1 > 0 || carry > 0)
		{
			int d2 = n1 % 10;
			n1 = n1 / 10;

			int val = d1 * d2 + carry;

			int d = val % b;
			carry = val / b;

			pr += d * multi;
			multi *= 10;
		}

		return pr;
	}
}
