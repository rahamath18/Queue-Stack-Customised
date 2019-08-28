package com.test.queue_stack;

import com.test.queue_stack.stack.StackImpl;
import com.test.queue_stack.util.StackUtil;

public class TestStackReverse {
	
	public static void main(String[] args) {
		StackImpl<String> myStack = new StackImpl<String>();
		for (int i = 0; i < 4; i++) 
			myStack.push("B-" + i);
		
		System.out.println("Stack - Last In First Out - LIFO");
		System.out.println("Before Reverse Stack : " + myStack);
		StackUtil.reverseMyStack(myStack);
		System.out.println("After  Reverse Stack : " + myStack);
		 
	}

}
