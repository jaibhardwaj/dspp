package dev.jaib.ds.pep.beginner.functionsandarrays;

public class ArrayMain
{

	public static void main(String[] args)
	{
		barChart(new int[]{3, 1 , 0, 7, 5});
	}
	/**
	 * Span Of Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
	 *
	 * Constraints
	 * 1 <= n <= 10^4
	 * 0 <= n1, n2
	 *  .. n elements <= 10 ^9
	 *
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 *
	 * Output
	 * A number representing max - min
	 *
	 * Example
	 * Sample Input
	 *
	 * 6
	 * 15
	 * 30
	 * 40
	 * 4
	 * 11
	 * 9
	 *
	 * Sample Output
	 * 36
	 *
	 * @param arr the array
	 * @return the difference between max and min
	 */
	public static int spanOfAnArray(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for( int j : arr )
		{
			if( j > max )
			{
				max = j;
			}

			if( j < min )
			{
				min = j;
			}
		}

		return max - min;
	}

	/**
	 * Find Element In An Array
	 * Easy
	 *
	 * 1.You are given a number n, representing the size of array a.
	 * 2.You are given n distinct numbers, representing elements of array a.
	 * 3. You are given another number d.
	 * 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
	 *
	 * Constraints
	 * 1 <= n <= 10^7
	 * -10^9 <= n1, n2
	 * .. n elements <= 10^9
	 * -10^9 <= d <= 10^9
	 *
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * A number d
	 *
	 * Output
	 * A number representing index at which d is found in array a and -1 if not found
	 *
	 * Example
	 * Sample Input
	 *
	 * 6
	 * 15
	 * 30
	 * 40
	 * 4
	 * 11
	 * 9
	 * 40
	 *
	 * Sample Output
	 * 2
	 *
	 * @param arr the array
	 * @param d the number to find
	 * @return the index if found number else return -1
	 */
	public static int findElementIndex( int[] arr, int d)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if( arr[i] == d )
			{
				return i;
			}
		}

		return -1;
	}

	/**
	 * Bar Chart
	 * Easy
	 *
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to print a bar chart representing value of arr a.
	 *
	 * Constraints
	 * 1 <= n <= 30
	 * 0 <= n1, n2, .. n elements <= 10
	 *
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 *
	 * Output
	 * A bar chart of asteriks representing value of array a
	 *
	 * Example
	 * Sample Input
	 *
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 *
	 * Sample Output
	 * 			*
	 * 			*
	 * 			*	*
	 * 			*	*
	 * *			*	*
	 * *			*	*
	 * *	*		*	*
	 *
	 * @param arr the array to print
	 */
	public static void barChart(int[] arr)
	{
		int max = Integer.MIN_VALUE;

		for( int i : arr )
		{
			if( i > max )
			{
				max = i;
			}
		}

		for( int k = max; k > 0; k-- )
		{
			for( int i : arr )
			{
				if( i >= k )
				{
					System.out.print("*");
					System.out.print(" ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	/**
	 * Sum Of Two Arrays
	 * Easy
	 *
	 * 1. You are given a number n1, representing the size of array a1.
	 * 2. You are given n1 numbers, representing elements of array a1.
	 * 3. You are given a number n2, representing the size of array a2.
	 * 4. You are given n2 numbers, representing elements of array a2.
	 * 5. The two arrays represent digits of two numbers.
	 * 6. You are required to add the numbers represented by two arrays and print the
	 * arrays.
	 *
	 * Constraints
	 * 1 <= n1, n2 <= 100
	 * 0 <= a1[i], a2[i] < 10
	 *
	 * Format
	 * Input
	 * A number n1
	 * n1 number of elements line separated
	 * A number n2
	 * n2 number of elements line separated
	 *
	 * Output
	 * A number representing sum of two numbers, represented by two arrays.
	 *
	 * Example
	 * Sample Input
	 *
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 * 6
	 * 1
	 * 1
	 * 1
	 * 1
	 * 1
	 * 1
	 *
	 * Sample Output
	 * 1
	 * 4
	 * 2
	 * 1
	 * 8
	 * 6
	 *
	 * @param arr1 the first array
	 * @param arr2 the second array
	 * @return the sum of the arrays
	 */
	public static int[] sumOfTwoArray(int[] arr1, int[] arr2)
	{
		int a1 = arr1.length;
		int a2 = arr2.length;

		int[] arr = a1 > a2 ? new int[a1] : new int[a2];

		int i = 0;

		int carry = 0;

		while( i < arr.length )
		{
			int a = a1 - 1 - i >= 0 ? arr1[a1 - 1 - i] : 0;
			int b = a2 - 1 - i >= 0 ? arr2[a2 - 1 - i] : 0;
			int sum = a + b + carry;

			arr[arr.length - 1 - i] = sum % 10;
			carry = sum / 10;
			i++;
		}

		return arr;
	}

	// second approach
	/*public static void sumOfTwoArray2()
	{
		int n1 = 5;
		int[] a1 = new int[]{ 3, 1, 0, 7, 5 };
		int n2 = 6;
		int[] a2 = new int[]{ 1, 1, 1, 1, 1, 1 };

		int[] sum = new int[n1 > n2 ? n1 : n2];
		int i = n1 - 1;
		int j = n2 - 1;
		int k = sum.length - 1;
		int c = 0;
		while (i >= 0 || j >= 0) {
			int d = c;

			if (i >= 0)
				d += a1[i];

			if (j >= 0)
				d += a2[j];

			c = d / 10;
			d = d % 10;
			sum[k] = d;

			i--;
			j--;
			k--;
		}

		if (c > 0) {
			System.out.println(c);
		}
		for (int val : sum) {
			System.out.println(val);
		}
	}*/

	public static int[] diffOfTwoArray(int[] arr1, int[] arr2)
	{
		int a1 = arr1.length;
		int a2 = arr2.length;

		int[] arr = new int[a2];

		int i = 0;

		int carry = 0;

		while( i < arr.length )
		{
			int a = a1 - 1 - i >= 0 ? arr1[a1 - 1 - i] : 0;
			int b = a2 - 1 - i >= 0 ? arr2[a2 - 1 - i] : 0;

			int diff;
			if( b - carry >= a )
			{
				diff = b - a - carry;
				carry = 0;
			}
			else
			{
				diff = b + 10 - a - carry;
				carry = 1;
			}
			arr[arr.length - 1 - i] = diff;
			i++;
		}

		return arr;
	}

}
