package dev.jaib.ds.pep.beginner.functionsandarrays;

public class ArrayMain
{

	public static void main(String[] args)
	{
		System.out.println("########### barChart ###########");
		barChart(new int[]{3, 1 , 0, 7, 5});

		System.out.println("########### printSubArraysOfAnArray ###########");
		printSubArraysOfAnArray(new int[]{1, 2, 3});

		System.out.println("########### printSubsetsOfArray ###########");
		printSubsetsOfArray(new int[]{1, 2, 3});
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

	/**
	 * Difference Of Two Arrays
	 *
	 * Easy
	 *
	 * You are given a number n1, representing the size of array a1. 2. You are given n1 numbers, representing elements of array a1. 3. You are given a number n2, representing the size of array a2. 4. You are given n2 numbers, representing elements of array a2. 5. The two arrays represent digits of two numbers. 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1 Assumption - number represented by a2 is greater.
	 *
	 * Constraints
	 *
	 * 1 <= n1, n2 <= 100 0 <= a1[i], a2[i] < 10 number reresented by a1 is smaller than number represented by a2
	 *
	 * Format
	 *
	 * Input
	 *
	 * A number n1 n1 number of elements line separated A number n2 n2 number of elements line separated
	 *
	 * Output
	 *
	 * A number representing difference of two numbers (a2 - a1), represented by two arrays.
	 *
	 * Example
	 *
	 * Sample Input
	 *
	 * 3 2 6 7 4 1 0 0 0
	 *
	 * Sample Output
	 *
	 * 7 3 3
	 *
	 * @param arr1 the first Array
	 * @param arr2 the Second Array
	 * @return the Difference between two array
	 */
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

	/**
	 * Reverse An Array
	 *
	 * Easy
	 *
	 * You are given a number n, representing the size of array a. 2. You are given n numbers, representing elements of array a. 3. You are required to reverse the contents of array a.
	 *
	 * Constraints
	 *
	 * 0 <= n < 10^4 -10^9 <= a[i] <= 10^9
	 *
	 * Format
	 *
	 * Input
	 *
	 * Input is managed for you
	 *
	 * Output
	 *
	 * Output is managed for you
	 *
	 * Example
	 *
	 * Sample Input
	 *
	 * 5 1 2 3 4 5
	 *
	 * Sample Output
	 *
	 * 5 4 3 2 1
	 *
	 * @param arr the array
	 * @return the reversed array
	 */
	public static int[] reverseOfArray(int[] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		while( i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return arr;
	}

	/**
	 * Rotate An Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are given a number k.
	 * 4. Rotate the array a, k times to the right (for positive values of k), and to
	 * the left for negative values of k.
	 *
	 * Constraints
	 * 0 <= n < 10^4
	 * -10^9 <= a[i], k <= 10^9
	 *
	 * Format
	 * Input
	 * Input is managed for you
	 *
	 * Output
	 * Output is managed for you
	 *
	 * Example
	 * Sample Input
	 *
	 * 5
	 * 1
	 * 2
	 * 3
	 * 4
	 * 5
	 * 3
	 *
	 * Sample Output
	 * 3 4 5 1 2
	 *
	 * @param a the array
	 * @param k the rotation count
	 * @return the rotated array
	 */
	public static int[] rotateAnArray(int[] a, int k)
	{
		k = k % a.length;
		if (k < 0) {
			k += a.length;
		}

		reverse(a, 0, a.length - k - 1);
		reverse(a, a.length - k, a.length - 1);
		reverse(a, 0, a.length - 1);

		return a;

	}

	public static void reverse(int[] a, int li, int ri)
	{
		while(li < ri)
		{
			int temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;

			li++;
			ri--;
		}
	}

	/**
	 * Inverse Of An Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to calculate the inverse of array a.
	 *
	 * For definition and constraints check this link
	 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse-of-an-array-official/ojquestion
	 * The only difference is the range of values is from 0 to n - 1, instead of 1 to n.
	 *
	 * Constraints
	 * 0 <= n < 10^7
	 * For more constraints check this
	 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse-of-an-array-official/ojquestion
	 * The only difference is the range of values is from 0 to n - 1, instead
	 * of 1 to n
	 *
	 * Format
	 * Input
	 * Input is managed for you
	 *
	 * Output
	 * Output is managed for you
	 *
	 * Example
	 * Sample Input
	 *
	 * 5
	 * 4
	 * 0
	 * 2
	 * 3
	 * 1
	 *
	 * Sample Output
	 * 1
	 * 4
	 * 2
	 * 3
	 * 0
	 *
	 * @param arr the array
	 * @return the inverse array
	 */
	public static int[] inverseOfAnArray(int[] arr)
	{
		int[] inv = new int[arr.length];

		for( int i = 0; i < arr.length; i++ )
		{
			int v = arr[i];
			inv[v] = i;
		}
		return inv;
	}

	/**
	 * Subarray Problem
	 * Easy
	 *
	 * 1. You are given an array of size 'n' and n elements of the same array.
	 * 2. You are required to find and print all the subarrays of the given array.
	 * 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
	 *
	 * Constraints
	 * 1 <= n <= 10
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
	 * [Tab separated elements of subarray]
	 * ..
	 * All subarrays
	 *
	 * Example
	 * Sample Input
	 *
	 * 3
	 * 10
	 * 20
	 * 30
	 *
	 * Sample Output
	 * 10
	 * 10	20
	 * 10	20	30
	 * 20
	 * 20	30
	 * 30
	 * @param arr the array
	 */
	public static void printSubArraysOfAnArray(int[] arr)
	{
		for( int i = 0; i < arr.length; i++ )
		{
			for( int j = i; j < arr.length; j++ )
			{
				for( int k = i; k <= j; k++ )
				{
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}
	}

	/**
	 * Subsets Of Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are required to print all subsets of arr. Each subset should be
	 * on separate line. For more clarity check out sample input and output.
	 *
	 * Constraints
	 * 1 <= n <= 10
	 * 0 <= n1, n2, .. n elements <= 10^3
	 *
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 *
	 * Output
	 * [Tab separated elements of subset]
	 * ..
	 * All subsets
	 *
	 * Example
	 * Sample Input
	 *
	 * 3
	 * 10
	 * 20
	 * 30
	 *
	 * Sample Output
	 * -	-	-
	 * -	-	30
	 * -	20	-
	 * -	20	30
	 * 10	-	-
	 * 10	-	30
	 * 10	20	-
	 * 10	20	30
	 *
	 * @param arr the array
	 */
	public static void printSubsetsOfArray(int[] arr)
	{
		int limit = (int) Math.pow (2, arr.length); //calculating the number of subsets

		for (int i = 0; i < limit; i++)
		{
			//convert i to binary and use 0's and 1's
			//to check if an array's element is to be printed or not
			StringBuilder set = new StringBuilder();
			// we make use of set to print in required order
			int temp = i;
			// we store i because we need to use value
			// of i without manipulating the actual i
			// as i is the outer loop iterator
			for (int j = arr.length - 1; j >= 0; --j)
			{
				//calculating the binary, extracting //
				// the remainder one and by one
				// and putting required element
				// in the String to be printed.
				int rem = temp % 2;
				temp = temp / 2;
				if (rem == 0)   //nothing to be printed
				{
					set.insert(0, "-" + "\t");
				}
				else
				{
					// we print the element, so we add it to our answer string
					set.insert(0, arr[j] + "\t");
				}
			}
			System.out.println(set);
			// printing the required pattern line-by-line
		}
	}

}
