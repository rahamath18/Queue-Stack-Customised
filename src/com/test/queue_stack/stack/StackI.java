package com.test.queue_stack.stack;

public interface StackI<T> {
	
	void push(T t);
	
	T pop();
	
	boolean isEmpty();

}
