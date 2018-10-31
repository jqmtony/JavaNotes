package D18_LinkedList;

import java.util.LinkedList;

public class Queue<E> {
	private LinkedList<E> linkedList;
	private int size;
	
	public Queue(){
		linkedList = new LinkedList<>();
	}
	// 添加
	public void pushQueue(E e) {
		linkedList.add(e);
	}
	// 删除，先进先出
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
