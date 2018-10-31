package D18_LinkedList;

import java.util.LinkedList;

public class Queue<E> {
	private LinkedList<E> linkedList;
	private int size;
	
	public Queue(){
		linkedList = new LinkedList<>();
	}
	// ���
	public void pushQueue(E e) {
		linkedList.add(e);
	}
	// ɾ�����Ƚ��ȳ�
	public E popQueue() {
		return linkedList.removeFirst();
	}
	
	public int size() {
		size= linkedList.size();
		return size;
	}
	@Override
	public String toString() {
		return "Queue [linkedList=" + linkedList +"Size "+linkedList.size()+ "]";
	}
	

}
