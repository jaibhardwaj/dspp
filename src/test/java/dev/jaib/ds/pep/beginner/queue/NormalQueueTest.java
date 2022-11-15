package dev.jaib.ds.pep.beginner.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalQueueTest
{

	@Test
	void size()
	{
		NormalQueue normalQueue = new NormalQueue(5);
		normalQueue.add(1);
		assertEquals(1, normalQueue.size());

		normalQueue.remove();

		assertEquals(0, normalQueue.size());

		normalQueue.add(1);
		normalQueue.add(2);
		normalQueue.add(3);
		normalQueue.add(4);
		normalQueue.add(5);

		assertEquals(5, normalQueue.size());
		System.out.println(normalQueue);
	}

	@Test
	void remove()
	{

		NormalQueue normalQueue = new NormalQueue(5);

		normalQueue.add(1);
		normalQueue.add(2);
		normalQueue.add(3);
		normalQueue.add(4);
		normalQueue.add(5);

		assertEquals(1, normalQueue.remove());
		assertEquals(2, normalQueue.remove());
		assertEquals(3, normalQueue.remove());
		assertEquals(4, normalQueue.remove());
		assertEquals(5, normalQueue.remove());

		assertEquals(0, normalQueue.size());
	}

	@Test
	void peek()
	{
		NormalQueue normalQueue = new NormalQueue(5);

		normalQueue.add(1);
		normalQueue.add(2);
		normalQueue.add(3);
		normalQueue.add(4);
		normalQueue.add(5);

		assertEquals(1, normalQueue.peek());
		normalQueue.remove();
		assertEquals(2, normalQueue.peek());
		normalQueue.remove();
		assertEquals(3, normalQueue.peek());
		normalQueue.remove();
		assertEquals(4, normalQueue.peek());
		normalQueue.remove();
		assertEquals(5, normalQueue.peek());

		assertEquals(1, normalQueue.size());

	}
}