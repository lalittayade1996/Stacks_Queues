package com.bridgelabz.stacksQueues;

public class StackClass {
    private final NewLinkedList linkedList;

    public StackClass() {
        this.linkedList = new NewLinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode pop() {
        return linkedList.pop();
    }

    public void enqueue (INode node){
        linkedList.append(node);
    }

    public INode lastestElementOfStack() {
        return linkedList.head;
    }

    public void printStack() {
        linkedList.printNodes();
    }
}