package dev.jaib.ds.pep.gettingstarted;

public class BasicMathProblems
{
	public static void main(String[] args)
	{
		printFibonacciTillN(10);
		System.out.println(countDigitsInANumber(123456));

		System.out.println("-----displayDigitsOfANumber-----");
		displayDigitsOfANumber(1554038760);

		System.out.println("-----calculateGcdandLcm-----");
		calculateGcdandLcm(24, 36);

		System.out.println("-----printPrimeFactorisationOfANumber-----");
		printPrimeFactorisationOfANumber(1440);

		System.out.println("-----theCuriousCaseOfBenjaminBulbs-----");
		theCuriousCaseOfBenjaminBulbs(20);
		System.out.println("-----theCuriousCaseOfBenjaminBulbs best approach-----");
		theCuriousCaseOfBenjaminBulbs2(20);
	}

	/**
	 * Print Fibonacci Numbers Till N
	 * Easy
	 *
	 * 1. You've to print first n fibonacci numbers.
	 * 2. Take as input "n", the count of fibonacci numbers to print.
	 * 3. Print first n fibonacci numbers.
	 *
	 * Constraints
	 * 1 <= n < 40
	 *
	 * Format
	 * Input
	 * n
	 *
	 * Output
	 * 0
	 * 1
	 * 1
	 * 2
	 * 3
	 * 5
	 * 8
	 * .. first n fibonaccis
	 *
	 * Example
	 * Sample Input
	 *
	 * 10
	 *
	 * Sample Output
	 * 0
	 * 1
	 * 1
	 * 2
	 * 3
	 * 5
	 * 8
	 * 13
	 * 21
	 * 34
	 * @param n the number till we need to print fibonnaci
	 */
	public static void printFibonacciTillN(int n)
	{
		int a = 0;
		int b = 1;
		int c;

		for( int i = 1; i <= n; i++ )
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

	/**
	 * Count Digits In A Number
	 * Easy
	 *
	 * 1. You've to count the number of digits in a number.
	 * 2. Take as input "n", the number for which the digits has to be counted.
	 * 3. Print the digits in that number.
	 *
	 * Constraints
	 * 1 <= n < 10^9
	 *
	 * Format
	 * Input
	 * "n" where n is any integer.
	 *
	 * Output
	 * "d" where d is the number of digits in the number "n"
	 *
	 * Example
	 * Sample Input
	 *
	 * 65784383
	 *
	 * Sample Output
	 * 8
	 *
	 * @param n the number
	 * @return the count
	 */
	public static int countDigitsInANumber(int n)
	{
		if( n < 1 )
		{
			return 0;
		}

		int count = 0;

		while(n > 0)
		{
			n = n / 10;
			count++;
		}

		return count;
	}

	/**
	 * 1. You've to display the digits of a number.
	 * 2. Take as input "n", the number for which digits have to be displayed.
	 * 3. Print the digits of the number line-wise.
	 *
	 * Constraints
	 * 1 <= n < 10^9
	 *
	 * Format
	 * Input
	 * "n" where n is any integer.
	 *
	 * Output
	 * d1
	 * d2
	 * d3
	 * ... digits of the number
	 *
	 * Example
	 * Sample Input
	 *
	 * 65784383
	 *
	 * Sample Output
	 * 6
	 * 5
	 * 7
	 * 8
	 * 4
	 * 3
	 * 8
	 * 3
	 * @param n the number
	 */
	public static void displayDigitsOfANumber(int n)
	{
		int count = 0;
		int m = n;

		while(m > 0)
		{
			m = m / 10;
			count++;
		}

		int div = (int) Math.pow(10, count - 1);

		while(div != 0)
		{
			int c = n / div;
			System.out.println(c);
			n = n % div;
			div = div / 10;
		}
	}

	/**
	 * Reverse A Number
	 * Easy
	 *
	 * 1. You've to display the digits of a number in reverse.
	 * 2. Take as input "n", the number for which digits have to be display in reverse.
	 * 3. Print the digits of the number line-wise, but in reverse order.
	 *
	 * Constraints
	 * 1 <= n < 10^9
	 *
	 * Format
	 * Input
	 * "n" where n is any integer.
	 *
	 * Output
	 * d1
	 * d2
	 * d3
	 * ... digits of the number in reverse
	 *
	 * Example
	 * Sample Input
	 *
	 * 65784383
	 *
	 * Sample Output
	 * 3
	 * 8
	 * 3
	 * 4
	 * 8
	 * 7
	 * 5
	 * 6
	 *
	 * @param n the number
	 * @return the reverse nu,ber
	 */
	public static int reverseANumber(int n)
	{
		int temp = n;
		int count = 0;
		int rev = 0;

		while(temp > 0)
		{
			temp = temp / 10;
			count++;
		}

		int div = (int) Math.pow(10, count - 1);

		while(div != 0)
		{
			int j = n % 10;
			rev = rev + j * div;
			n = n / 10;
			div = div / 10;
		}

		return rev;
	}

	/**
	 * Inverse Of A Number
	 * Easy
	 *
	 * 1. You are given a number following certain constraints.
	 * 2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
	 * 3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153
	 * 4. Take as input number "n", assume that the number will follow constraints.
	 * 5. Print it's inverse.
	 *
	 * Constraints
	 * 1 <= n < 10^8, and follwing other constraints defined above.
	 *
	 * Format
	 * Input
	 * "n" where n is any integer, following constraints defined above.
	 *
	 * Output
	 * "i", the inverted number
	 *
	 * Example
	 * Sample Input
	 *
	 * 28346751
	 *
	 * Sample Output
	 * 73425681
	 *
	 * @param n the number
	 * @return the inverse of a number
	 */
	public static int inverseOfANumber(int n)
	{
		int pos = 1;
		int inv = 0;

		while(n > 0)
		{
			int j = n % 10;
			inv += pos * (int) Math.pow(10, j - 1);
			n = n / 10;
			pos++;
		}

		return inv;
	}

	/**
	 * Approach 1:
	 *
	 * Rotate A Number
	 * Easy
	 *
	 * 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
	 * 2. Take as input n and k.
	 * 3. Print the rotated number.
	 * 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
	 *    n = 12340056
	 *    k = 3
	 *    r = 05612340
	 *
	 * Constraints
	 * 1 <= n < 10^9
	 * -10^9 < k < 10^9
	 *
	 * Format
	 * Input
	 * "n" where n is any integer.
	 * "K" where k is any integer.
	 *
	 * Output
	 * "r", the rotated number
	 *
	 * Example
	 * Sample Input
	 *
	 * 562984
	 * 2
	 *
	 * Sample Output
	 * 845629
	 *
	 * @param n the number
	 * @param k rotation
	 * @return the rotated number
	 */
	public static int rotateANumber(int n, int k)
	{
		int temp = n;
		int count = 0;

		while(temp > 0)
		{
			temp = temp / 10;
			count++;
		}

		k = k % count;

		if( k < 0 )
		{
			k = count + k;
		}

		while(k > 0)
		{
			int j = n % 10;
			n = n / 10;
			n += j * (int) Math.pow(10, count - 1);
			k--;
		}

		return n;
	}

	/**
	 * Approach 2:
	 *
	 * Rotate A Number
	 * Easy
	 *
	 * 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
	 * 2. Take as input n and k.
	 * 3. Print the rotated number.
	 * 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
	 *    n = 12340056
	 *    k = 3
	 *    r = 05612340
	 *
	 * Constraints
	 * 1 <= n < 10^9
	 * -10^9 < k < 10^9
	 *
	 * Format
	 * Input
	 * "n" where n is any integer.
	 * "K" where k is any integer.
	 *
	 * Output
	 * "r", the rotated number
	 *
	 * Example
	 * Sample Input
	 *
	 * 562984
	 * 2
	 *
	 * Sample Output
	 * 845629
	 *
	 * @param n the number
	 * @param k rotation
	 * @return the rotated number
	 */
	public static int rotateANumber2(int n, int k)
	{
		int temp = n;
		int count = 0;

		while(temp > 0)
		{
			temp = temp / 10;
			count++;
		}

		k = k % count;

		if( k < 0 )
		{
			k = count + k;
		}

		int div = (int) Math.pow(10, k);
		int multi = (int) Math.pow(10, count - k);

		// Another way for calculating the div and multi without using Math.pow.
		/*for( int i = 1; i <= count; i++ )
		{
			if( i <= k )
			{
				div *= 10;
			}
			else
			{
				multi *= 10;
			}
		}*/

		int j = n % div;

		n = j * multi + n / div;

		return n;
	}

	/**
	 * Gcd And Lcm
	 * Easy
	 *
	 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
	 *
	 * 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
	 *
	 * 3. Take input "num1" and "num2" as the two numbers.
	 *
	 * 4. Print their GCD and LCM.
	 *
	 *
	 * Constraints
	 * 2 <= n <= 10^9
	 *
	 * Format
	 * Input
	 * num1
	 * num2
	 * .. the numbers whose GCD and LCM we have to find.
	 *
	 * Output
	 * a
	 * b
	 * .. where 'a' and 'b' are the GCD and LCM respectively.
	 *
	 * Example
	 * Sample Input
	 *
	 * 36
	 * 24
	 *
	 * Sample Output
	 * 12
	 * 72
	 *
	 * @param n1 the first number
	 * @param n2 the second number
	 */
	public static void calculateGcdandLcm(int n1, int n2)
	{
		int on1 = n1;
		int on2 = n2;

		while(n1 % n2 != 0)
		{
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}

		int gcd = n2;

		int lcm = (on1 * on2) / gcd;

		System.out.println("gcd: " + gcd);
		System.out.println("lcm: " + lcm);
	}

	/**
	 * Prime Factorisation Of A Number
	 * Easy
	 *
	 * 1. You are required to display the prime factorisation of a number.
	 *
	 * 2. Take as input a number n.
	 *
	 * 3. Print all its prime factors from smallest to largest.
	 *
	 *
	 *
	 * For example:
	 *
	 * for n = 1440, the output should be: 2 2 2 2 2 3 3 5
	 *
	 *
	 * Constraints
	 * 2 <= n < 10 ^ 9
	 *
	 *
	 * Format
	 * Input
	 * n, an integer
	 *
	 *
	 * Output
	 * p1 p2 p3 p4.. all prime factors of n
	 *
	 *
	 * Example
	 * Sample Input
	 *
	 * 1440
	 *
	 * Sample Output
	 * 2 2 2 2 2 3 3 5
	 *
	 * @param n the number
	 */
	public static void printPrimeFactorisationOfANumber(int n)
	{
		for( int div = 2; div * div <= n; div++ )
		{
			while(n % div == 0)
			{
				n = n / div;
				System.out.print(div + " ");
			}
		}

		if( n != 1 )
		{
			System.out.println(n);
		}
	}

	/**
	 * Pythagorean Triplet
	 * Easy
	 *
	 * 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
	 * 2. Take as input three numbers a, b and c.
	 * 3. Print true if they can form a pythagorean triplet and false otherwise.
	 *
	 * Constraints
	 * 1 <= a <= 10^9
	 * 1 <= b <= 10^9
	 * 1 <= c <= 10^9
	 *
	 * Format
	 * Input
	 * a, an integer
	 * b, an integer
	 * c, an integer
	 *
	 * Output
	 * true if the numbers form a pythagorean triplet and false otherwise
	 *
	 * Example
	 * Sample Input
	 *
	 * 5 3 4
	 *
	 * Sample Output
	 * true
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return the true or false whether the given number is pythagorean or not
	 */
	public static boolean isPythagoreanTriplet( int a, int b, int c)
	{
		int max = 0, n1 = 0, n2 = 0;

		if( a > b && a > c)
		{
			max = a;
			n1 = b;
			n2 = c;
		}
		else if( b > a && b > c)
		{
			max = b;
			n1 = a;
			n2 = c;
		}
		else if( c > a && c > b)
		{
			max = c;
			n1 = a;
			n2 = b;
		}

		int m = max * max;
		int s = n1 * n1 + n2 * n2;

		return m == s;
	}

	/**
	 * Approach 1
	 * The Curious Case Of Benjamin Bulbs
	 * Easy
	 *
	 * 1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
	 * 2. Take as input a number n, representing the number of bulbs.
	 * 3. Print all the bulbs that will be on after the nth fluctuation in voltage.
	 *
	 * Constraints
	 * 2 <= n < 10^9
	 *
	 * Format
	 * Input
	 * n, an integer
	 *
	 * Output
	 * b1 b2 b3 b4 .. all bulbs that will be on after nth wave
	 *
	 * Example
	 * Sample Input
	 *
	 * 6
	 *
	 * Sample Output
	 * 1
	 * 4
	 * @param n the number
	 */
	public static void theCuriousCaseOfBenjaminBulbs(int n)
	{
		int[] b = new int[n + 1];

		for( int i = 1; i <= n; i++ )
		{
			int j = i;

			while(j <= n)
			{
				if( b[j] == 0 )
				{
					b[j] = 1;
				}
				else
				{
					b[j] = 0;
				}

				j += i;
			}
		}

		for( int i = 1; i < b.length; i++ )
		{
			if( b[i] == 1 )
			{
				System.out.println(i);
			}
		}
	}

	/**
	 * Approach 2: Best approach
	 * The Curious Case Of Benjamin Bulbs
	 * Easy
	 *
	 * 1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
	 * 2. Take as input a number n, representing the number of bulbs.
	 * 3. Print all the bulbs that will be on after the nth fluctuation in voltage.
	 *
	 * Constraints
	 * 2 <= n < 10^9
	 *
	 * Format
	 * Input
	 * n, an integer
	 *
	 * Output
	 * b1 b2 b3 b4 .. all bulbs that will be on after nth wave
	 *
	 * Example
	 * Sample Input
	 *
	 * 6
	 *
	 * Sample Output
	 * 1
	 * 4
	 * @param n the number
	 */
	public static void theCuriousCaseOfBenjaminBulbs2(int n)
	{
		for (int i = 1; i * i<= n; i++)
		{
			System.out.println(i * i);
		}
	}



}
