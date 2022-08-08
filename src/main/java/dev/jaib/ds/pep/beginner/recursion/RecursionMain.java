package dev.jaib.ds.pep.beginner.recursion;

import java.util.ArrayList;

public class RecursionMain
{
	public static void main(String[] args)
	{
		System.out.println("###### Tower of Hanoi ######");
		towerOfHanoi(3, 10, 11, 12);

		int[] arr = {10, 20, 30, 40, 50, 60};
		System.out.println("###### Display Array ######");
		displayArray(arr, 0);

		System.out.println("###### Display Array in Reverse ######");
		displayArrayInReverse(arr, 5);

		System.out.println("###### Display Array in Reverse 2 ######");
		displayArrayInReverse2(arr, 0);

		System.out.println("###### Get Subsequence ######");
		System.out.println(getSubsequence("abc"));

		System.out.println("###### Get Maze Path ######");
		System.out.println(getMazePaths(1, 1, 3, 3));

		System.out.println("###### Print Subsequence ######");
		printSubsequence("abc", "");

		System.out.println("###### Print KPC ######");
		printKPC("78", "");

		System.out.println("###### Print Stair Paths ######");
		printStairPaths(4, "");

		System.out.println("###### Print Maze Paths ######");
		printMazePaths(1, 1, 3, 3, "");

		System.out.println("###### Print Maze Paths With Jump ######");
		printMazePathsWithJump(1, 1, 3, 3, "");

		System.out.println("###### Print Permutation ######");
		printPermutations("abc", "");

		System.out.println("###### Print Encodings ######");
		printEncodings("123", "");

		System.out.println("###### Print Flood Fills ######");
		int[][] maze = new int[3][3];
		maze[0][0] = 0;
		maze[0][1] = 0;
		maze[0][2] = 0;
		maze[1][0] = 1;
		maze[1][1] = 0;
		maze[1][2] = 1;
		maze[2][0] = 0;
		maze[2][1] = 0;
		maze[2][2] = 0;
		boolean[][] visited = new boolean[3][3];
		floodfill(maze, 0, 0, "", visited);

		System.out.println("###### Print Target Sum Subset ######");
		printTargetSumSubsets(arr, 0, "", 0, 70);

		System.out.println("###### Print N Queens ######");
		int[][] arr1 = new int[4][4];
		printNQueens(arr1, "", 0);

		System.out.println("###### Print Knights Tour ######");
		int[][] chess = new int[5][5];
		printKnightsTour(chess, 2, 0, 1);

	}

	/**
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
	 * <p>
	 * Output
	 * n[n1 -> n2] .. A set of instructions in above format to represent, move nth disc from n1 tower to n2 tower
	 * <p>
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 3
	 * 10
	 * 11
	 * 12
	 * <p>
	 * Sample Output :
	 * <p>
	 * 1[10 -> 11]
	 * 2[10 -> 12]
	 * 1[11 -> 12]
	 * 3[10 -> 11]
	 * 1[12 -> 10]
	 * 2[12 -> 11]
	 * 1[10 -> 11]
	 *
	 * @param n    the number of disks
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

		towerOfHanoi(n - 1, t1id, t3id, t2id);
		System.out.println(n + "[" + t1id + " -> " + t2id + "]");
		towerOfHanoi(n - 1, t3id, t2id, t1id);
	}

	/**
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 5
	 * 3
	 * 1
	 * 0
	 * 7
	 * 5
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 6
	 * 15
	 * 30
	 * 40
	 * 4
	 * 11
	 * 9
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
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
	 * Sample Output :
	 * <p>
	 * 3
	 *
	 * @param arr the given array
	 * @param idx the index
	 * @param x   the element to find
	 * @return the index of the element
	 */
	public static int firstIndex(int[] arr, int idx, int x)
	{
		if( idx == arr.length )
		{
			return -1;
		}


		if( arr[idx] == x )
		{
			return idx;
		}

		return firstIndex(arr, idx + 1, x);
	}

