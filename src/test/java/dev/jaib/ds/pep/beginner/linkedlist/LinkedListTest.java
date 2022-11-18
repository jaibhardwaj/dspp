package dev.jaib.ds.pep.beginner.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListTest
{

	@Test
	void addLast()
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.addLast(3);

		System.out.println(linkedList);
	}
}