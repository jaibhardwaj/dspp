package dev.jaib.ds.pep.beginner.stack;

import java.util.Stack;

/**
 *
 Minimum Stack - Constant Space
 Easy

 1. You are required to complete the code of our MinStack class.
 2. As data members you've one stack and a min element available in the class. (This is cryptic - take hint from video)
 3. Here is the list of functions that you are supposed to complete
 3.1. push -> Should accept new data in LIFO manner.
 3.2. pop -> Should remove and return data in LIFO manner. If not available, print
 "Stack underflow" and return -1.
 3.3. top -> Should return data in LIFO manner. If not available, print "Stack
 underflow" and return -1.
 3.4. size -> Should return the number of elements available in the stack.
 3.5. min -> Should return the smallest element available in the stack. If not
 available, print "Stack underflow" and return -1.
 4. Input and Output is managed for you.amd_j@98765


 Note -> The judge maynot be able to check if all your functions are O(1) in time, but that is what the expectation is. Also, you can only use constant space.r
 */
public class MinStack
{
	Stack<Integer> data;
	int min;

	public MinStack()
	{
		data = new Stack<>();
	}

	public int size()
	{
		return data.size();
	}

	public void push(int val)
	{
		if( size() == 0 )
		{
			data.push(val);
			min = val;
		}
		else
		{
			if( val < min )
			{
				data.push(val + val - min);
				min = val;
			}
			else
			{
				data.push(val);
			}
		}

	}

	public int pop()
	{
		if( size() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			if( data.peek() >= min )
			{
				return data.pop();
			}
			else
			{
				int ov = min;
				min = 2 * min - data.pop();
				return ov;
			}
		}
	}

	public int top()
	{
		if( size() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			if( data.peek() >= min )
			{
				return data.peek();
			}
			else
			{
				return min;
			}
		}
	}

	public int min()
	{
		if( size() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			return min;
		}
	}
}
