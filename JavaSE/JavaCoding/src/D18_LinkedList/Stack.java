package D18_LinkedList;

import java.util.LinkedList;

public class Stack<E> {
	// 设为E这样你想是什么类型的都可以
	private LinkedList<E> linkedList;
	private int size;

	public Stack() {
		linkedList = new LinkedList<>();
	}
	
	public int size() {
		size = linkedList.size();
		return size;
	}

	// add值
	public void addStack(E e) {
		linkedList.add(e);
	}
	// 拿出值，先进后出，所以从后面拿
	public E popStack() {
		return linkedList.removeLast();
	}

	@Override
	public String toString() {
		return "Stack [linkedList=" + linkedList + " Size: "+linkedList.size()+"]";
	}

	
}
