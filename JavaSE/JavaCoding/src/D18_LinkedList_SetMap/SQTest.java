package D18_LinkedList_SetMap;

import java.util.Iterator;

public class SQTest {
	public static void main(String[] args) {

	// Stack push
	Stack<Object> stack = new Stack<>();
	stack.addStack("a");
	stack.addStack("b");
	stack.addStack(3);
	stack.addStack(4);
	stack.addStack(5);
	
	// 遍历，如果用for each的话会报错
	
	
	System.out.println("*****************************");
	// Queue Push
	Queue<Object> queue = new Queue<>();
	queue.pushQueue(1);
	queue.pushQueue(2);
	queue.pushQueue(3);
	queue.pushQueue(4);
	queue.pushQueue(5);
	queue.pushQueue(6);
	
	// Queue Pop
	int size1 = queue.size();
	for (int i = 0; i < size1; i++) {
		System.out.println(queue.popQueue());
	}
	
	}
}
