package dev.jaib.ds.pep.beginner.sorting;

public class SortingMain
{
	public static void main(String[] args)
	{

	}

	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j)
	{
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// return true if ith element is smaller than jth element
	public static boolean isSmaller(int[] arr, int i, int j)
	{
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if( arr[i] < arr[j] )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void print(int[] arr)
	{
		for( int i = 0; i < arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
	}


	/**
	 * Bubble Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using bubble sort.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2..
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample ouput and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 7
	 * -2
	 * 4
	 * 1
	 * 3
	 * <p>
	 * Sample Output
	 * <p>
	 * Comparing -2 and 7
	 * <p>
	 * Swapping -2 and 7
	 * <p>
	 * Comparing 4 and 7
	 * <p>
	 * Swapping 4 and 7
	 * <p>
	 * Comparing 1 and 7
	 * <p>
	 * Swapping 1 and 7
	 * <p>
	 * Comparing 3 and 7
	 * <p>
	 * Swapping 3 and 7
	 * <p>
	 * Comparing 4 and -2
	 * <p>
	 * Comparing 1 and 4
	 * <p>
	 * Swapping 1 and 4
	 * <p>
	 * Comparing 3 and 4
	 * <p>
	 * Swapping 3 and 4
	 * <p>
	 * Comparing 1 and -2
	 * <p>
	 * Comparing 3 and 1
	 * <p>
	 * Comparing 1 and -2
	 * <p>
	 * -2
	 * 1
	 * 3
	 * 4
	 * 7
	 *
	 * @param arr the given array
	 */
	public static void bubbleSort(int[] arr)
	{
		for( int i = 1; i <= arr.length - 1; i++ )
		{
			for( int j = 0; j < arr.length - i; j++ )
			{
				if( isSmaller(arr, j + 1, j) )
				{
					swap(arr, j + 1, j);
				}
			}
		}
	}


}
