package dev.jaib.ds.pep.beginner.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueToStackAdapterTest
{

	@Test
	public void queueToStackAdapterPushEfficientTest()
	{
		QueueToStackAdapter adapter = new QueueToStackAdapter();
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