package dev.jaib.ds.pep.beginner.queue;

/**
 * Dynamic Queue
 * Easy
 * <p>
 * 1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
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
 *      underflow" otherwise and return -1.
 *      <p>
 *     2.4. size -> Returns the number of elements available in the queue.
 *     <p>
 *     2.5. display -> Prints the elements of queue in FIFO manner (space-separated)
 *     ending with a line-break.
 *     <p>
 * 3. Input and Output is managed for you.
 */
public class DynamicQueue
{

	private int[] data;
	private int front;
	private int size;

	public DynamicQueue(int cap)
	{
		data = new int[cap];
	}

	public int size()
	{
		return size;
	}

	public void add(int val)
	{
		if( size == data.length )
		{
			int[] nData = new int[ 2 * data.length];
			for( int i = 0; i < size; i++ )
			{
				int idx = (front + i) % data.length;
				nData[i] = data[idx];
			}
			data = nData;
			front = 0;
		}

		int rear = (front + size) % data.length;
		data[rear] = val;
		size++;
	}

	public int remove()
	{
		if( size == 0 )
		{
			System.out.println("Queue underflow");
			return -1;
		}

		int val = data[front];
		front = (front + 1) % data.length;
		size--;
		return val;
	}

	public int peek()
	{
		if( size == 0 )
		{
			System.out.println("Queue underflow");
			return -1;
		}

		return data[front];
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		for( int i = 0; i < size; i++ )
		{
			int idx = (front + i) % data.length;
			builder.append(data[idx]).append(" ");
		}
		builder.append("]");
		return builder.toString();
	}
}
