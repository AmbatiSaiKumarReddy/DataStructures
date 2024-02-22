package datastructures.stack;

import datastructures.linkedlist.Node;

public class StackUsingLL<T> {
	
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	public int  size() {
		return size;
		
	}
	
	public void push(T ele) {
		Node<T> newNode=new Node();
		newNode.data=ele;
		newNode.next=head;
		head=newNode;
		size++;
		
	}
	
	public T pop() throws StackEmptyException {
		
		if(head==null) {
			
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		
		T popElement=head.data;
		head=head.next;
		size--;
		return popElement;
		
	}
	
	public T top() throws StackEmptyException {
		if(head==null) {
			
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		
		return head.data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	
	

}
