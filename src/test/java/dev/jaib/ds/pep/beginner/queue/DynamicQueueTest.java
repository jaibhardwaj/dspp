package dev.jaib.ds.pep.beginner.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicQueueTest
{

	@Test
	void add()
	{
		DynamicQueue dynamicQueue = new DynamicQueue(5);
		dynamicQueue.add(1);
		assertEquals(1, dynamicQueue.size());

		dynamicQueue.remove();

		assertEquals(0, dynamicQueue.size());

		dynamicQueue.add(1);
		dynamicQueue.add(2);
		dynamicQueue.add(3);
		dynamicQueue.add(4);
		dynamicQueue.add(5);
		dynamicQueue.add(6);
		dynamicQueue.add(7);

		assertEquals(7, dynamicQueue.size());
		System.out.println(dynamicQueue);
	}

	@Test
	void remove()
	{
		DynamicQueue dynamicQueue = new DynamicQueue(5);

		dynamicQueue.add(1);
		dynamicQueue.add(2);
		dynamicQueue.add(3);
		dynamicQueue.add(4);
		dynamicQueue.add(5);
		dynamicQueue.add(6);

		assertEquals(1, dynamicQueue.remove());
		assertEquals(2, dynamicQueue.remove());
		assertEquals(3, dynamicQueue.remove());
		assertEquals(4, dynamicQueue.remove());
		assertEquals(5, dynamicQueue.remove());

		assertEquals(1, dynamicQueue.size());
	}

	@Test
	void peek()
	{
		DynamicQueue dynamicQueue = new DynamicQueue(5);

		dynamicQueue.add(1);
		dynamicQueue.add(2);
		dynamicQueue.add(3);
		dynamicQueue.add(4);
		dynamicQueue.add(5);

		assertEquals(1, dynamicQueue.peek());
		dynamicQueue.remove();
		assertEquals(2, dynamicQueue.peek());
		dynamicQueue.remove();
		assertEquals(3, dynamicQueue.peek());
		dynamicQueue.remove();
		assertEquals(4, dynamicQueue.peek());
		dynamicQueue.remove();
		assertEquals(5, dynamicQueue.peek());

		assertEquals(1, dynamicQueue.size());

	}
}