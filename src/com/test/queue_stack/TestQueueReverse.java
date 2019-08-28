package com.test.queue_stack;

import com.test.queue_stack.queue.QueueImpl;
import com.test.queue_stack.util.QueueUtil;

public class TestQueueReverse {
	
	public static void main(String[] args) {
		QueueImpl<String> myQueue = new QueueImpl<String>();
		for (int i = 0; i < 4; i++) 
			myQueue.enQueue("A--" + i);
		
		System.out.println("Queue - First In First Out - FIFO");
		System.out.println("Before Reverse Queue : " + myQueue);
		QueueUtil.reverseMyQueue(myQueue);
		System.out.println("After  Reverse Queue : " + myQueue);
		 
	}

}