	/**
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
	 * Example :
	 * <p>
	 * Sample Input :
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
	 * Sample Output :
	 * <p>
	 * 4
	 *
	 * @param arr the array
	 * @param idx the index
	 * @param x   the element to find
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
	 * <p>
	 * Constraints
	 * 1 <= n <= 10^4 0 <= n1, n2, .. n elements <= 10 ^ 3 0 <= x <= 10 ^ 3
	 * <p>
	 * <p>
	 * Format
	 * Input
	 * A number n n1 n2 .. n number of elements A number x
	 * <p>
	 * <p>
	 * Output
	 * Return the array of indices from the allIndices function. Display is managed for you.
	 * <p>
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
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
	 * Sample Output :
	 * <p>
	 * 3
	 * 4
	 *
	 * @param arr the array
	 * @param x   the element
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
	 * Get Subsequence
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences.
	 * <p>
	 * <p>
	 * Constraints
	 * 0 <= str.length <= 20
	 * <p>
	 * <p>
	 * Format
	 * Input
	 * A string str
	 * <p>
	 * <p>
	 * Output
	 * Contents of the arraylist containing subsequences as shown in sample output
	 * <p>
	 * <p>
	 * Example:
	 * <p>
	 * Sample Input:
	 * <p>
	 * abc
	 * <p>
	 * Sample Output:
	 * <p>
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

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	/**
	 * Get Kpc
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
	 * 2. The following list is the key to characters map :
	 * 0 -> .;
	 * 1 -> abc
	 * 2 -> def
	 * 3 -> ghi
	 * 4 -> jkl
	 * 5 -> mno
	 * 6 -> pqrs
	 * 7 -> tu
	 * 8 -> vwx
	 * 9 -> yz
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
	 * Example:
	 * <p>
	 * Sample Input:
	 * <p>
	 * 78
	 * <p>
	 * Sample Output:
	 * <p>
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
			for( String val : rres )
			{
				mres.add(val + c);
			}
		}

		return mres;
	}


	/**
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * Get Maze Paths
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
	 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
	 * 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
	 * Use sample input and output to take idea about output.
	 * <p>
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 3
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
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

		for( String vpath : vpaths )
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
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 2
	 * 2
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * <p>
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
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * yvTA
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * <p>
	 * Constraints
	 * 0 <= str.length <= 10 str contains numbers only
	 * <p>
	 * <p>
	 * Format
	 * Input
	 * A string str
	 * <p>
	 * <p>
	 * Output
	 * Words that can be produced by pressed keys indictated by str in order hinted by Sample output
	 * <p>
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 78
	 * <p>
	 * Sample Output :
	 * <p>
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
	 * <p>
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
	 * <p>
	 * Sample Input :
	 * <p>
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
	 * 111
	 * 12
	 * 21
	 * 3
	 *
	 * @param n    the stairs in staircase
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

	/**
	 * Print Maze Paths
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
	 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
	 * 3. Complete the body of pri tMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
	 * Use sample input and output to take idea about output.
	 * <p>
	 * <p>
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
	 * Print paths (one path in each line) in order hinted by Sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 2
	 * 2
	 * <p>
	 * Sample Output
	 * <p>
	 * hv
	 * vh
	 *
	 * @param sr   source row
	 * @param sc   source column
	 * @param dr   destination row
	 * @param dc   destination column
	 * @param path the paths to follow
	 */
	public static void printMazePaths(int sr, int sc, int dr, int dc, String path)
	{
		if( sr == dr && sc == dc )
		{
			System.out.println(path);
		}

		if( sc < dc )
		{
			printMazePaths(sr, sc + 1, dr, dc, path + "h");
		}

		if( sr < dr )
		{
			printMazePaths(sr + 1, sc, dr, dc, path + "v");
		}
	}

