package dev.jaib.ds.pep.beginner.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackToQueueAdapterTest
{

	@Test
	public void stackToQueueAdapterTestAddEfficient()
	{
		StackToQueueAdapterAddEfficient adapter = new StackToQueueAdapterAddEfficient();
		adapter.add(1);
		adapter.add(2);
		adapter.add(3);
		adapter.add(4);
		adapter.add(5);

		assertEquals(5, adapter.size());

		assertEquals(1, adapter.peek());

		assertEquals(1, adapter.remove());

		assertEquals(2, adapter.remove());

		assertEquals(3, adapter.peek());

		assertEquals(3, adapter.size());
	}
}