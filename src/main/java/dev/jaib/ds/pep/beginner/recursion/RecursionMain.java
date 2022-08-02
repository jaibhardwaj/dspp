package dev.jaib.ds.pep.beginner.recursion;

public class RecursionMain
{
	public static void main(String[] args)
	{
		System.out.println("###### Tower of Hanoi ######");
		towerOfHanoi(3, 10, 11, 12);

		int[] arr = {10, 11, 12, 13, 14, 15};
		System.out.println("###### Display Array ######");
		displayArray(arr, 0);

		System.out.println("###### Display Array in Reverse ######");
		displayArrayInReverse(arr, 5);

		System.out.println("###### Display Array in Reverse 2 ######");
		displayArrayInReverse2(arr, 0);
	}

	/**
	 *
	 * Tower Of Hanoi
	 * Easy
	 *
	 * Tower Of Hanoi
	 * 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty. 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom. 3. You are required to 3.1. Print the instructions to move the disks. 3.2. from tower 1 to tower 2 using tower 3 3.3. following the rules 3.3.1 move 1 disk at a time. 3.3.2 never place a smaller disk under a larger disk. 3.3.3 you can only move a disk at the top. Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
	 * Constraints
	 * 0 <= n <= 9 10 <= n1, n2, n3 <= 10^9 n1 != n2 != n3
	 * Format
	 * Input
	 * A number n, representing number of disks A number n1, representing id of tower 1 A number n2, representing id of tower 2 A number n3, representing id of tower 3
	 *
	 *
	 * Output
	 * n[n1 -> n2] .. A set of instructions in above format to represent, move nth disc from n1 tower to n2 tower
	 *
	 *
	 * Example
	 * Sample Input
	 *
	 * 3
	 * 10
	 * 11
	 * 12
	 *
	 * Sample Output
	 * 1[10 -> 11]
	 * 2[10 -> 12]
	 * 1[11 -> 12]
	 * 3[10 -> 11]
	 * 1[12 -> 10]
	 * 2[12 -> 11]
	 * 1[10 -> 11]
	 *
	 * @param n the number of disks
	 * @param t1id the tower id
	 * @param t2id the tower id
	 * @param t3id the tower id
	 */
	public static void towerOfHanoi(int n, int t1id, int t2id, int t3id)
	{
		if( n == 0 )
		{
			return;
		}

		towerOfHanoi( n - 1, t1id, t3id, t2id );
		System.out.println(n + "[" + t1id + " -> " + t2id + "]");
		towerOfHanoi( n - 1, t3id, t2id, t1id );
	}

	/**
	 *
	 * Display Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to print the elements of array from beginning to end each in a separate line.
	 * 4. For the above purpose complete the body of displayArr function. Don't change the signature.
	 *
	 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
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
	 * n1
	 * n2
	 * .. n elements
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
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 *
	 * @param arr the array
	 * @param idx the array index
	 */
	public static void displayArray(int[] arr, int idx)
	{
		if( idx == arr.length )
		{
			return;
		}

		System.out.println(arr[idx]);
		displayArray(arr, idx + 1);

	}

	/**
	 *
	 * Display Array In Reverse
	 * Easy
	 *
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to print the elements of array from end to beginning each in a separate line.
	 * 4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
	 *
	 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
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
	 * n1
	 * n2
	 * .. n elements
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
	 * 5
	 * 7
	 * 0
	 * 1
	 * 3
	 *
	 * @param arr the give array
	 * @param idx the index
	 */
	public static void displayArrayInReverse(int[] arr, int idx)
	{
		if( idx < 0 )
		{
			return;
		}

		System.out.println(arr[idx]);
		displayArrayInReverse(arr, idx - 1);

	}

	public static void displayArrayInReverse2(int[] arr, int idx)
	{
		if( idx == arr.length )
		{
			return;
		}

		displayArrayInReverse2(arr, idx + 1);
		System.out.println(arr[idx]);
	}


	/**
	 *
	 * Max Of An Array
	 * Easy
	 *
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are required to find the maximum of input.
	 * 4. For the purpose complete the body of maxOfArray function. Don't change the signature.
	 *
	 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
	 *
	 * Constraints
	 * 1 <= n <= 10^4
	 * 0 <= n1, n2, .. n elements <= 10 ^9
	 *
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 *
	 * Output
	 * A number representing max
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
	 * 40
	 *
	 * @param arr the given array
	 * @param idx the index
	 * @return the max element from array
	 */
	public static int maxOfArray(int[] arr, int idx)
	{

		if( idx == arr.length - 1 )
		{
			return arr[idx];
		}
		int misa = maxOfArray(arr, idx + 1);

		if( misa > arr[idx] )
		{
			return misa;
		}
		else
		{
			return arr[idx];
		}
	}


}
