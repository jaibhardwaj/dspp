package dev.jaib.ds.pep.beginner.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackMain
{

	public static void main(String[] args)
	{
		//ngetr(new int[]{5, 3, 8, -2, 7});

		print(stockSpan(new int[]{9, 5, 2, 3, 7, 12, 6, 8, 1}));

		mergeOverlappingIntervals(new int[][]{{1, 8}, {5, 12}, {14, 19}, {22, 28}, {25, 27}, {27, 30}});
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

	/**
	 * Largest Area Histogram
	 * <p>
	 * Hard
	 * <p>
	 * 1. You are given a number n, representing the size of array a
	 * <p>
	 * 2. You are given n numbers, representing the height of bars in a bar chart.
	 * <p>
	 * 3. You are required to find and print the area of larger rectangle in the histogram.
	 * <p>
	 * e.g. for the array [6 2 5 4 5 1 6] -> 12
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 0 <= n < 20 0 <= a[i] <= 10
	 * <p>
	 *
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 *
	 * Output
	 * <p>
	 * A number representing area of larger rectangle in histogram
	 * <p>
	 *
	 * Example
	 * Sample Input
	 * <p>
	 * 7
	 * 6
	 * 2
	 * 5
	 * 4
	 * 5
	 * 1
	 * 6
	 * <p>
	 * Sample Output
	 * <p>
	 * 12
	 *
	 * @param arr the given bar array
	 * @return the largest area
	 */
	public static int largestAreaHistogram(int[] arr)
	{
		int n = arr.length;
		int[] rb = new int[n]; // nse index to right
		Stack<Integer> st = new Stack<>();
		st.push(n - 1);
		rb[n - 1] = n;

		for( int i = n - 2; i >= 0; i-- )
		{
			while(st.size() > 0 && arr[i] <= arr[st.peek()])
			{
				st.pop();
			}
			if( st.size() > 0 )
			{
				rb[i] = st.peek();
			}
			else
			{
				rb[i] = n;
			}
			st.push(i);
		}

		int[] lb = new int[n]; // nse index to left

		st = new Stack<>();
		st.push(0);
		lb[0] = -1;

		for( int i = 1; i < n; i++ )
		{
			while(st.size() > 0 && arr[i] <= arr[st.peek()])
			{
				st.pop();
			}
			if( st.size() > 0 )
			{
				lb[i] = st.peek();
			}
			else
			{
				lb[i] = -1;
			}
			st.push(i);
		}

		int maxArea = 0;
		for( int i = 0; i < n; i++ )
		{
			int width = rb[i] - lb[i] - 1;
			int area = arr[i] * width;

			if( area > maxArea )
			{
				maxArea = area;
			}
		}

		return maxArea;
	}


	/**
	 * Sliding Window Maximum
	 * <p>
	 * Hard
	 * <p>
	 * 1. You are given a number n, representing the size of array a
	 * <p>
	 * 2. You are given n numbers, representing the elements of array a
	 * <p>
	 * 3. You are given a number k, representing the size of window
	 * <p>
	 * 4. You are required to find and print the maximum element in every window of size k
	 * <p>
	 *
	 * e.g.
	 * <p>
	 * for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
	 * <p>
	 * Constraints
	 * <p>
	 * 0 <= n < 100000
	 * <p>
	 * -10^9 <= a[i] <= 10^9
	 * <p>
	 * 0 < k < n
	 *
	 * @param arr the array
	 * @param k the window size
	 * @return the sliding window maximum
	 */
	public static int[] slidingWindowMaximum(int[] arr, int k)
	{
		int[] max = new int[arr.length - k + 1];
		Stack<Integer> st = new Stack<>();

		int[] nge = new int[arr.length];

		nge[arr.length - 1] = arr.length;
		st.push(arr.length - 1);

		for( int i = arr.length - 2; i >= 0; i-- )
		{
			while(!st.empty() && arr[i] >= arr[st.peek()])
			{
				st.pop();
			}

			if( st.empty() )
			{
				nge[i] = arr.length;
			}
			else
			{
				nge[i] = st.peek();
			}

			st.push(i);
		}


		for( int i = 0; i <= arr.length - k; i++ )
		{
			int j = i;

			while(nge[j] < i + k)
			{
				j = nge[j];
			}

			max[i] = arr[j];
		}

		return max;
	}

	/**
	 * Infix Evaluation
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given an infix expression.
	 * <p>
	 * 2. You are required to evaluate and print its value.
	 * <p>
	 * Constraints
	 * <p>
	 * 1. Expression is balanced
	 * <p>
	 * 2. The only operators used are +, -, *, /
	 * <p>
	 * 3. Opening and closing brackets - () - are used to impact precedence of operations
	 * <p>
	 * 4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
	 * <p>
	 * 5. In two operators of equal precedence give preference to the one on left.
	 * <p>
	 * 6. All operands are single digit numbers.
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * Value of infix expression
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * 2 + 6 * 4 / 8 - 3
	 * <p>
	 * Sample Output
	 * 2
	 *
	 * @param exp the given infix expression
	 * @return the infix expression evaluation
	 */
	public static int infixEvaluation(String exp)
	{
		Stack<Integer> oprand = new Stack<>();
		Stack<Character> operator = new Stack<>();

		for( int i = 0; i < exp.length(); i++ )
		{
			char ch = exp.charAt(i);

			if( Character.isDigit(ch) )
			{
				oprand.push(ch - '0');
			}
			else if( ch == '(' )
			{
				operator.push(ch);
			}
			else if( ch == ')' )
			{
				while(operator.peek() != '(')
				{
					evaluateExp(oprand, operator);
				}

				operator.pop();
			}
			else if( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				while(!operator.empty() && operator.peek() != '(' &&
						precedence(ch) <= precedence(operator.peek()))
				{
					evaluateExp(oprand, operator);
				}

				operator.push(ch);
			}
			else
			{
				operator.push(ch);
			}
		}

		while(!operator.empty())
		{
			evaluateExp(oprand, operator);
		}

		return oprand.peek();
	}

	public static void evaluateExp(Stack<Integer> oprand, Stack<Character> operator)
	{
		int v2 = oprand.pop();
		int v1 = oprand.pop();
		char op = operator.pop();

		int v = operation(v1, v2, op);

		oprand.push(v);
	}

	public static int precedence(char ch)
	{
		if( ch == '+' || ch == '-' )
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}

	public static int operation(int v1, int v2, char ch)
	{
		if( ch == '+' )
		{
			return v1 + v2;
		}
		else if( ch == '-' )
		{
			return v1 - v2;
		}
		else if( ch == '*' )
		{
			return v1 * v2;
		}
		else
		{
			return v1 / v2;
		}
	}

	/**
	 * Infix Conversions
	 * Easy
	 * <p>
	 * 1. You are given an infix expression.
	 * <p>
	 * 2. You are required to convert it to postfix and print it.
	 * <p>
	 * 3. You are required to convert it to prefix and print it.
	 * <p>
	 *
	 * Constraints
	 * <p>
	 * 1. Expression is balanced
	 * <p>
	 * 2. The only operators used are +, -, *, /
	 * <p>
	 * 3. Opening and closing brackets - () - are used to impact precedence of operations
	 * <p>
	 * 4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
	 * <p>
	 * 5. In two operators of equal precedence give preference to the one on left.
	 * <p>
	 * 6. All operands are single digit numbers.
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * postfix
	 * <p>
	 * prefix
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * a*(b-c+d)/e
	 * <p>
	 * Sample Output
	 * abc-d+*e/
	 * <p>
	 * /*a+-bcde
	 *
	 * @param exp the infix expression given
	 * @return the string array containing the prefix and postfix conversion
	 */
	public static String[] infixConversion(String exp)
	{
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Character> operator = new Stack<>();

		for( int i = 0; i < exp.length(); i++ )
		{
			char ch = exp.charAt(i);

			if( ch == '(' )
			{
				operator.push(ch);
			}
			else if( (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
			{
				prefix.push(ch + "");
				postfix.push(ch + "");
			}
			else if( ch == ')' )
			{
				while(operator.peek() != '(')
				{
					char op = operator.pop();
					String preStr = evalExpPre(prefix, op);
					String postStr = evalExpPost(postfix, op);

					prefix.push(preStr);
					postfix.push(postStr);
				}

				operator.pop();
			}
			else if( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				while(!operator.isEmpty() && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch))
				{
					char op = operator.pop();
					String preStr = evalExpPre(prefix, op);
					String postStr = evalExpPost(postfix, op);

					prefix.push(preStr);
					postfix.push(postStr);
				}

				operator.push(ch);
			}
			else
			{
				operator.push(ch);
			}
		}

		while(!operator.isEmpty())
		{
			char op = operator.pop();
			String preStr = evalExpPre(prefix, op);
			String postStr = evalExpPost(postfix, op);

			prefix.push(preStr);
			postfix.push(postStr);
		}

		String[] conversions = new String[2];
		conversions[0] = prefix.peek();
		conversions[1] = postfix.peek();

		return conversions;
	}

	public static String evalExpPre(Stack<String> prefix, char op)
	{
		String v2 = prefix.pop();
		String v1 = prefix.pop();

		return op + v1 + v2;
	}

	public static String evalExpPost(Stack<String> postfix, char op)
	{
		String v2 = postfix.pop();
		String v1 = postfix.pop();

		return v1 + v2 + op;
	}

	/**
	 * Postfix Evaluation And Conversions
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a postfix expression.
	 * <p>
	 * 2. You are required to evaluate it and print its value.
	 * <p>
	 * 3. You are required to convert it to infix and print it.
	 * <p>
	 * 4. You are required to convert it to prefix and print it.
	 * <p>
	 * Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
	 * <p>
	 * Constraints
	 * <p>
	 * 1. Expression is a valid postfix expression
	 * <p>
	 * 2. The only operators used are +, -, *, /
	 * <p>
	 * 3. All operands are single digit numbers.
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * value, a number
	 * <p>
	 * infix
	 * <p>
	 * prefix
	 * <p>
	 * Example
	 * <p>
	 * Sample Input
	 * <p>
	 * 264*8/+3-
	 * <p>
	 * Sample Output
	 * <p>
	 * 2
	 * <p>
	 * ((2+((6*4)/8))-3)
	 * <p>
	 * -+2/*6483
	 *
	 * @param exp the given postfix expression
	 * @return the string array containing the evaluation, prefix and infix conversion of postfix
	 */
	public static String[] postfixEvaluationAndConversion(String exp)
	{
		Stack<String> infix = new Stack<>();
		Stack<String> prefix = new Stack<>();
		Stack<Integer> eval = new Stack<>();

		for( int i = 0; i < exp.length(); i++ )
		{
			char ch = exp.charAt(i);

			if( Character.isDigit(ch) )
			{
				infix.push(ch + "");
				prefix.push(ch + "");
				eval.push(ch - '0');
			}
			else
			{
				int ev2 = eval.pop();
				int ev1 = eval.pop();
				int ev = operation(ev1, ev2, ch);
				eval.push(ev);

				String prev2 = prefix.pop();
				String prev1 = prefix.pop();
				String prev = ch + prev1 + prev2;
				prefix.push(prev);

				String inv2 = infix.pop();
				String inv1 = infix.pop();
				String inv = "(" + inv1 + ch + inv2 + ")";
				infix.push(inv);
			}
		}

		String[] conversions = new String[3];
		conversions[0] = eval.peek() + "";
		conversions[1] = infix.peek();
		conversions[2] = prefix.peek();

		return conversions;
	}

	/**
	 * Prefix Evaluation And Conversions
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a prefix expression.
	 * <p>
	 * 2. You are required to evaluate it and print its value.
	 * <p>
	 * 3. You are required to convert it to infix and print it.
	 * <p>
	 * 4. You are required to convert it to postfix and print it.
	 * <p>
	 * Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
	 * <p>
	 * Constraints
	 * <p>
	 * 1. Expression is a valid prefix expression
	 * <p>
	 * 2. The only operators used are +, -, *, /
	 * <p>
	 * 3. All operands are single digit numbers.
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * value, a number
	 * <p>
	 * infix
	 * <p>
	 * prefix
	 * <p>
	 * Example
	 * Sample Input
	 * <p>
	 * -+2/*6483
	 * <p>
	 * Sample Output
	 * <p>
	 * 2
	 * <p>
	 * ((2+((6*4)/8))-3)
	 * <p>
	 * 264*8/+3-
	 *
	 * @param exp the given prefix expression
	 * @return the string array containing the evaluation, postfix and infix conversion of prefix
	 */
	public static String[] prefixEvaluationAndConversion(String exp)
	{
		Stack<String> infix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Integer> eval = new Stack<>();

		for( int i = exp.length() - 1; i >= 0; i-- )
		{
			char ch = exp.charAt(i);

			if( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				int ev1 = eval.pop();
				int ev2 = eval.pop();
				int ev = operation(ev1, ev2, ch);
				eval.push(ev);

				String iv1 = infix.pop();
				String iv2 = infix.pop();
				String iv = "(" + iv1 + ch + iv2 + ")";
				infix.push(iv);

				String pv1 = postfix.pop();
				String pv2 = postfix.pop();
				String pv = pv1 + pv2 + ch;
				postfix.push(pv);

			}
			else
			{
				eval.push(ch - '0');
				infix.push(ch + "");
				postfix.push(ch + "");
			}
		}

		String[] conversions = new String[3];
		conversions[0] = eval.peek() + "";
		conversions[1] = infix.peek();
		conversions[2] = postfix.peek();

		return conversions;
	}

	/**
	 * Celebrity Problem
	 * <p>
	 * Easy
	 * <p>
	 * 1. You are given a number n, representing the number of people in party
	 * <p>
	 * 2. You are given n strings of n length containing 0's and 1's
	 * <p>
	 * 3. If there is a '1' in ith row, jth spot, then person i knows about person j.
	 * <p>
	 * 4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
	 * <p>
	 * 5. If there is a celebrity print it's index otherwise print "none".
	 * <p>
	 * Note -> There can be only one celebrity. Think why?
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= n <= 10^4
	 * <p>
	 * e1, e2, .. n * n elements belongs to the set (0, 1)
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * Index of celebrity or none
	 * <p>
	 * Example
	 * <p>
	 * Sample Input
	 * <p>
	 * 4
	 * <p>
	 * 0000
	 * <p>
	 * 1011
	 * <p>
	 * 1101
	 * <p>
	 * 1110
	 * <p>
	 * Sample Output
	 * <p>
	 * 0
	 *
	 * @param arr the given matrix of 0 and 1
	 * @return the celebrity position or -1
	 */
	public static int findCelebrity(int[][] arr)
	{
		// if a celebrity is there print its index (not position),
		// if there is not then print "none"
		Stack<Integer> st = new Stack<>();

		for( int i = 0; i < arr.length; i++ )
		{
			st.push(i);
		}

		while(st.size() >= 2)
		{
			int i = st.pop();
			int j = st.pop();

			if( arr[i][j] == 1 )
			{
				st.push(j);
			}
			else
			{
				st.push(i);
			}
		}

		int pot = st.pop();

		for( int i = 0; i < arr.length; i++ )
		{
			if( i != pot )
			{
				if( arr[i][pot] == 0 || arr[pot][i] == 1 )
				{
					return -1;
				}
			}
		}

		return pot;
	}

	public static void mergeOverlappingIntervalsWithSortedTime(int[][] arr)
	{
		// merge overlapping intervals and print in increasing order of start time
		// First of all this Array Matrix must be sorted for this

		Stack<Integer> start = new Stack<>();
		Stack<Integer> end = new Stack<>();

		start.push(arr[arr.length - 1][0]);
		end.push(arr[arr.length - 1][1]);

		for( int i = arr.length - 2; i >= 0; i-- )
		{
			if( arr[i][1] >= start.peek() )
			{
				start.pop();
				start.push(arr[i][0]);
			}
			else
			{
				start.push(arr[i][0]);
				end.push(arr[i][1]);
			}
		}

		while(!start.empty() && !end.empty())
		{
			System.out.println(start.pop() + " " + end.pop());
		}

	}

	/**
	 * Merge Overlapping Interval
	 * <p>
	 * Medium
	 * <p>
	 * 1. You are given a number n, representing the number of time-intervals.
	 * <p>
	 * 2. In the next n lines, you are given a pair of space separated numbers.
	 * <p>
	 * 3. The pair of numbers represent the start time and end time of a meeting (first number is start time and second number is end time)
	 * <p>
	 * 4. You are required to merge the meetings and print the merged meetings output in increasing order of start time.
	 * <p>
	 *
	 * E.g. Let us say there are 6 meetings
	 * <p>
	 * 1 8
	 * <p>
	 * 5 12
	 * <p>
	 * 14 19
	 * <p>
	 * 22 28
	 * <p>
	 * 25 27
	 * <p>
	 * 27 30
	 * <p>
	 * Then the output of merged meetings will belongs
	 * <p>
	 * 1 12
	 * <p>
	 * 14 19
	 * <p>
	 * 22 30
	 * <p>
	 * Note -> The given input may not be sorted by start-time.
	 * <p>
	 * Constraints
	 * <p>
	 * 1 <= n <= 10^4
	 * <p>
	 * 0 <= ith start time < 100
	 * <p>
	 * ith start time < ith end time <= 100
	 * <p>
	 * Format
	 * Input
	 * <p>
	 * Input is managed for you
	 * <p>
	 * Output
	 * <p>
	 * Print a merged meeting start time and end time separated by a space in a line
	 *  print all merged meetings one in each line.
	 * <p>
	 * Example
	 * <p>
	 * Sample Input
	 * <p>
	 * 6
	 * <p>
	 * 22 28
	 * <p>
	 * 1 8
	 * <p>
	 * 25 27
	 * <p>
	 * 14 19
	 * <p>
	 * 27 30
	 * <p>
	 * 5 12
	 * <p>
	 * Sample Output
	 * <p>
	 * 1 12
	 * <p>
	 * 14 19
	 * <p>
	 * 22 30
	 *
	 * @param arr the given array of start time and end time
	 */
	public static void mergeOverlappingIntervals(int[][] arr)
	{
		Pair[] pairs = new Pair[arr.length];
		for( int i = 0; i < arr.length; i++ )
		{
			pairs[i] = new Pair(arr[i][0], arr[i][1]);
		}

		Arrays.sort(pairs);
		Stack<Pair> st = new Stack<>();
		for( int i = 0; i < pairs.length; i++ )
		{
			if( i == 0 )
			{
				st.push(pairs[i]);
			}
			else
			{
				Pair top = st.peek();
				if( pairs[i].st > top.et )
				{
					st.push(pairs[i]);
				}
				else
				{
					top.et = Math.max(top.et, pairs[i].et);
				}
			}
		}

		Stack<Pair> rs = new Stack<>();
		while(st.size() > 0)
		{
			rs.push(st.pop());
		}

		while(rs.size() > 0)
		{
			Pair p = rs.pop();
			System.out.println(p.st + " " + p.et);
		}

	}

	public static class Pair implements Comparable<Pair>
	{
		int st;
		int et;

		Pair(int st, int et)
		{
			this.st = st;
			this.et = et;
		}

		public int compareTo(Pair other)
		{
			if( this.st != other.st )
			{
				return this.st - other.st;
			}
			else
			{
				return this.et - other.et;
			}
		}
	}
}
