package dev.jaib.ds.pep.beginner.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackUsingArrayTest
{
	@Test
	public void testStackPush()
	{
		StackUsingArray<Integer> stack = new StackUsingArray<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println(stack);
		assertEquals(10, stack.size());
		stack.push(11);
		stack.push(12);
		System.out.println(stack);
		assertEquals(12, stack.size());
	}

	@Test
	public void testStackPushPop()
	{
		StackUsingArray<Integer> stack = new StackUsingArray<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println(stack);
		assertEquals(10, stack.size());
		stack.push(11);
		stack.push(12);
		System.out.println(stack);
		assertEquals(12, stack.size());

		int data12 = stack.pop();
		assertEquals(12, data12);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		int data1 = stack.pop();
		assertEquals(1, data1);
		System.out.println(stack);
		Integer dataNull = stack.pop();
		assertNull(dataNull);
		assertTrue(stack.empty());
	}
}
