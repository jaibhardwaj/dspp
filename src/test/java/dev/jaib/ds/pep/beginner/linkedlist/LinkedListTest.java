package dev.jaib.ds.pep.beginner.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest
{

	@Test
	void addLastTest()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);

		System.out.println(linkedList);
	}

	@Test
	void removeFirstTest()
	{

		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);

		System.out.println(linkedList);

		assertEquals(1, linkedList.removeFirst());
		assertEquals(2, linkedList.removeFirst());
		System.out.println(linkedList);
		assertEquals(3, linkedList.removeFirst());
		assertEquals(-1, linkedList.removeFirst());
	}

	@Test
	public void getFirstTest()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);

		assertEquals(1, linkedList.getFirst());
		assertEquals(1, linkedList.removeFirst());
		assertEquals(2, linkedList.getFirst());
	}

	@Test
	public void getLastTest()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);

		assertEquals(3, linkedList.getLast());
		assertEquals(1, linkedList.removeFirst());
		assertEquals(2, linkedList.removeFirst());
		assertEquals(3, linkedList.removeFirst());
		assertEquals(-1, linkedList.getLast());
	}

	@Test
	public void getAtIndexTest()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);
		linkedList.addLast(4);
		linkedList.addLast(5);

		assertEquals(1, linkedList.getAt(0));
		assertEquals(2, linkedList.getAt(1));
		assertEquals(5, linkedList.getAt(4));
		assertEquals(-1, linkedList.getAt(5));
	}

	@Test
	void addFirstTest()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addFirst(3);

		System.out.println(linkedList);
	}
}