package com.test.queue_stack.stack;

import java.util.ArrayList;
import java.util.List;

// LIFO
public class StackImpl<T> implements StackI<T> {

	private List<T> list = new ArrayList<T>();

	@Override
	public void push(T t) {
		if (list != null) 
			list.add(t);
	}

	@Override
	public T pop() {
		if (list != null && !isEmpty()) {
			T t = list.remove(list.size() - 1);
			return t;
		} else
			return null;
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
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		if(!isEmpty()) {
			for (int i = (list.size()-1); i >= 0; i--) {
				if(i != 0)
					sb.append(list.get(i) + ", ");
				else
					sb.append(list.get(i));
			}
		}
		sb.append("]");
		return sb.toString();
	}

}