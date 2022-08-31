package dev.jaib.ds.pep.beginner.sorting;

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
		if( arr[i] < arr[j] )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// return true if jth element is greater than ith element
	public static boolean isGreater(int[] arr, int j, int i)
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
	 * arr2..
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
	 * a2..n integers
	 * <p>
	 * An integer m
	 * b1
	 * b2..m integers
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
	 * arr2..
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

		int[] fsa = mergeTwoSortedArrays(fsh, ssh);

		return fsa;
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
	 * arr2..
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
	 * arr2..
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
	 * 2. You have to find the k-th smallest element in the given array using the quick-select algorithm.
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
	 * arr2..
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
	 * arr2..
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
		for( int i = 0; i < arr.length; i++ )
		{
			farr[arr[i] - min]++;
		}

		//convert it into prefix sum array
		for( int i = 1; i < farr.length; i++ )
		{
			farr[i] += farr[i - 1];
		}

		//stable sorting(filling ans array)
		for( int i = arr.length - 1; i >= 0; i-- )
		{
			int pos = farr[arr[i] - min] - 1;
			ans[pos] = arr[i];
			farr[arr[i] - min]--;
		}

		//filling original array with the help of ans array
		System.arraycopy(ans, 0, arr, 0, arr.length);
	}

}