	/**
	 * Print Maze Paths With Jumps
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
	 * 2. You are standing in the top-left corner and have to reach the bottom-right corner.
	 * 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
	 * 4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
	 * Use sample input and output to take idea about output.
	 * <p>
	 * <p>
	 * Constraints
	 * 0 <= n <= 5
	 * 0 <= m <= 5
	 * <p>
	 * Format
	 * Input
	 * A number n
	 * A number m
	 * <p>
	 * Output
	 * Print paths (one path in each line) in order hinted by Sample output
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * <p>
	 * 3
	 * 3
	 * <p>
	 * Sample Output :
	 * <p>
	 * h1h1v1v1
	 * h1h1v2
	 * h1v1h1v1
	 * h1v1v1h1
	 * h1v1d1
	 * h1v2h1
	 * h1d1v1
	 * h2v1v1
	 * h2v2
	 * v1h1h1v1
	 * v1h1v1h1
	 * v1h1d1
	 * v1h2v1
	 * v1v1h1h1
	 * v1v1h2
	 * v1d1h1
	 * v2h1h1
	 * v2h2
	 * d1h1v1
	 * d1v1h1
	 * d1d1
	 * d2
	 *
	 * @param sr   source row
	 * @param sc   source column
	 * @param dr   destination row
	 * @param dc   destination column
	 * @param path the paths to follow
	 */
	public static void printMazePathsWithJump(int sr, int sc, int dr, int dc, String path)
	{
		if( sr > dr || sc > dc )
		{
			return;
		}

		if( sr == dr && sc == dc )
		{
			System.out.println(path);
			return;
		}

		// Horizontal Paths
		for( int ms = 1; ms <= dc - sc; ms++ )
		{
			printMazePathsWithJump(sr, sc + ms, dr, dc, path + "h" + ms);
		}

		// Vertical Paths
		for( int ms = 1; ms <= dr - sr; ms++ )
		{
			printMazePathsWithJump(sr + ms, sc, dr, dc, path + "v" + ms);
		}

		// Diagonal Paths
		for( int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++ )
		{
			printMazePathsWithJump(sr + ms, sc + ms, dr, dc, path + "d" + ms);
		}
	}

	/**
	 * Print Permutations
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str.
	 * 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
	 * Use sample input and output to take idea about permutations.
	 * <p>
	 * <p>
	 * Constraints
	 * 0 <= str.length <= 7
	 * <p>
	 * Format
	 * Input :
	 * <p>
	 * A string str
	 * <p>
	 * Output :
	 * <p>
	 * Permutations of str in order hinted by Sample output
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * abc
	 * <p>
	 * Sample Output :
	 * <p>
	 * abc
	 * acb
	 * bac
	 * bca
	 * cab
	 * cba
	 *
	 * @param str the string
	 * @param ans the answer containing permutation of string
	 */
	public static void printPermutations(String str, String ans)
	{
		if( str.length() == 0 )
		{
			System.out.println(ans); // Question string is empty so print the answer now and return
			return;
		}

		// Extracting each character at a time from the question string and appending it to answer so far
		for( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt(i);

			// Substring from 0 to i-1 (left to ch) + Substring from i+1 till end of String (right to ch)
			// Remaining string after extracting ch
			String ros = str.substring(0, i) + str.substring(i + 1);

			printPermutations(ros, ans + ch);
		}
	}


