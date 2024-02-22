package datastructures.queue;

public class QueueUsingArray {
	
	private int data[];
	private int front;  //index of element at the front of the queue
	private int rear;    //index of element at the rear of the queue
	private int size;
	

	
	
	public QueueUsingArray() {
		data=new int[5];
		front=-1;
		rear=-1;
		
	}
	
	public QueueUsingArray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
		
	}
	
	
	public int size() {
		return size;
		
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enque(int ele) throws QueueFullException {
		
		if(size==data.length) {
			doubleCapacity();
			//throw new QueueFullException();
		}
		
		
		
		if(size==0) 
		{
			front=0;
		}
		
		//if(rear==data.length-1) {
			//rear=0;
		//}
		
		//rear++;
		
		rear=(rear+1)%data.length;
		
		
		data[rear]=ele;
		size++;
		
		
	}
	
	public int deque() throws QueueEmptyException {
		
		if(size==0) {
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		
		
		int temp=data[front];
		
		//if(front == (data.length-1)) {
		//	front=0;
		//}
		
		
		front++;
		
		front=(front+1)%data.length;
		
		size--;
		
		if(size==0) {
			front=-1;
			rear=-1;
			}
		
		
		return temp;
		
		
		
	}
	
	
	public int front() throws QueueEmptyException {
		
		if(size==0) {
			QueueEmptyException e=new QueueEmptyException();
			throw e;
		}
		
		return data[front];
		
	}
	
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int[] temp=data;
		data=new int[temp.length*2];
		int index=0;
		
		for(int i=front;i<temp.length;i++) {
			data[index++]=temp[i];
		}
		for(int j=0;j<=rear;j++) {
			data[index++]=temp[j];
		}
		
		
		
	}
	

}
