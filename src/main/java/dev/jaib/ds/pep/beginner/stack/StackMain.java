package dev.jaib.ds.pep.beginner.stack;

import java.util.Stack;

public class StackMain
{

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

}
