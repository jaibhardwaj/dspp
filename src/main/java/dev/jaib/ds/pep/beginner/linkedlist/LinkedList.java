package dev.jaib.ds.pep.beginner.linkedlist;

public class LinkedList
{
	private Node head;
	private Node tail;
	private int size;


	public void addLast(int val)
	{
		Node node = new Node();
		node.data = val;

		if( size == 0 )
		{
			head = tail = node;
		}
		else
		{
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void addFirst(int val)
	{
		Node temp = new Node();
		temp.data = val;
		if( size == 0 )
		{
			head = tail = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		size++;
	}

	public void addAt(int idx, int val)
	{
		if( idx < 0 || idx > size )
		{
			System.out.println("Invalid arguments");
			return;
		}

		if( idx == 0 )
		{
			addFirst(val);
		}
		else if( idx == size )
		{
			addLast(val);
		}
		else
		{
			Node node = new Node();
			node.data = val;
			Node temp = head;

			for( int i = 0; i < idx - 1; i++ )
			{
				temp = temp.next;
			}

			node.next = temp.next;
			temp.next = node;
			size++;
		}
	}

	public int removeFirst()
	{
		if( size == 0 )
		{
			System.out.println("List is empty!");
			return -1;
		}

		int data = head.data;

		if( size == 1 )
		{
			head = tail = null;
		}
		else
		{
			head = head.next;
		}

		size--;
		return data;
	}


	public int getFirst()
	{
		if( size == 0 )
		{
			System.out.println("List is empty!");
			return -1;
		}

		return head.data;
	}

	public int getLast()
	{
		if( size == 0 )
		{
			System.out.println("List is empty!");
			return -1;
		}

		return tail.data;
	}

	public int getAt(int index)
	{
		if( size == 0 )
		{
			System.out.println("List is empty!");
			return -1;
		}

		if( index < 0 || index >= size )
		{
			System.out.println("Invalid Argument!");
			return -1;
		}

		Node temp = head;
		int i = 0;
		while(i != index)
		{
			temp = temp.next;
			i++;
		}

		return temp.data;
	}

	public int removeLast()
	{
		if( size == 0 )
		{
			System.out.println("List is empty");
			return -1;
		}

		int data = tail.data;

		if( size == 1 )
		{
			head = tail = null;
		}
		else
		{
			Node temp = head;
			while(temp.next != tail)
			{
				temp = temp.next;
			}

			temp.next = null;
			tail = temp;
		}
		size--;

		return data;
	}

	public int removeAt(int idx)
	{
		if( size == 0 )
		{
			System.out.println("List is empty");
			return -1;
		}

		if( idx < 0 || idx >= size )
		{
			System.out.println("Invalid arguments");
			return -1;
		}

		int data;

		if( size == 1 )
		{
			data = head.data;
			head = tail = null;
			size--;
			return data;
		}
		else if( idx == 0 )
		{
			return removeFirst();
		}
		else if( idx == size - 1 )
		{
			return removeLast();
		}
		else
		{
			Node temp = head;
			int i = 0;
			while(i != idx - 1)
			{
				i++;
				temp = temp.next;
			}

			data = temp.next.data;
			temp.next = temp.next.next;
			size--;
		}

		return data;
	}

	public int size()
	{
		return size;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		Node temp = head;

		while(temp != null)
		{
			builder.append(temp.data).append(" ");
			temp = temp.next;
		}

		return builder.append(']').toString();
	}

	private static class Node
	{
		int data;
		Node next;
	}
}
