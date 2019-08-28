package com.test.queue_stack.queue;

public interface QueueI<T> {
	
	void enQueue(T t);
	
	T deQueue();
	
	boolean isEmpty();

}
