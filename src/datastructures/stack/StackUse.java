package datastructures.stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		
		StackUsingArray stack1=new StackUsingArray(2);
		StackUsingLL<Integer> stack=new StackUsingLL();
		stack.push(30);
		stack.push(90);
		stack.push(80);
		stack.push(40);
		stack.push(60);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	
		

	}

}
