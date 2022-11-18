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
}