package dev.jaib.ds.pep.beginner.stack;

public class StackUsingArray<T>
{
	private Object[] arr;
	private int top = -1;

	public StackUsingArray(int size)
	{
		arr = new Object[size];
	}

	public int size()
	{
		return top == -1 ? 0 : top + 1;
	}

	public boolean empty()
	{
		return top == -1;
	}

	public void push(T element)
	{
		if( size() == arr.length )
		{
			Object[] newData = new Object[2 * arr.length];
			System.arraycopy(arr, 0, newData, 0, arr.length);
			arr = newData;
		}
		top++;
		arr[top] = element;
	}

	public T pop()
	{
		T elem = peek();
		if( elem == null )
		{
			return null;
		}
		top--;
		return elem;
	}

	public T peek()
	{
		if( empty() )
		{
			System.out.println("Stack is Empty !!");
			return null;
		}

		return (T) arr[top];
	}

	@Override
	public String toString()
	{
		StringBuilder data = new StringBuilder("data { ");
		for (int i = top; i >= 0; i--)
		{
			data.append(arr[i]).append(" ");
		}
		return data + "}";
	}
}
