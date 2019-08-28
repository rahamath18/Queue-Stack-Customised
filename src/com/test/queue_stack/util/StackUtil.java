package com.test.queue_stack.util;

import com.test.queue_stack.queue.QueueImpl;
import com.test.queue_stack.stack.StackImpl;

public class StackUtil {
	
	public static void reverseMyStack(StackImpl<String> myStack) {
		QueueImpl<String> myQueue = new QueueImpl<String>();
		reverseMyStack(myStack, myQueue);
		while(!myQueue.isEmpty()) 
			myStack.push(myQueue.deQueue());
	}
	
	private static StackImpl<String> reverseMyStack(StackImpl<String> myStack, QueueImpl<String> myQueue) {
		if(myStack == null)
			return myStack;
		else {
			String t = myStack.pop();
			if(t == null)
				return myStack;
			else {
				myQueue.enQueue(t);
				reverseMyStack(myStack, myQueue);
			}
		}		
		return myStack;
	}

}
