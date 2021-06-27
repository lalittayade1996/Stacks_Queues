package com.bridgelabz.stacksQueues;

public class Node<T> implements INode<T> {
	private Node<T> next;
	private T key;

	public Node(T key) {
		this.key = key;
		this.next = null;
	}

	public T getKey() {
		return key;
	}

	public void setkey(T key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (Node<T>) next;
	}
}
