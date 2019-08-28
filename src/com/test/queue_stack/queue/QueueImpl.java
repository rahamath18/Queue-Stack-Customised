package com.test.queue_stack.queue;

import java.util.ArrayList;
import java.util.List;

// FIFO
public class QueueImpl<T> implements QueueI<T> {
	
	private List<T> list = new ArrayList<T>();

	@Override
	public T deQueue() {
		T sq = null;
		if(list != null && !list.isEmpty())
			sq =  list.remove(0);
		return sq;
	}

	@Override
	public void enQueue(T t) {
		list.add(t);
	}
	
	@Override
	public boolean isEmpty() {
		if (list == null || list.isEmpty())
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return (!isEmpty()) ? list.toString() : null;
	}
	
}
