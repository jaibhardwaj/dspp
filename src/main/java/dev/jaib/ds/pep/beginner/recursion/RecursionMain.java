package dev.jaib.ds.pep.beginner.recursion;

import java.util.ArrayList;

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

		System.out.println("###### Get Subsequence ######");
		System.out.println(getSubsequence("abc"));

		System.out.println("###### Get Maze Path ######");
		System.out.println(getMazePaths(1,1, 3, 3));

		System.out.println("###### Print Subsequence ######");
		printSubsequence("abc", "");

		System.out.println("###### Print KPC ######");
		printKPC("78", "");

		System.out.println("###### Print Stair Paths ######");
		printStairPaths(4, "");

	}

	/**
	 *
	 * Tower Of Hanoi
	 * <p>
	 * Easy
	 * <p>
	 * Tower Of Hanoi
	 * 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty. 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom. 3. You are required to 3.1. Print the instructions to move the disks. 3.2. from tower 1 to tower 2 using tower 3 3.3. following the rules 3.3.1 move 1 disk at a time. 3.3.2 never place a smaller disk under a larger disk. 3.3.3 you can only move a disk at the top.
	 * Constraints
	 * 0 <= n <= 9 10 <= n1, n2, n3 <= 10^9 n1 != n2 != n3
	 * Format
	 * Input
	 * A number n, representing number of disks A number n1, representing id of tower 1 A number n2, representing id of tower 2 A number n3, representing id of tower 3
	 * <p>
	 *
	 * Output
	 * n[n1 -> n2] .. A set of instructions in above format to represent, move nth disc from n1 tower to n2 tower
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * 3
	 * 10
	 * 11
	 * 12
	 * <p>
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
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to print the elements of array from beginning to end each in a separate line.
	 * 4. For the above purpose complete the body of displayArr function. Don't change the signature.
	 * <p>
	 * Constraints
	 * 1 <= n <= 30
	 * 0 <= n1, n2, .. n elements <= 10
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * <p>
	 * Output
	 * n1
	 * n2
	 * .. n elements
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 * <p>
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
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the size of array a.
	 * 2. You are given n numbers, representing elements of array a.
	 * 3. You are required to print the elements of array from end to beginning each in a separate line.
	 * 4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
	 * <p>
	 * <p>
	 * Constraints
	 * 1 <= n <= 30
	 * 0 <= n1, n2, .. n elements <= 10
	 * <p>
	 * Format
	 * <p>
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * <p>
	 * Output
	 * n1
	 * n2
	 * .. n elements
	 * <p>
	 * Example
	 * <p>
	 * Sample Input
	 * <p>
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 * <p>
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
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are required to find the maximum of input.
	 * 4. For the purpose complete the body of maxOfArray function. Don't change the signature.
	 * <p>
	 * <p>
	 * Constraints
	 * 1 <= n <= 10^4
	 * 0 <= n1, n2, .. n elements <= 10 ^9
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * <p>
	 * Output
	 * A number representing max
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 6
	 * 15
	 * 30
	 * 40
	 * 4
	 * 11
	 * 9
	 * <p>
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

	/**
	 *
	 * First Index
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are given a number x.
	 * 4. You are required to find the first index at which x occurs in array a.
	 * 5. If x exists in array, print the first index where it is found otherwise print -1.
	 * <p>
	 * <p>
	 * Constraints
	 * 1 <= n <= 10^4
	 * 0 <= n1, n2, .. n elements <= 10 ^ 3
	 * 0 <= x <= 10 ^ 3
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * A number x
	 * <p>
	 * Output
	 * A number representing first index of occurence of x in array a or -1 if not found at all.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 6
	 * 15
	 * 11
	 * 40
	 * 4
	 * 4
	 * 9
	 * 4
	 * <p>
	 * Sample Output
	 * 3
	 *
	 * @param arr the given array
	 * @param idx the index
	 * @param x the element to find
	 * @return the index of the element
	 */
	public static int firstIndex(int[] arr, int idx, int x)
	{
		if (idx == arr.length)
		{
			return -1;
		}


		if (arr[idx] == x)
		{
			return idx;
		}

		return firstIndex(arr, idx + 1, x);
	}

	/**
	 *
	 * Last Index
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are given a number x.
	 * 4. You are required to find the last index at which x occurs in array a.
	 * 5. If x exists in array, print the last index where it is found otherwise print -1.
	 * <p>
	 * <p>
	 * Constraints
	 * 1 <= n <= 10^4
	 * 0 <= n1, n2, .. n elements <= 10 ^ 3
	 * 0 <= x <= 10 ^ 3
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * A number x
	 * <p>
	 * Output
	 * A number representing last index of occurence of x in array a or -1 if not found at all.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 6
	 * 15
	 * 11
	 * 40
	 * 4
	 * 4
	 * 9
	 * 4
	 * <p>
	 * Sample Output
	 * 4
	 * @param arr the array
	 * @param idx the index
	 * @param x the element to find
	 * @return the last index of element
	 */
	public static int lastIndex(int[] arr, int idx, int x)
	{
		if( idx == arr.length )
		{
			return -1;
		}

		int index = lastIndex(arr, idx + 1, x);

		if( index == -1 )
		{
			if( arr[idx] == x )
			{
				return idx;
			}
			else
			{
				return index;
			}
		}
		else
		{
			return index;
		}
	}

	/**
	 *
	 * All Indices Of Array
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the count of elements.
	 * <p>
	 * 2. You are given n numbers.
	 * <p>
	 * 3. You are given a number x.
	 * <p>
	 * 4. You are required to return the all indices at which x occurs in array a.
	 * <p>
	 * 5. Return an array of appropriate size which contains all indices at which x occurs in array
	 * <p>
	 * 6. If no such element exist print "NO OUTPUT" a.
	 *
	 * <p>
	 *
	 * Constraints
	 * 1 <= n <= 10^4 0 <= n1, n2, .. n elements <= 10 ^ 3 0 <= x <= 10 ^ 3
	 * <p>
	 *
	 * Format
	 * Input
	 * A number n n1 n2 .. n number of elements A number x
	 * <p>
	 *
	 * Output
	 * Return the array of indices from the allIndices function. Display is managed for you.
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * 6
	 * 15
	 * 11
	 * 40
	 * 4
	 * 4
	 * 9
	 * 4
	 * <p>
	 * Sample Output
	 * 3
	 * 4
	 *
	 * @param arr the array
	 * @param x the element
	 * @param idx the index
	 * @param fsf the indices found so far
	 * @return the array containing the indices of elements in array
	 */
	public static int[] allIndices(int[] arr, int x, int idx, int fsf)
	{
		if( idx == arr.length )
		{
			return new int[fsf];
		}

		int[] iarr;

		if( arr[idx] == x )
		{
			iarr = allIndices(arr, x, idx + 1, fsf + 1);
			iarr[fsf] = idx;
		}
		else
		{
			iarr = allIndices(arr, x, idx + 1, fsf);
		}

		return iarr;
	}

	/**
	 *
	 * Get Subsequence
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences.
	 * <p>
	 *
	 * Constraints
	 * 0 <= str.length <= 20
	 * <p>
	 *
	 * Format
	 * Input
	 * A string str
	 * <p>
	 *
	 * Output
	 * Contents of the arraylist containing subsequences as shown in sample output
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * abc
	 * <p>
	 * Sample Output
	 * [, c, b, bc, a, ac, ab, abc]
	 *
	 * @param str teh given string
	 * @return the list containing all string subsequence
	 */
	//bc ->  [ --,-c ,b-, bc ]
	//abc->  [ ---,--c, -b-, -bc, a--,ab-,abc]\
	public static ArrayList<String> getSubsequence(String str)
	{
		if( str.length() == 0 )
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rres = getSubsequence(ros);
		ArrayList<String> mres = new ArrayList<>();
		for( String val : rres )
		{
			mres.add("" + val);
		}
		for( String val : rres )
		{
			mres.add(ch + val);
		}

		return mres;
	}

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

	/**
	 *
	 * Get Kpc
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
	 * 2. The following list is the key to characters map :
	 *     0 -> .;
	 *     1 -> abc
	 *     2 -> def
	 *     3 -> ghi
	 *     4 -> jkl
	 *     5 -> mno
	 *     6 -> pqrs
	 *     7 -> tu
	 *     8 -> vwx
	 *     9 -> yz
	 * 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
	 * Use sample input and output to take idea about output.
	 * <p>
	 * <p>
	 * Constraints
	 * 0 <= str.length <= 10
	 * str contains numbers only
	 * <p>
	 * Format
	 * Input
	 * A string str
	 * <p>
	 * Output
	 * Contents of the arraylist containing words as shown in sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 78
	 * <p>
	 * Sample Output
	 * [tv, tw, tx, uv, uw, ux]
	 *
	 * @param str the given string
	 * @return the list containing the keypad combination
	 */
	public static ArrayList<String> getKPC(String str)
	{
		if( str.length() == 0 )
		{
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}

		char ch = str.charAt(0);
		String sub = str.substring(1);

		ArrayList<String> rres = getKPC(sub);

		ArrayList<String> mres = new ArrayList<>();

		String codeforch = codes[ch - '0'];

		for( char c : codeforch.toCharArray() )
		{
			for( String val: rres)
			{
				mres.add(val + c);
			}
		}

		return mres;
	}


	/**
	 *
	 * Get Stair Paths
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n representing number of stairs in a staircase.
	 * 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
	 * 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
	 * Use sample input and output to take idea about output.
	 * <p>
	 * <p>
	 * Constraints
	 * 0 <= n <= 10
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * <p>
	 * Output
	 * Contents of the arraylist containing paths as shown in sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 3
	 * <p>
	 * Sample Output
	 * [111, 12, 21, 3]
	 * <p>
	 *
	 * @param n the stairs
	 * @return the list containing all way to stairs from source to destination
	 */
	public static ArrayList<String> getStairPaths(int n)
	{
		if( n == 0 )
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		else if( n < 0 )
		{
			return new ArrayList<>();
		}

		ArrayList<String> path1 = getStairPaths(n - 1);
		ArrayList<String> path2 = getStairPaths(n - 2);
		ArrayList<String> path3 = getStairPaths(n - 3);

		ArrayList<String> paths = new ArrayList<>();

		for( String path : path1 )
		{
			paths.add("1" + path);
		}
		for( String path : path2 )
		{
			paths.add("2" + path);
		}
		for( String path : path3 )
		{
			paths.add("3" + path);
		}

		return paths;
	}

	/**
	 *
	 * Get Maze Paths
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
	 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
	 * 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
	 * Use sample input and output to take idea about output.
	 * <p>
	 *
	 * Constraints
	 * 0 <= n <= 10
	 * 0 <= m <= 10
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * A number m
	 * <p>
	 * Output
	 * Contents of the arraylist containing paths as shown in sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 3
	 * 3
	 * <p>
	 * Sample Output
	 * [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
	 *
	 * @param sr the starting row
	 * @param sc the starting column
	 * @param dr the destination row
	 * @param dc the destination column
	 * @return the list containing all paths to reach out from S -> D
	 */
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
	{
		if( sr == dr && sc == dc )
		{
			ArrayList<String> dres = new ArrayList<>();
			dres.add("");
			return dres;
		}

		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();

		if( sc < dc )
		{
			hpaths = getMazePaths(sr, sc + 1, dr, dc);
		}

		if( sr < dr )
		{
			vpaths = getMazePaths(sr + 1, sc, dr, dc);
		}

		ArrayList<String> paths = new ArrayList<>();

		for( String hpath : hpaths )
		{
			paths.add("h" + hpath);
		}

		for( String vpath: vpaths )
		{
			paths.add("v" + vpath);
		}
		return paths;
	}

	/**
	 * Get Maze Path With Jumps
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
	 * 2. You are standing in the top-left corner and have to reach the bottom-right corner.
	 * 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
	 * 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
	 * Use sample input and output to take idea about output.
	 * <p>
	 *
	 * Constraints
	 * 0 <= n <= 10
	 * 0 <= m <= 10
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * A number m
	 * <p>
	 * Output
	 * Contents of the arraylist containing paths as shown in sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 2
	 * 2
	 * <p>
	 * Sample Output
	 * [h1v1, v1h1, d1]
	 *
	 * @param sr source row
	 * @param sc source column
	 * @param dr destination row
	 * @param dc destination column
	 * @return the list containing all paths from source to destination
	 */
	public static ArrayList<String> getMazePathWIthJumps(int sr, int sc, int dr, int dc)
	{
		if( sr == dr && sc == dc )
		{
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}

		ArrayList<String> paths = new ArrayList<>();

		//Horizontal paths
		for( int ms = 1; ms <= dc - sc; ms++ )
		{
			ArrayList<String> hpaths = getMazePathWIthJumps(sr, sc + ms, dr, dc);

			for( String path : hpaths )
			{
				paths.add("h" + ms + path);
			}
		}

		//Vertical paths
		for( int ms = 1; ms <= dr - sr; ms++ )
		{
			ArrayList<String> vpaths = getMazePathWIthJumps(sr + ms, sc, dr, dc);

			for( String path : vpaths )
			{
				paths.add("v" + ms + path);
			}
		}

		//Horizontal paths
		for( int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++ )
		{
			ArrayList<String> dpaths = getMazePathWIthJumps(sr + ms, sc + ms, dr, dc);

			for( String path : dpaths )
			{
				paths.add("d" + ms + path);
			}
		}

		return paths;
	}

	/**
	 * Print Subsequence
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str.
	 * 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
	 * Use sample input and output to take idea about subsequences.
	 * <p>
	 *
	 * Constraints
	 * 0 <= str.length <= 7
	 * <p>
	 * Format
	 * Input
	 * A string str
	 * <p>
	 * Output
	 * Subsequences of str in order hinted by Sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * yvTA
	 * <p>
	 * Sample Output
	 * yvTA
	 * yvT
	 * yvA
	 * yv
	 * yTA
	 * yT
	 * yA
	 * y
	 * vTA
	 * vT
	 * vA
	 * v
	 * TA
	 * T
	 * A
	 *
	 * @param str the string
	 * @param ans the final answer string
	 */
	public static void printSubsequence(String str, String ans)
	{
		if( str.length() == 0 )
		{
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String roq = str.substring(1);

		printSubsequence(roq, ans + ch);
		printSubsequence(roq, ans + "");

	}

	/**
	 * Print Kpc
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone. 2. The following list is the key to characters map 0 -> .; 1 -> abc 2 -> def 3 -> ghi 4 -> jkl 5 -> mno 6 -> pqrs 7 -> tu 8 -> vwx 9 -> yz 3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str. Use sample input and output to take idea about output.
	 * <p>
	 *
	 * Constraints
	 * 0 <= str.length <= 10 str contains numbers only
	 * <p>
	 *
	 * Format
	 * Input
	 * A string str
	 * <p>
	 *
	 * Output
	 * Words that can be produced by pressed keys indictated by str in order hinted by Sample output
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * 78
	 * <p>
	 * Sample Output
	 * tv
	 * tw
	 * tx
	 * uv
	 * uw
	 * ux
	 *
	 * @param str the keypad number string
	 * @param asf the answer string
	 */
	public static void printKPC(String str, String asf)
	{
		if( str.length() == 0 )
		{
			System.out.println(asf);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		for( char val : codes[ch - '0'].toCharArray() )
		{
			printKPC(ros, asf + val);
		}
	}

	/**
	 * Print Stair Paths
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n representing number of stairs in a staircase.
	 * 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
	 * 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
	 * Use sample input and output to take idea about output.
	 * <p>
	 *
	 * Constraints
	 * 0 <= n <= 10
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * <p>
	 * Output
	 * Print paths (one path in each line) in order hinted by Sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 3
	 * <p>
	 * Sample Output
	 * 111
	 * 12
	 * 21
	 * 3
	 * @param n the stairs in staircase
	 * @param path the path to climb
	 */
	public static void printStairPaths(int n, String path)
	{
		if( n == 0 )
		{
			System.out.println(path);
			return;
		}
		else if( n < 0 )
		{
			return;
		}

		printStairPaths(n - 1, path + "1");
		printStairPaths(n - 2, path + "2");
		printStairPaths(n - 3, path + "3");
	}

}