	/**
	 * Print Encodings
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string str of digits. (will never start with a 0)
	 * 2. You are required to encode the str as per following rules
	 *     1 -> a
	 *     2 -> b
	 *     3 -> c
	 *     ..
	 *     25 -> y
	 *     26 -> z
	 * 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
	 * Use the input-output below to get more understanding on what is required
	 * 123 -> abc, aw, lc
	 * 993 -> iic
	 * 013 -> Invalid input. A string starting with 0 will not be passed.
	 * 103 -> jc
	 * 303 -> No output possible. But such a string maybe passed. In this case print nothing.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 0 <= str.length <= 10
	 * <p>
	 * Format
	 * <p>
	 * Input
	 * A string str
	 * <p>
	 * Output
	 * Permutations of str in order hinted by Sample output
	 * <p>
	 * Example :
	 * <p>
	 * Sample Input :
	 * <p>
	 * 655196
	 * <p>
	 * Sample Output :
	 * <p>
	 * feeaif
	 * feesf
	 *
	 * @param str the number string
	 * @param ans the answer containing the encoding
	 */
	public static void printEncodings(String str, String ans)
	{
		if( str.length() == 0 )
		{
			System.out.println(ans);
		}
		else if( str.length() == 1 )
		{
			char ch = str.charAt(0);

			if( ch == '0' )
			{
				return;
			}
			else
			{
				int chv = ch - '0';
				char code = (char) ('a' + chv - 1);
				System.out.println(ans + code);
			}
		}
		else
		{
			char ch = str.charAt(0);
			String roq = str.substring(1);

			if( ch == '0' )
			{
				return;
			}
			else
			{
				int chv = ch - '0';
				char code = (char) ('a' + chv - 1);
				printEncodings(roq, ans + code);
			}

			String ch12 = str.substring(0, 2);
			String roq12 = str.substring(2);

			int ch12v = Integer.parseInt(ch12);

			if( ch12v <= 26 )
			{
				char code = (char) ('a' + ch12v - 1);
				printEncodings(roq12, ans + code);
			}

		}
	}

