package D20_thread;

public class ABTest {

	public static void main(String[] args) {
		
		ABThread abThread = new ABThread();
		
		Thread t1 = new Thread(abThread,"�߳�A");
		Thread t2 = new Thread(abThread,"�߳�B");
		t1.start();
		t2.start();
	}
	
}
