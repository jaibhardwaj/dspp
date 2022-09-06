package dev.jaib.ds.pep.beginner.stack;

import java.util.Stack;

public class StackMain
{

	public static void main(String[] args)
	{
		//ngetr(new int[]{5, 3, 8, -2, 7});

		print(stockSpan(new int[]{9, 5, 2, 3, 7, 12, 6, 8, 1}));
	}


	public static void print(int[] arr)
	{
		for( int j : arr )
		{
			System.out.println(j);
		}
	}

	/**
	 * Duplicate Brackets
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string exp representing an expression.
	 * <p>
	 * 2. Assume that the expression is balanced i.e. the opening and closing brackets match with each other.
	 * <p>
	 * 3. But, Some pair of brackets maybe extra/needless.
	 * <p>
	 * 4. You are required to print true if you detect extra brackets and false otherwise. e.g.' ((a + b) + (c + d)) -> false (a + b) + ((c + d)) -> true
	 * <p>
	 * <p>
	 * Constraints
	 * <p>
	 * 0 <= str.length <= 100
	 * <p>
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * A string str
	 * <p>
	 * <p>
	 * Output
	 * <p>
	 * true or false
	 * <p>
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * (a + b) + ((c + d))
	 * <p>
	 * Sample Output
	 * true
	 *
	 * @param str the string
	 * @return true or false
	 */
	public static boolean duplicateBrackets(String str)
	{
		Stack<Character> stack = new Stack<>();

		for( int i = 0; i < str.length(); i++ )
		{
			char charFromString = str.charAt(i);

			if( charFromString == ')' )
			{
				if( stack.peek() == '(' )
				{
					return true;
				}
				else
				{
					while(stack.peek() != '(')
					{
						stack.pop();
					}
					stack.pop();
				}
			}
			else
			{
				stack.push(charFromString);
			}
		}

		return false;
	}

	/**
	 * Balanced Brackets
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a string exp representing an expression.
	 * <p>
	 * 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
	 * <p>
	 * e.g.
	 * [(a + b) + {(c + d) * (e / f)}] -> true
	 * <p>
	 * [(a + b) + {(c + d) * (e / f)]} -> false
	 * <p>
	 * [(a + b) + {(c + d) * (e / f)} -> false
	 * <p>
	 * ([(a + b) + {(c + d) * (e / f)}] -> false
	 * <p>
	 * Constraints
	 * <p>
	 * 0 <= str.length <= 100
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * A string str
	 * <p>
	 * Output
	 * <p>
	 * true or false
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * [(a + b) + {(c + d) * (e / f)}]
	 * <p>
	 * Sample Output
	 * <p>
	 * true
	 *
	 * @param str the string
	 * @return true or false
	 */
	public static boolean balancedBrackets(String str)
	{
		Stack<Character> st = new Stack<>();

		for( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt(i);
			if( ch == '(' || ch == '[' || ch == '{' )
			{
				st.push(ch);
			}
			else if( ch == ')' )
			{
				boolean val = handleClosing(st, '(');
				if( !val )
				{
					return false;
				}
			}
			else if( ch == ']' )
			{
				boolean val = handleClosing(st, '[');
				if( !val )
				{
					return false;
				}
			}
			else if( ch == '}' )
			{
				boolean val = handleClosing(st, '{');
				if( !val )
				{
					return false;
				}
			}
		}

		return st.empty();
	}

	public static boolean handleClosing(Stack<Character> st, char corresopch)
	{
		if( st.size() == 0 || st.peek() != corresopch )
		{
			return false;
		}
		else
		{
			st.pop();
		}
		return true;
	}


	/**
	 * Next Greater Element To The Right
	 * <p>
	 * Medium
	 * <p>
	 * 1. You are given a number n, representing the size of array a
	 * <p>
	 * 2. You are given n numbers, representing elements of array a
	 * <p>
	 * 3. You are required to "next greater element on the right" for all elements of array
	 * <p>
	 * 4. Input and output is handled for you.
	 * <p>
	 * "Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
	 * <p>
	 * Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
	 * <p>
	 * e.g.
	 * <p>
	 * for the array [2 5 9 3 1 12 6 8 7]
	 * <p>
	 * Next greater for 2 is 5
	 * <p>
	 * Next greater for 5 is 9
	 * <p>
	 * Next greater for 9 is 12
	 * <p>
	 * Next greater for 3 is 12
	 * <p>
	 * Next greater for 1 is 12
	 * <p>
	 * Next greater for 12 is -1
	 * <p>
	 * Next greater for 6 is 8
	 * <p>
	 * Next greater for 8 is -1
	 * <p>
	 * Next greater for 7 is -1
	 * <p>
	 * Constraints
	 * <p>
	 * 0 <= n < 10^5
	 * <p>
	 * -10^9 <= a[i] <= 10^9
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * Output is managed for you
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 5
	 * 5
	 * 3
	 * 8
	 * -2
	 * 7
	 * <p>
	 * Sample Output
	 * <p>
	 * 8
	 * 8
	 * -1
	 * 7
	 * -1
	 *
	 * @param arr the given array
	 * @return the array containing next greater element on the right for array
	 */
	public static int[] ngetr(int[] arr)
	{
		Stack<Integer> stack = new Stack<>();

		int[] nge = new int[arr.length];

		nge[arr.length - 1] = -1;
		stack.push(arr[arr.length - 1]);

		for (int i = arr.length - 2; i >= 0; i--)
		{
			while (!stack.empty() && arr[i] >= stack.peek())
			{
				stack.pop();
			}

			if( stack.empty() )
			{
				nge[i] = -1;
			}
			else
			{
				nge[i] = stack.peek();
			}

			stack.push(arr[i]);
		}

		return nge;
	}

	/**
	 * Stock Span
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the size of array a
	 * <p>
	 * 2. You are given n numbers, representing the prices of a share on n days.
	 * <p>
	 * 3. You are required to find the stock span for n days.
	 * <p>
	 * 4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.
	 * <p>
	 * e.g.
	 * for the array [2 5 9 3 1 12 6 8 7]
	 * <p>
	 * span for 2 is 1
	 * <p>
	 * span for 5 is 2
	 * <p>
	 * span for 9 is 3
	 * <p>
	 * span for 3 is 1
	 * <p>
	 * span for 1 is 1
	 * <p>
	 * span for 12 is 6
	 * <p>
	 * span for 6 is 1
	 * <p>
	 * span for 8 is 2
	 * <p>
	 * span for 7 is 1
	 * <p>
	 * Constraints
	 * <p>
	 * 0 <= n < 10^5
	 * <p>
	 * -10^9 <= a[i] <= 10^9
	 *
	 * @param arr the given array
	 * @return the array containing span of values
	 */
	public static int[] stockSpan(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		int[] span = new int[arr.length];
		span[0] = 1;
		st.push(0);

		for( int i = 1; i < arr.length; i++ )
		{

			while(!st.empty() && arr[st.peek()] <= arr[i])
			{
				st.pop();
			}

			if( st.empty() )
			{
				span[i] = i + 1;
			}
			else
			{
				span[i] = i - st.peek();
			}

			st.push(i);
		}
		return span;
	}

}
