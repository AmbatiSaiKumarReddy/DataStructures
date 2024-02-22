package datastructures.queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		
		QueueUsingArray queue1=new QueueUsingArray();
		QueuesUsingLinkedList queue=new QueuesUsingLinkedList();
		
		int[] example= {10,20,30,40};
		for (int ele:example) {
			//try {
				queue.enque(ele);
			//} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			
		}
		System.out.println(queue.size());
		queue.deque();
		queue.deque();
		System.out.println(queue.size());
		
		//try {
			queue.enque(50);
			System.out.println(queue.size());
			queue.enque(60);
			System.out.println(queue.size());
			queue.enque(70);
			System.out.println(queue.size());
			queue.enque(80);
			System.out.println(queue.size());
			
			
		//} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		

	}

}
