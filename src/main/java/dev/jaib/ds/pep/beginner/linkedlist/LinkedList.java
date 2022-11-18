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


	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		Node temp = head;

		while(temp != null)
		{
			builder.append(temp.item).append(" ");
			temp = temp.next;
		}

		return builder.append(']').toString();
	}

	private static class Node
	{
		int item;
		Node next;

		Node(int element, Node next)
		{
			this.item = element;
			this.next = next;
		}
	}
}
