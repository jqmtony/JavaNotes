package D20_thread;

public class ABThread extends Thread {

	private Object shareObj;
	private boolean flag;

	public void run() {
		while(flag)synchronized (shareObj) {
			System.out.print(Thread.currentThread().getName());
			System.out.println("ÄÚÈÝ");
			try {
				shareObj.wait();
			} catch (Exception e) {
				System.out.println("³ö´í");
			}
			
		}
	}
}
