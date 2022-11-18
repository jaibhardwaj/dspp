package dev.jaib.ds.pep.beginner.linkedlist;

public class LinkedList
{
	private Node head;
	private Node tail;
	private int size;


	public void addLast(int val)
	{
		Node node = new Node(val, null);

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

		if( index >= size )
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

		Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
}
