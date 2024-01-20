package datastructures.stack;

public class StackUsingArray {
	
	private int data[];    //Array we use to build for stack
	private int topIndex;  //Index at the top of the stack
	
	//constructor
	public StackUsingArray() {
		data=new int[10];
		topIndex=-1;
	}
	
	//constructor with size
	public StackUsingArray(int size) {
		data=new int[size];
		topIndex=-1;
	}
	
	
	
	public void push(int ele)  {
		
		//If stack is full
		if(topIndex==data.length - 1) {
			//StackFullException e=new StackFullException();
			//throw e; // Throw exception
			doubleCapacity();
			System.out.println("double capacity function used");
			
			
		}
		
		topIndex++;
		data[topIndex]=ele ;
		
		//Also, We can use shortcut  like this "data[++topIndex]=ele ;"
		
		}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int[] temp=data;
		data=new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
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
