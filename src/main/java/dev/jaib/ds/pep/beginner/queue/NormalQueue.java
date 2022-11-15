package dev.jaib.ds.pep.beginner.queue;

/**
 * Normal Queue
 * Easy
 * <p>
 * 1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
 * <p>
 * 2. Here is the list of functions that you are supposed to complete
 * <p>
 *      2.1. add -> Should accept new data if there is space available in the underlying
 *      array or print "Queue overflow" otherwise.
 *      <p>
 *      2.2. remove -> Should remove and return value according to FIFO, if available or
 *      print "Queue underflow" otherwise and return -1.
 *      <p>
 *      2.3. peek -> Should return value according to FIFO, if available or print "Queue
 *      underflow" otherwise and return -1.
 *      <p>
 *      2.4. size -> Should return the number of elements available in the queue.
 *      <p>
 *      2.5. display -> Should print the elements of queue in FIFO manner (space-
 *      separated) ending with a line-break.
 *      <p>
 * 3. Input and Output is managed for you
 */
public class NormalQueue
{
	private final int[] data;
	private int front;
	private int size;

	public NormalQueue(int cap)
	{
		data = new int[cap];
	}

	public int size()
	{
		return size;
	}

	public void add(int val)
	{
		if( size() == data.length )
		{
			System.out.println("Queue overflow");
			return;
		}

		int rear = (front + size) % data.length;
		data[rear] = val;
		size++;
	}

	public int remove()
	{
		if( size() == 0 )
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
		if( size() == 0 )
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
