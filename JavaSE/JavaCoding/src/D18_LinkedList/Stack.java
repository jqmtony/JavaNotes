package D18_LinkedList;

import java.util.LinkedList;

public class Stack<E> {
	// ��ΪE����������ʲô���͵Ķ�����
	private LinkedList<E> linkedList;
	private int size;

	public Stack() {
		linkedList = new LinkedList<>();
	}
	
	public int size() {
		size = linkedList.size();
		return size;
	}

	// addֵ
	public void addStack(E e) {
		linkedList.add(e);
	}
	// �ó�ֵ���Ƚ���������ԴӺ�����
	public E popStack() {
		return linkedList.removeLast();
	}

	@Override
	public String toString() {
		return "Stack [linkedList=" + linkedList + " Size: "+linkedList.size()+"]";
	}

	
}
