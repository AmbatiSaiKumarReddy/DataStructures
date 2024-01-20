package datastructures.stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		
		StackUsingArray stack=new StackUsingArray(2);
		stack.push(30);
		stack.push(90);
		stack.push(80);
		stack.push(40);
		stack.push(60);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.size());
	
		

	}

}
