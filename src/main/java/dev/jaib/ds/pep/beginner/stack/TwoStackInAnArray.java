package dev.jaib.ds.pep.beginner.stack;

/**
 * Two Stacks In An Array
 * <p>
 * Easy
 * <p>
 * 1. You are required to complete the code of our TwoStack class. The class should implement LIFO behaviours for two stacks in the same array.
 * <p>
 * 2. Here is the list of functions that you are supposed to complete
 * <p>
 *     2.1. push1, push2 -> Should accept new data for appropriate stack if there is
 *     space available in the underlying array or print "Stack overflow" otherwise.
 *     <p>
 *     2.2. pop1, po2 -> Should remove and return data from appropriate stack if
 *     available or print "Stack underflow" otherwise and return -1.
 *     <p>
 *     2.3. top1, top2 -> Should return data from appropriate stack if available or print
 *     "Stack underflow" otherwise and return -1.
 *     <p>
 *     2.4. size1, size2 -> Should return the number of elements available in appropriate
 *      stack.
 *      <p>
 * 3. Input and Output is managed for you.
 * <p>
 * Constraints
 * <p>
 * 1. All fns should be constant in time.
 * <p>
 * 2. Memory should be optimally used i.e. one of the stacks can use more elements in array but overflow should not happen before whole array is used.
 */
public class TwoStackInAnArray
{
	int[] data;
	int tos1;
	int tos2;

	public TwoStackInAnArray(int cap)
	{
		data = new int[cap];
		tos1 = -1;
		tos2 = data.length;
	}

	public int size1()
	{
		return tos1 + 1;
	}

	public int size2()
	{
		return data.length - tos2;
	}

	public void push1(int val)
	{
		if( tos2 == tos1 + 1 )
		{
			System.out.println("Stack overflow");
			return;
		}

		tos1++;
		data[tos1] = val;
	}

	public void push2(int val)
	{
		if( tos2 == tos1 + 1 )
		{
			System.out.println("Stack overflow");
			return;
		}

		tos2--;
		data[tos2] = val;
	}

	public int pop1()
	{
		if( size1() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}

		int val = data[tos1];
		tos1--;
		return val;
	}

	public int pop2()
	{
		if( size2() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}

		int val = data[tos2];
		tos2++;
		return val;
	}

	public int top1()
	{
		if( size1() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return data[tos1];
	}

	public int top2()
	{
		if( size2() == 0 )
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return data[tos2];
	}
}
