package dev.jaib.ds.pep.beginner.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue To Stack Adapter - Pop Efficient
 * <p>
 * Easy
 * <p>
 * 1. You are required to complete the code of our QueueToStackAdapter class.
 * <p>
 * 2. As data members you've two queues available - mainQ and helperQ. mainQ is to contain data and helperQ is to assist in operations.
 * <p>
 * 3. Here is the list of functions that you are supposed to complete
 * <p>
 *      3.1. push -> Should accept new data in LIFO manner.
 *      <p>
 *      3.2. pop -> Should remove and return data in LIFO manner. If not available, print
 *      "Stack underflow" and return -1.
 *      <p>
 *     3.3. top -> Should return data in LIFO manner. If not available, print "Stack
 *     underflow" and return -1.
 *     <p>
 *     3.4. size -> Should return the number of elements available in the stack.
 *     <p>
 * 4. Input and Output is managed for you.
 * <p>
 * Note -> pop, top and size should work in constant time. push should work in linear time.
 * <p>
 * Constraints
 * Note -> pop, top and size should work in constant time. push should work in linear time.
 */
public class QueueToStackAdapterPopEfficient
{
	Queue<Integer> mainQ;
	Queue<Integer> helperQ;

	public QueueToStackAdapterPopEfficient()
	{
		mainQ = new ArrayDeque<>();
		helperQ = new ArrayDeque<>();
	}

	public int size()
	{
		return mainQ.size();
	}

	public void push(int val)
	{
		while(mainQ.size() != 0)
		{
			helperQ.add(mainQ.remove());
		}

		mainQ.add(val);

		while(helperQ.size() != 0)
		{
			mainQ.add(helperQ.remove());
		}
	}

	public int pop()
	{
		if( size() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}

		return mainQ.remove();
	}

	public int top()
	{
		if( size() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}

		return mainQ.peek();
	}
}
