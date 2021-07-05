package com.bridgelabz.stacksQueues;

import org.junit.Assert;
import org.junit.Test;

public class StackTestCase {
	@Test
	public void given3Nums_WhenAdded_ShouldHaveLastAdded() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		StackClass stack = new StackClass();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		INode peak = stack.peak();
		Assert.assertEquals(thirdNode, peak);
	}

	@Test
	public void given3Nums_IntoStack_WhenPopped_ShouldHaveLastAddedOut() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		StackClass stack = new StackClass();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode pop = stack.pop();
		stack.printStack();
		Assert.assertEquals(thirdNode, pop);
	}

	@Test
	public void given3Nums_WhenEnqueued_ShouldBeLast() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		StackClass stack = new StackClass();
		stack.enqueue(firstNode);
		stack.enqueue(secondNode);
		stack.enqueue(thirdNode);
		stack.printStack();
		Assert.assertEquals(stack.lastestElementOfStack(), firstNode);
	}

	public void whenDequeued_TailShouldBeMovedBackOneNode() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		StackClass stack = new StackClass();
		stack.enqueue(firstNode);
		stack.enqueue(secondNode);
		stack.enqueue(thirdNode);
		stack.dequeue();
		Assert.assertEquals(stack.firstElementOfQueue(), secondNode);
	}
}
