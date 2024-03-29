package dev.jaib.ds.pep.beginner.queue;

import java.util.Stack;

/**
 * Stack To Queue Adapter - Add Efficient
 * <p>
 * Easy
 * <p>
 * 1. You are required to complete the code of our StackToQueueAdapter class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
 * <p>
 * 2. Here is the list of functions that are written in the class
 * <p>
 *     2.1. add -> Accepts new data if there is space available in the underlying array or
 *     print "Queue overflow" otherwise.
 *     <p>
 *     2.2. remove -> Removes and returns value according to FIFO, if available or print
 *     "Queue underflow" otherwise and return -1.
 *     <p>
 *     2.3. peek -> Returns value according to FIFO, if available or print "Queue
 *     underflow" otherwise and return -1.
 *     <p>
 *     2.4. size -> Returns the number of elements available in the queue.
 *     <p>
 * 3. Input and Output is managed for you.
 * <p>
 * Constraints
 * <p>
 * Note -> add and size should work in constant time. remove and peek should work in linear time.
 *
 */
public class StackToQueueAdapterAddEfficient
{
	Stack<Integer> mainS;
	Stack<Integer> helperS;

	public StackToQueueAdapterAddEfficient()
	{
		mainS = new Stack<>();
		helperS = new Stack<>();
	}

	public int size()
	{
		return mainS.size();
	}

	public void add(int val)
	{
		mainS.push(val);
	}

	public int remove()
	{
		if( size() == 0 )
		{
			System.out.println("Queue underflow");
			return -1;
		}

		while(mainS.size() != 1)
		{
			helperS.push(mainS.pop());
		}

		int val = mainS.pop();

		while(helperS.size() != 0)
		{
			mainS.push(helperS.pop());
		}

		return val;

	}

	public int peek()
	{
		if( size() == 0 )
		{
			System.out.println("Queue underflow");
			return -1;
		}

		while(mainS.size() != 1)
		{
			helperS.push(mainS.pop());
		}

		int val = mainS.pop();

		helperS.push(val);

		while(helperS.size() != 0)
		{
			mainS.push(helperS.pop());
		}

		return val;

	}
}
