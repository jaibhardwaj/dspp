package dev.jaib.ds.pep.beginner.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueToStackAdapterTest
{

	@Test
	public void queueToStackAdapterPushEfficientTest()
	{
		QueueToStackAdapterPushEfficient adapter = new QueueToStackAdapterPushEfficient();
		adapter.push(1);
		adapter.push(2);
		adapter.push(3);
		adapter.push(4);
		adapter.push(5);

		assertEquals(5, adapter.size());

		assertEquals(5, adapter.top());

		assertEquals(5, adapter.pop());

		assertEquals(4, adapter.pop());

		assertEquals(3, adapter.top());

		assertEquals(3, adapter.size());
	}

	@Test
	public void queueToStackAdapterPopEfficientTest()
	{
		QueueToStackAdapterPopEfficient adapter = new QueueToStackAdapterPopEfficient();
		adapter.push(1);
		adapter.push(2);
		adapter.push(3);
		adapter.push(4);
		adapter.push(5);

		assertEquals(5, adapter.size());

		assertEquals(5, adapter.top());

		assertEquals(5, adapter.pop());

		assertEquals(4, adapter.pop());

		assertEquals(3, adapter.top());

		assertEquals(3, adapter.size());
	}
}