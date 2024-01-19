package datastructures.stack;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data=new int[10];
		topIndex=-1;
	}
	
	
	
	public void push(int ele) throws StackFullException {
		
		//If stack is full
		if(topIndex==data.length - 1) {
			StackFullException e=new StackFullException();
			throw e; // Throw exception
			
		}
		
		
		
		
		
		topIndex++;
		data[topIndex]=ele ;
		
		//Also, We can use shortcut  like this "data[++topIndex]=ele ;"
		
		}
	
	public int size() {
		
		return topIndex+1;
		
		}
	
	public int top() throws StackEmptyException{
		
		
		if(topIndex==-1) {
			//Throw StackEmptyException
			StackEmptyException e =new StackEmptyException();
			throw e;
		}
		return data[topIndex];
		
		
	}
	
	public boolean isEmpty() {
		
		
		
		if(topIndex==-1) {
			return true;
		}
		else {
			return false;
		}
		
		//Also other way, we can simply write  "return topIndex==-1;"
		
		
	}
	
	public int pop() throws StackEmptyException {
		
		if(topIndex==-1) {
			//Throw StackEmptyException
			StackEmptyException e =new StackEmptyException();
			throw e;
		}
		
		int top=data[topIndex];
		topIndex--;
		return top;
		
		
	}
	
	
	
	
	
	

}
