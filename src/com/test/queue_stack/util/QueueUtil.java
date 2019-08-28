package com.test.queue_stack.util;

import com.test.queue_stack.queue.QueueImpl;
import com.test.queue_stack.stack.StackImpl;

public class QueueUtil {
	
	public static void reverseMyQueue(QueueImpl<String> myQueue) {
		StackImpl<String> myStack = new StackImpl<String>();
		reverseMyQueue(myQueue, myStack);
		while(!myStack.isEmpty()) 
			myQueue.enQueue(myStack.pop());
	}
	
	private static StackImpl<String> reverseMyQueue(QueueImpl<String> myQueue, StackImpl<String> myStack) {
		if(myQueue == null)
			return myStack;
		else {
			String t = myQueue.deQueue();
			if(t == null)
				return myStack;
			else {
				myStack.push(t);
				reverseMyQueue(myQueue, myStack);
			}
		}		
		return myStack;
	}

}