	/**
	 * Flood Fill
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the number of rows.
	 * <p>
	 * 2. You are given a number m, representing the number of columns.
	 * <p>
	 * 3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
	 * <p>
	 * 4. You are standing in the top-left corner and have to reach the bottom-right corner.
	 * <p>
	 * Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right). You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
	 * <p>
	 * 5. Complete the body of floodfill function - without changing signature - to print all paths that can be used to move from top-left to bottom-right.
	 * <p>
	 * Note1 -> Please check the sample input and output for details
	 * <p>
	 * Note2 -> If all four moves are available make moves in the order 't', 'l', 'd' and 'r'
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= n <= 10
	 * 1 <= m <= 10
	 * e1, e2, .. n * m elements belongs to set (0, 1)
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * A number n
	 * A number m
	 * e11
	 * e12..
	 * e21
	 * e22..
	 * .. n * m number of elements
	 * <p>
	 * Output :
	 * <p>
	 * trrrdlt
	 * tlldrt
	 * .. and so on
	 * <p>
	 * Example
	 * Sample Input :
	 * <p>
	 * 3 3
	 * <p>
	 * 0 0 0
	 * <p>
	 * 1 0 1
	 * <p>
	 * 0 0 0
	 * <p>
	 * Sample Output :
	 * <p>
	 * rddr
	 *
	 * @param maze the maze
	 * @param sr the row index
	 * @param sc the column index
	 * @param asf the answer so far
	 * @param visited is cell visited
	 */
	public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited)
	{
		if( sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] )
		{
			return;
		}
		if( sr == maze.length - 1 && sc == maze[0].length - 1 )
		{
			System.out.println(asf);
			return;
		}
		visited[sr][sc] = true;
		floodfill(maze, sr - 1, sc, asf + "t", visited);
		floodfill(maze, sr, sc - 1, asf + "l", visited);
		floodfill(maze, sr + 1, sc, asf + "d", visited);
		floodfill(maze, sr, sc + 1, asf + "r", visited);
		visited[sr][sc] = false;
	}

	/**
	 * Target Sum Subsets
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the count of elements.
	 * 2. You are given n numbers.
	 * 3. You are given a number "tar".
	 * 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 1 <= n <= 30
	 * 0 <= n1, n2, .. n elements <= 20
	 * 0 <= tar <= 50
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input Format
	 * <p>
	 * A number n
	 * n1
	 * n2
	 * .. n number of elements
	 * A number tar
	 * <p>
	 * Output
	 * <p>
	 * Comma separated elements of the subset, the contents of which add to "tar"
	 * .. all such subsets, each in a single line (the elements of each subset should be comma separated)
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 10
	 * 20
	 * 30
	 * 40
	 * 50
	 * 60
	 * <p>
	 * Sample Output :
	 * <p>
	 * 10, 20, 30, .
	 * 10, 50, .
	 * 20, 40, .
	 *
	 * @param arr the array
	 * @param idx the index
	 * @param set the subset
	 * @param sos the sum of subset
	 * @param tar the target sum
	 */
	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar)
	{
		if( idx == arr.length )
		{
			if( sos == tar )
			{
				System.out.println(set + ".");
			}
			return;
		}

		printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
		printTargetSumSubsets(arr, idx + 1, set, sos, tar);
	}

	/**
	 * N Queens
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, the size of a chess board.
	 * 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
	 * Note - Queens kill at distance in all 8 directions
	 * 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 1 <= n <= 10
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * A number n
	 * <p>
	 * Output :
	 * <p>
	 * Safe configurations of queens as suggested in sample output
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 4
	 * <p>
	 * Sample Output :
	 * <p>
	 * 0-1, 1-3, 2-0, 3-2, .
	 * 0-2, 1-0, 2-3, 3-1, .
	 * <p>
	 *
	 * @param chess the 2d array
	 * @param qsf the question so far
	 * @param row the row index
	 */
	public static void printNQueens(int[][] chess, String qsf, int row)
	{
		if( row == chess.length )
		{
			System.out.println(qsf + ".");
			return;
		}
		for( int col = 0; col < chess.length; col++ )
		{
			if( chess[row][col] == 0 && isQueenSafe(chess, row, col))
			{
				chess[row][col] = 1;
				printNQueens(chess,
						qsf + row + "-" + col + ", ", row + 1);
				chess[row][col] = 0;
			}
		}
	}

	private static boolean isQueenSafe(int[][] chess, int row, int col)
	{
		for( int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j-- )
		{
			if( chess[i][j] == 1 )
			{
				return false;
			}
		}

		for( int i = row - 1, j = col; i >= 0; i-- )
		{
			if( chess[i][j] == 1 )
			{
				return false;
			}
		}

		for( int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++ )
		{
			if( chess[i][j] == 1 )
			{
				return false;
			}
		}

		for( int i = row, j = col - 1; j >= 0; j-- )
		{
			if( chess[i][j] == 1 )
			{
				return false;
			}
		}

		return true;
	}

	/**
	 *
	 * Knights Tour
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, the size of a chess board.
	 * 2. You are given a row and a column, as a starting point for a knight piece.
	 * 3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits
	 *      all cells of the board exactly once.
	 * 4. Complete the body of printKnightsTour function - without changing signature - to calculate and
	 *      print all configurations of the chess board representing the route
	 *      of knight through the chess board. Use sample input and output to get more idea.
	 * <p>
	 * Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and
	 *                move in clockwise manner to
	 *                explore other options.
	 * <p>
	 * Constraints
	 * <p>
	 * n = 5
	 * <p>
	 * 0 <= row < n
	 * <p>
	 * 0 <= col < n
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * A number n
	 * <p>
	 * A number row
	 * <p>
	 * A number col
	 * <p>
	 * Output
	 * <p>
	 * All configurations of the chess board representing route of knights through the chess board starting in (row, col)
	 * Use displayBoard function to print one configuration of the board.
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 2
	 * 0
	 * <p>
	 * Sample Output
	 * <p>
	 * 25 2 13 8 23
	 * 12 7 24 3 14
	 * 1 18 15 22 9
	 * 6 11 20 17 4
	 * 19 16 5 10 21
	 * <p>
	 * 19 2 13 8 21
	 * 12 7 20 3 14
	 * 1 18 15 22 9
	 * 6 11 24 17 4
	 * 25 16 5 10 23
	 * <p>
	 * 25 2 13 8 19
	 * 12 7 18 3 14
	 * 1 24 15 20 9
	 * 6 11 22 17 4
	 * 23 16 5 10 21
	 * <p>
	 * 19 2 13 8 25
	 * 12 7 18 3 14
	 * 1 20 15 24 9
	 * 6 11 22 17 4
	 * 21 16 5 10 23
	 * <p>
	 * 21 2 17 8 19
	 * 12 7 20 3 16
	 * 1 22 13 18 9
	 * 6 11 24 15 4
	 * 23 14 5 10 25
	 * <p>
	 * 23 2 17 8 25
	 * 12 7 24 3 16
	 * 1 22 13 18 9
	 * 6 11 20 15 4
	 * 21 14 5 10 19
	 * <p>
	 * 25 2 17 8 23
	 * 12 7 24 3 16
	 * 1 18 13 22 9
	 * 6 11 20 15 4
	 * 19 14 5 10 21
	 * <p>
	 * 19 2 17 8 21
	 * 12 7 20 3 16
	 * 1 18 13 22 9
	 * 6 11 24 15 4
	 * 25 14 5 10 23
	 * <p>
	 * 25 2 15 8 19
	 * 16 7 18 3 14
	 * 1 24 11 20 9
	 * 6 17 22 13 4
	 * 23 12 5 10 21
	 * <p>
	 * 19 2 15 8 25
	 * 16 7 18 3 14
	 * 1 20 11 24 9
	 * 6 17 22 13 4
	 * 21 12 5 10 23
	 * <p>
	 * 21 2 15 8 19
	 * 16 7 20 3 14
	 * 1 22 11 18 9
	 * 6 17 24 13 4
	 * 23 12 5 10 25
	 * <p>
	 * 23 2 15 8 25
	 * 16 7 24 3 14
	 * 1 22 11 18 9
	 * 6 17 20 13 4
	 * 21 12 5 10 19
	 * <p>
	 * 23 2 13 8 21
	 * 14 7 22 3 12
	 * 1 24 9 20 17
	 * 6 15 18 11 4
	 * 25 10 5 16 19
	 * <p>
	 * 21 2 13 8 23
	 * 14 7 22 3 12
	 * 1 20 9 24 17
	 * 6 15 18 11 4
	 * 19 10 5 16 25
	 * <p>
	 * 25 2 13 8 19
	 * 14 7 18 3 12
	 * 1 24 9 20 17
	 * 6 15 22 11 4
	 * 23 10 5 16 21
	 * <p>
	 * 19 2 13 8 25
	 * 14 7 18 3 12
	 * 1 20 9 24 17
	 * 6 15 22 11 4
	 * 21 10 5 16 23
	 * <p>
	 * 21 2 11 16 19
	 * 12 17 20 3 10
	 * 1 22 7 18 15
	 * 6 13 24 9 4
	 * 23 8 5 14 25
	 * <p>
	 * 23 2 11 16 25
	 * 12 17 24 3 10
	 * 1 22 7 18 15
	 * 6 13 20 9 4
	 * 21 8 5 14 19
	 * <p>
	 * 23 2 11 16 21
	 * 12 17 22 3 10
	 * 1 24 7 20 15
	 * 6 13 18 9 4
	 * 25 8 5 14 19
	 * <p>
	 * 21 2 11 16 23
	 * 12 17 22 3 10
	 * 1 20 7 24 15
	 * 6 13 18 9 4
	 * 19 8 5 14 25
	 * <p>
	 * 21 2 9 14 19
	 * 10 15 20 3 8
	 * 1 22 5 18 13
	 * 16 11 24 7 4
	 * 23 6 17 12 25
	 * <p>
	 * 23 2 9 14 25
	 * 10 15 24 3 8
	 * 1 22 5 18 13
	 * 16 11 20 7 4
	 * 21 6 17 12 19
	 * <p>
	 * 25 2 9 14 23
	 * 10 15 24 3 8
	 * 1 18 5 22 13
	 * 16 11 20 7 4
	 * 19 6 17 12 21
	 * <p>
	 * 19 2 9 14 21
	 * 10 15 20 3 8
	 * 1 18 5 22 13
	 * 16 11 24 7 4
	 * 25 6 17 12 23
	 * <p>
	 * 23 2 7 12 21
	 * 8 13 22 17 6
	 * 1 24 3 20 11
	 * 14 9 18 5 16
	 * 25 4 15 10 19
	 * <p>
	 * 21 2 7 12 23
	 * 8 13 22 17 6
	 * 1 20 3 24 11
	 * 14 9 18 5 16
	 * 19 4 15 10 25
	 * <p>
	 * 25 2 7 12 23
	 * 8 13 24 17 6
	 * 1 18 3 22 11
	 * 14 9 20 5 16
	 * 19 4 15 10 21
	 * <p>
	 * 19 2 7 12 21
	 * 8 13 20 17 6
	 * 1 18 3 22 11
	 * 14 9 24 5 16
	 * 25 4 15 10 23
	 * <p>
	 * 25 4 15 10 23
	 * 14 9 24 5 16
	 * 1 18 3 22 11
	 * 8 13 20 17 6
	 * 19 2 7 12 21
	 * <p>
	 * 19 4 15 10 21
	 * 14 9 20 5 16
	 * 1 18 3 22 11
	 * 8 13 24 17 6
	 * 25 2 7 12 23
	 * <p>
	 * 25 4 15 10 19
	 * 14 9 18 5 16
	 * 1 24 3 20 11
	 * 8 13 22 17 6
	 * 23 2 7 12 21
	 * <p>
	 * 19 4 15 10 25
	 * 14 9 18 5 16
	 * 1 20 3 24 11
	 * 8 13 22 17 6
	 * 21 2 7 12 23
	 * <p>
	 * 21 6 17 12 19
	 * 16 11 20 7 4
	 * 1 22 5 18 13
	 * 10 15 24 3 8
	 * 23 2 9 14 25
	 * <p>
	 * 23 6 17 12 25
	 * 16 11 24 7 4
	 * 1 22 5 18 13
	 * 10 15 20 3 8
	 * 21 2 9 14 19
	 * <p>
	 * 25 6 17 12 23
	 * 16 11 24 7 4
	 * 1 18 5 22 13
	 * 10 15 20 3 8
	 * 19 2 9 14 21
	 * <p>
	 * 19 6 17 12 21
	 * 16 11 20 7 4
	 * 1 18 5 22 13
	 * 10 15 24 3 8
	 * 25 2 9 14 23
	 * <p>
	 * 25 8 5 14 19
	 * 6 13 18 9 4
	 * 1 24 7 20 15
	 * 12 17 22 3 10
	 * 23 2 11 16 21
	 * <p>
	 * 19 8 5 14 25
	 * 6 13 18 9 4
	 * 1 20 7 24 15
	 * 12 17 22 3 10
	 * 21 2 11 16 23
	 * <p>
	 * 21 8 5 14 19
	 * 6 13 20 9 4
	 * 1 22 7 18 15
	 * 12 17 24 3 10
	 * 23 2 11 16 25
	 * <p>
	 * 23 8 5 14 25
	 * 6 13 24 9 4
	 * 1 22 7 18 15
	 * 12 17 20 3 10
	 * 21 2 11 16 19
	 * <p>
	 * 21 12 5 10 19
	 * 6 17 20 13 4
	 * 1 22 11 18 9
	 * 16 7 24 3 14
	 * 23 2 15 8 25
	 * <p>
	 * 23 12 5 10 25
	 * 6 17 24 13 4
	 * 1 22 11 18 9
	 * 16 7 20 3 14
	 * 21 2 15 8 19
	 * <p>
	 * 23 12 5 10 21
	 * 6 17 22 13 4
	 * 1 24 11 20 9
	 * 16 7 18 3 14
	 * 25 2 15 8 19
	 * <p>
	 * 21 12 5 10 23
	 * 6 17 22 13 4
	 * 1 20 11 24 9
	 * 16 7 18 3 14
	 * 19 2 15 8 25
	 * <p>
	 * 21 14 5 10 19
	 * 6 11 20 15 4
	 * 1 22 13 18 9
	 * 12 7 24 3 16
	 * 23 2 17 8 25
	 * <p>
	 * 23 14 5 10 25
	 * 6 11 24 15 4
	 * 1 22 13 18 9
	 * 12 7 20 3 16
	 * 21 2 17 8 19
	 * <p>
	 * 25 14 5 10 23
	 * 6 11 24 15 4
	 * 1 18 13 22 9
	 * 12 7 20 3 16
	 * 19 2 17 8 21
	 * <p>
	 * 19 14 5 10 21
	 * 6 11 20 15 4
	 * 1 18 13 22 9
	 * 12 7 24 3 16
	 * 25 2 17 8 23
	 * <p>
	 * 23 16 5 10 21
	 * 6 11 22 17 4
	 * 1 24 15 20 9
	 * 12 7 18 3 14
	 * 25 2 13 8 19
	 * <p>
	 * 21 16 5 10 23
	 * 6 11 22 17 4
	 * 1 20 15 24 9
	 * 12 7 18 3 14
	 * 19 2 13 8 25
	 * <p>
	 * 25 16 5 10 23
	 * 6 11 24 17 4
	 * 1 18 15 22 9
	 * 12 7 20 3 14
	 * 19 2 13 8 21
	 * <p>
	 * 19 16 5 10 21
	 * 6 11 20 17 4
	 * 1 18 15 22 9
	 * 12 7 24 3 14
	 * 25 2 13 8 23
	 * <p>
	 * 23 10 5 16 21
	 * 6 15 22 11 4
	 * 1 24 9 20 17
	 * 14 7 18 3 12
	 * 25 2 13 8 19
	 * <p>
	 * 21 10 5 16 23
	 * 6 15 22 11 4
	 * 1 20 9 24 17
	 * 14 7 18 3 12
	 * 19 2 13 8 25
	 * <p>
	 * 25 10 5 16 19
	 * 6 15 18 11 4
	 * 1 24 9 20 17
	 * 14 7 22 3 12
	 * 23 2 13 8 21
	 * <p>
	 * 19 10 5 16 25
	 * 6 15 18 11 4
	 * 1 20 9 24 17
	 * 14 7 22 3 12
	 * 21 2 13 8 23
	 *  <p>
	 * @param chess the chess board
	 * @param r the row
	 * @param c the column
	 * @param move the move so far
	 */
	public static void printKnightsTour(int[][] chess, int r, int c, int move)
	{
		if( r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0 )
		{
			return;
		}
		else if( move == chess.length * chess.length )
		{
			chess[r][c] = move;
			displayChess(chess);
			chess[r][c] = 0;
			return;
		}

		chess[r][c] = move;
		printKnightsTour(chess, r - 2, c + 1, move + 1);
		printKnightsTour(chess, r - 1, c + 2, move + 1);
		printKnightsTour(chess, r + 1, c + 2, move + 1);
		printKnightsTour(chess, r + 2, c + 1, move + 1);
		printKnightsTour(chess, r + 2, c - 1, move + 1);
		printKnightsTour(chess, r + 1, c - 2, move + 1);
		printKnightsTour(chess, r - 1, c - 2, move + 1);
		printKnightsTour(chess, r - 2, c - 1, move + 1);
		chess[r][c] = 0;
	}

	private static void displayChess(int[][] chess)
	{
		for( int i = 0; i < chess.length; i++ )
		{
			for( int j = 0; j < chess[0].length; j++ )
			{
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
