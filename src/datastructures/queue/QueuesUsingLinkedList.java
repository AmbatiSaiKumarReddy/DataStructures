package datastructures.queue;

import datastructures.linkedlist.Node;

public class QueuesUsingLinkedList<T> {
	
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public int size() {
		return size;
	}
	 
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enque(T ele) {
		
		Node<T> newElement=new Node<>();
		newElement.data=ele;
		
		
		if(rear==null) {
			front=newElement;
			rear=newElement;
		}
		else {
			rear.next=newElement;
			rear=newElement;
			
		}
		size++;
		
		
	}
	
	public T deque() throws QueueEmptyException {
		
		if(size==0) {
			throw new QueueEmptyException();
			
		}
		
		
		
		T ele=front.data;
		
		front=front.next;
		
		if(front==null) {
			rear=null;
		}
		
		size--;
		
		return ele;
		
		
	}
	
	public T front() throws QueueEmptyException {
		
		if(front == null) {
			throw new QueueEmptyException();
		}
		
		return front.data;
		
		
	}
	
	
	
	
	
	
	

}
