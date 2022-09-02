package dev.jaib.ds.pep.beginner.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMain
{
	public static void main(String[] args)
	{
		int[] arr = { 2, 8, 1, 3, 7, 6, 4, 5 };
		System.out.println(quickSelect(arr, 0, 7, 4));
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
		return arr[i] < arr[j];
	}

	// return true if jth element is greater than ith element
	public static boolean isGreater(int[] arr, int j, int i)
	{
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		return arr[i] < arr[j];
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
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
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

	/**
	 * Selection Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using selection sort.
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
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
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
	 * Comparing 4 and -2
	 * <p>
	 * Comparing 1 and -2
	 * <p>
	 * Comparing 3 and -2
	 * <p>
	 * Swapping 7 and -2
	 * <p>
	 * Comparing 4 and 7
	 * <p>
	 * Comparing 1 and 4
	 * <p>
	 * Comparing 3 and 1
	 * <p>
	 * Swapping 7 and 1
	 * <p>
	 * Comparing 7 and 4
	 * <p>
	 * Comparing 3 and 4
	 * <p>
	 * Swapping 4 and 3
	 * <p>
	 * Comparing 4 and 7
	 * <p>
	 * Swapping 7 and 4
	 * <p>
	 * -2
	 * <p>
	 * 1
	 * <p>
	 * 3
	 * <p>
	 * 4
	 * <p>
	 * 7
	 *
	 * @param arr the given array
	 */
	public static void selectionSort(int[] arr)
	{
		for( int i = 0; i < arr.length - 1; i++ )
		{
			int min = i;

			for( int j = i + 1; j < arr.length; j++ )
			{
				if( isSmaller(arr, j, min) )
				{
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}

	/**
	 * Insertion Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using insertion sort.
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
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * Check the sample output and question video.
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
	 * Swapping 7 and -2
	 * <p>
	 * Comparing 4 and 7
	 * <p>
	 * Swapping 7 and 4
	 * <p>
	 * Comparing 4 and -2
	 * <p>
	 * Comparing 1 and 7
	 * <p>
	 * Swapping 7 and 1
	 * <p>
	 * Comparing 1 and 4
	 * <p>
	 * Swapping 4 and 1
	 * <p>
	 * Comparing 1 and -2
	 * <p>
	 * Comparing 3 and 7
	 * <p>
	 * Swapping 7 and 3
	 * <p>
	 * Comparing 3 and 4
	 * <p>
	 * Swapping 4 and 3
	 * <p>
	 * Comparing 3 and 1
	 * <p>
	 * -2
	 * <p>
	 * 1
	 * <p>
	 * 3
	 * <p>
	 * 4
	 * <p>
	 * 7
	 * @param arr the given array
	 */
	public static void insertionSort(int[] arr)
	{
		for( int i = 0; i < arr.length - 1; i++ )
		{
			int j = i + 1;
			while(j > 0)
			{
				if( isGreater(arr, j - 1, j) )
				{
					swap(arr, j - 1, j);
				}
				else
				{
					break;
				}
				j--;
			}
		}

	}

	/**
	 * Merge Two Sorted Arrays
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given two sorted arrays(a,b) of integers.
	 * 2. You have to merge them and form one sorted array.
	 * 3. You have to do it in linear time complexity.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10^8
	 * <p>
	 * -10^9 <= a[i],b[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * a1
	 * a2 n integers
	 * <p>
	 * An integer m
	 * b1
	 * b2 m integers
	 * <p>
	 *
	 * Output
	 * <p>
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 4
	 * -2
	 * 5
	 * 9
	 * 11
	 * 3
	 * 4
	 * 6
	 * 8
	 * <p>
	 * Sample Output
	 * <p>
	 * -2
	 * 4
	 * 5
	 * 6
	 * 8
	 * 9
	 * 11
	 *
	 * @param a the first sorted array
	 * @param b the second sorted array
	 * @return the merged sorted array of given arrays
	 */
	public static int[] mergeTwoSortedArrays(int[] a, int[] b)
	{
		int l1 = a.length;
		int l2 = b.length;

		int[] c = new int[l1 + l2];

		int i = 0, j = 0, k = 0;

		while(i < l1 && j < l2)
		{
			if( a[i] < b[j] )
			{
				c[k] = a[i];
				i++;
			}
			else
			{
				c[k] = b[j];
				j++;
			}

			k++;
		}

		while(i < l1)
		{
			c[k] = a[i];
			i++;
			k++;
		}

		while(j < l2)
		{
			c[k] = b[j];
			j++;
			k++;
		}

		return c;
	}

	/**
	 * Merge Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * 2. You have to sort the given array in increasing order using the merge sort.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 100000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
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
	 * Merging these two arrays
	 * <p>
	 * left array -> 7
	 * <p>
	 * right array -> -2
	 * <p>
	 * Merging these two arrays
	 * <p>
	 * left array -> -2 7
	 * <p>
	 * right array -> 4
	 * <p>
	 * Merging these two arrays
	 * <p>
	 * left array -> 1
	 * <p>
	 * right array -> 3
	 * <p>
	 * Merging these two arrays
	 * <p>
	 * left array -> -2 4 7
	 * <p>
	 * right array -> 1 3
	 * <p>
	 * Sorted Array -> -2 1 3 4 7
	 * <p>
	 *
	 * @param arr the given array
	 * @param lo the first index
	 * @param hi the last index
	 * @return the sorted array
	 */
	public static int[] mergeSort(int[] arr, int lo, int hi)
	{
		if( lo == hi )
		{
			int[] sa = new int[1];
			sa[0] = arr[lo];
			return sa;
		}

		int mid = (lo + hi) / 2;

		int[] fsh = mergeSort(arr, lo, mid);
		int[] ssh = mergeSort(arr, mid + 1, hi);

		return mergeTwoSortedArrays(fsh, ssh);
	}

	/**
	 * Partition An Array
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers and a pivot.
	 * <p>
	 * 2. You have to re-arrange the given array in such a way that all elements smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.
	 * <p>
	 * 3. You have to achieve this in linear time.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 1 <= N <= 100000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * -10^9 <= pivot <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * An integer pivot
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input :
	 * <p>
	 * 5
	 * 7
	 * -2
	 * 4
	 * 1
	 * 3
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
	 * Swapping -2 and 7
	 * <p>
	 * Swapping 1 and 7
	 * <p>
	 * Swapping 3 and 4
	 * <p>
	 * -2 1 3 7 4
	 *
	 * @param arr the given array
	 * @param pivot the pivot
	 */
	public static void partitionAnArrayOnPivot(int[] arr, int pivot)
	{
		int i = 0, j = 0;

		while(i < arr.length)
		{
			if( arr[i] <= pivot )
			{
				swap(arr, i, j);
				j++;
			}

			i++;
		}

	}

	/**
	 * Quick Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using quick-sort.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 100000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input :
	 * <p>
	 * 5
	 * 7
	 * -2
	 * 4
	 * 1
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
	 * pivot -> 3
	 * <p>
	 * Swapping -2 and 7
	 * <p>
	 * Swapping 1 and 7
	 * <p>
	 * Swapping 3 and 4
	 * <p>
	 * pivot index -> 2
	 * <p>
	 * pivot -> 1
	 * <p>
	 * Swapping -2 and -2
	 * <p>
	 * Swapping 1 and 1
	 * <p>
	 * pivot index -> 1
	 * <p>
	 * pivot -> -2
	 * <p>
	 * Swapping -2 and -2
	 * <p>
	 * pivot index -> 0
	 * <p>
	 * pivot -> 4
	 * <p>
	 * Swapping 4 and 7
	 * <p>
	 * pivot index -> 3
	 * <p>
	 * pivot -> 7
	 * <p>
	 * Swapping 7 and 7
	 * <p>
	 * pivot index -> 4
	 * <p>
	 * -2 1 3 4 7
	 *
	 * @param arr the given array
	 * @param lo the first index
	 * @param hi the last index
	 */
	public static void quickSort(int[] arr, int lo, int hi)
	{
		if( lo >= hi )
		{
			return;
		}

		int pivot = arr[hi];

		int pi = partition(arr, pivot, lo, hi);

		quickSort(arr, lo, pi - 1);
		quickSort(arr, pi + 1, hi);
	}

	public static int partition(int[] arr, int pivot, int lo, int hi)
	{
		System.out.println("pivot -> " + pivot);
		int i = lo, j = lo;
		while(i <= hi)
		{
			if( arr[i] <= pivot )
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		System.out.println("pivot index -> " + (j - 1));
		return (j - 1);
	}

	/**
	 * Quick Select
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to find the kth smaller element in the given array using the quick-select algorithm.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 100000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * 1 <= k <= N
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * An integer k
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
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
	 * 3
	 * <p>
	 * Sample Output
	 * <p>
	 * pivot -> 3
	 * <p>
	 * Swapping -2 and 7
	 * <p>
	 * Swapping 1 and 7
	 * <p>
	 * Swapping 3 and 4
	 * <p>
	 * pivot index -> 2
	 * <p>
	 * 3
	 *
	 * @param arr the array
	 * @param lo the lowest index
	 * @param hi the highest index
	 * @param k the smallest element to find
	 * @return the smallest element
	 */
	public static int quickSelect(int[] arr, int lo, int hi, int k)
	{
		int pi = arr[hi];
		int pivot = partition(arr, pi, lo, hi);

		if( k == pivot )
		{
			return arr[pivot];
		}
		else if( k < pivot )
		{
			return quickSelect(arr, lo, pivot - 1, k);
		}
		else
		{
			return quickSelect(arr, pivot + 1, hi, k);
		}
	}

	/**
	 * Count Sort
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using count sort.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * -10^8 <= arr[i] <= 10^8
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * Check the sample output and question video.
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
	 * -2
	 * 1
	 * 3
	 * 4
	 * 7
	 *
	 * @param arr the array
	 * @param min the min value in array
	 * @param max the max value in array
	 */
	public static void countSort(int[] arr, int min, int max)
	{
		int range = max - min + 1;
		int[] ans = new int[arr.length];

		//make frequency arr
		int[] farr = new int[range];
		for( int j : arr )
		{
			farr[j - min]++;
		}

		//convert it into prefix sum array
		for( int i = 1; i < farr.length; i++ )
		{
			farr[i] += farr[i - 1];
		}

		//stable sorting(filling answer array)
		for( int i = arr.length - 1; i >= 0; i-- )
		{
			int pos = farr[arr[i] - min] - 1;
			ans[pos] = arr[i];
			farr[arr[i] - min]--;
		}

		//filling original array with the help of answer array
		System.arraycopy(ans, 0, arr, 0, arr.length);
	}

	/**
	 * Radix Sort
	 * <p><p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of integers.
	 * <p>
	 * 2. You have to sort the given array in increasing order using radix sort.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * 0 <= arr[i] <= 10^8
	 * <p>
	 * Format
	 * Input
	 * An Integer n
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 7
	 * 2
	 * 4
	 * 1
	 * 3
	 * <p>
	 * Sample Output
	 * <p>
	 * After sorting on 1 place -> 1 2 3 4 7
	 * <p>
	 * 1 2 3 4 7
	 *
	 * @param arr the array to sort
	 */
	public static void radixSort(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for( int j : arr )
		{
			max = Math.max(max, j);
		}
		//call countSort for every digit from right to left
		for( int exp = 1; max / exp >= 1; exp *= 10 )
		{
			countSort(arr, exp);
		}
	}

	public static void countSort(int[] arr, int exp)
	{
		int[] ans = new int[arr.length];
		// make frequency arr
		int[] farr = new int[10];
		for( int j : arr )
		{
			farr[(j / exp) % 10]++;
		}
		// convert it into prefix sum array
		for( int i = 1; i < farr.length; i++ )
		{
			farr[i] += farr[i - 1];
		}
		// stable sorting(filling answer array)
		for( int i = arr.length - 1; i >= 0; i-- )
		{
			int pos = farr[(arr[i] / exp) % 10] - 1;
			ans[pos] = arr[i];
			farr[(arr[i] / exp) % 10]--;
		}
		// filling original array with the help of answer array
		System.arraycopy(ans, 0, arr, 0, arr.length);
		System.out.print("After sorting on " + exp + " place -> ");
		print(arr);
	}

	public static void print(int[] arr)
	{
		for( int j : arr )
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}


	/**
	 * Sort Dates
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of different dates in format DD-MM-YYYY.
	 * <p>
	 * 2. You have to sort these dates in increasing order.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * All dates are between year 0 to year 2500
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer N
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * <p>
	 * 12041996
	 * <p>
	 * 20101996
	 * <p>
	 * 05061997
	 * <p>
	 * 12041989
	 * <p>
	 * 11081987
	 * <p>
	 * <p>
	 * Sample Output
	 * <p>
	 * 11081987
	 * <p>
	 * 12041989
	 * <p>
	 * 12041996
	 * <p>
	 * 20101996
	 * <p>
	 * 05061997
	 * <p>
	 *
	 * @param arr the given array
	 */
	public static void sortDates(String[] arr)
	{
		countSort(arr, 1000000, 100, 32);
		countSort(arr, 10000, 100, 13);
		countSort(arr, 1, 10000, 2501);
	}

	public static void countSort(String[] arr, int div, int mod, int range)
	{
		String[] ans = new String[arr.length];
		// make frequency arr
		int[] farr = new int[range];
		for( String s : arr )
		{
			farr[Integer.parseInt(s, 10) / div % mod]++;
		}
		// convert it into prefix sum array
		for( int i = 1; i < farr.length; i++ )
		{
			farr[i] += farr[i - 1];
		}
		// stable sorting(filling answer array)
		for( int i = arr.length - 1; i >= 0; i-- )
		{
			int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
			ans[pos] = arr[i];
			farr[Integer.parseInt(arr[i], 10) / div % mod]--;
		}
		// filling original array with the help of answer array
		System.arraycopy(ans, 0, arr, 0, arr.length);
	}

	/**
	 * Sort 01
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) containing only 0's and 1's.
	 * <p>
	 * 2. You have to sort the given array in increasing order and in linear time.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * arr[i] = 0,1
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer N
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * <p>
	 * 0
	 * 1
	 * 0
	 * 1
	 * 0
	 * <p>
	 * Sample Output
	 * <p>
	 * Swapping index 0 and index 0
	 * <p>
	 * Swapping index 2 and index 1
	 * <p>
	 * Swapping index 4 and index 2
	 * <p>
	 * 0
	 * 0
	 * 0
	 * 1
	 * 1
	 * <p>
	 * @param arr the given array
	 */
	public static void sort01(int[] arr)
	{
		// 0 to j-1  ->  All Zeroes //
		// j to i-1  ->  All One's //
		/* i to arr.length-1 -> All unknowns */

		int p = 0;

		int i = 0;
		int j = 0;

		while(i < arr.length)
		{
			if( arr[i] <= p )
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}

	}

	/**
	 * Sort 012
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) containing only 0's, 1's, and 2's.
	 * <p>
	 * 2. You have to sort the given array in increasing order and in linear time.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * arr[i] = 0,1,2
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * An Integer N
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * Check the sample output and question video.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 10
	 * <p>
	 * 1
	 * 0
	 * 2
	 * 2
	 * 1
	 * 0
	 * 2
	 * 1
	 * 0
	 * 2
	 * <p>
	 * Sample Output
	 * <p>
	 * Swapping index 1 and index 0
	 * <p>
	 * Swapping index 2 and index 9
	 * <p>
	 * Swapping index 2 and index 8
	 * <p>
	 * Swapping index 2 and index 1
	 * <p>
	 * Swapping index 3 and index 7
	 * <p>
	 * Swapping index 5 and index 2
	 * <p>
	 * Swapping index 6 and index 6
	 * <p>
	 * 0
	 * 0
	 * 0
	 * 1
	 * 1
	 * 1
	 * 2
	 * 2
	 * 2
	 * 2
	 *
	 * @param arr the given array
	 */
	public static void sort012(int[] arr)
	{
		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		while(i <= k)
		{
			if( arr[i] == 0 )
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else if( arr[i] == 1 )
			{
				i++;
			}
			else
			{
				swap(arr, i, k);
				k--;
			}
		}

	}

	/**
	 * Target Sum Pair 1
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of distinct integers and a target. 2. You have to print all the pairs having their sum equal to the target.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000 -10^9<= arr[i] <= 10^9
	 * <p>
	 *
	 * Format
	 * Input
	 * An Integer N arr1 arr2 n integers An integer target
	 * <p>
	 *
	 * Output
	 * <p>
	 * Check the sample output and question video.
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * 12
	 * 9
	 * -48
	 * 100
	 * 43
	 * 84
	 * 74
	 * 86
	 * 34
	 * -37
	 * 60
	 * -29
	 * 44
	 * 160
	 * <p>
	 * Sample Output
	 * <p>
	 * 60, 100
	 * 74, 86
	 *
	 * @param arr the given array
	 * @param target the target sum
	 * @return the list of number containing target sum pair
	 */
	public static List<String> targetSumPair(int[] arr, int target)
	{
		List<String> list = new ArrayList<>();

		Arrays.sort(arr);

		int l = 0;
		int r = arr.length - 1;

		while(l < r)
		{
			if( arr[l] + arr[r] > target )
			{
				r--;
			}
			else if( arr[l] + arr[r] < target )
			{
				l++;
			}
			else
			{
				System.out.println(arr[l] + ", " + arr[r]);
				list.add(arr[l] + ", " + arr[r]);
				l++;
				r--;
			}
		}

		return list;
	}

	/**
	 * Pivot In Sorted And Rotated Array
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an array(arr) of distinct integers, which is sorted and rotated around an unknown point.
	 * <p>
	 * 2. You have to find the smallest element in O(logN) time-complexity
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= N <= 10000
	 * <p>
	 * -10^9 <= arr[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * An Integer N
	 * arr1
	 * arr2
	 * n integers
	 * <p>
	 * Output
	 * <p>
	 * The smallest element
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 9
	 * 15
	 * 16
	 * 19
	 * 21
	 * 23
	 * 24
	 * 1
	 * 2
	 * 12
	 * <p>
	 * Sample Output
	 * <p>
	 * 1
	 *
	 * @param arr the given array
	 * @return the pivot (smaller number)
	 */
	public static int findPivot(int[] arr)
	{
		int lo = 0, hi = arr.length - 1;
		while(lo < hi)
		{
			int mid = (lo + hi) / 2;
			if( arr[mid] > arr[hi] )
			{
				lo = mid + 1;
			}
			else
			{
				hi = mid;
			}
		}
		return arr[lo];
	}
}
