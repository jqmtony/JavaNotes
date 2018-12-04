package D20_Thread_Sychronized;

public class DeadLock {
	/**
	 * 测试，如何证明它产生了死锁，就是因为等待吗？
	 */
	public static void main(String[] args) {
		deadLock();
	}

	/**
	 * deadLock
	 */
	public static void deadLock() {
		Object resource1 = "resource1";
		Object resource2 = "resource2";
		/**
		 * 线程1
		 */
		Thread t1 = new Thread("线程1") {
			public void run() {
				// 尝试占有1
				synchronized (resource1) {
					// 成功占有1
					System.out.println(getName() + "," + resource1);
					// 休息一会儿
					try {
						sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// 尝试占有2
				synchronized (resource2) {
					// 成功占有2，如果没有就会等着
					System.out.println(getName() + "," + resource2);
				}
			}
		};
		Thread t2 = new Thread("线程2") {
			public void run() {
				// 尝试占有2
				synchronized (resource2) {
					// 成功占有2
					System.out.println(getName() + "," + resource2);
					// 休息一会儿
					try {
						sleep(300);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// 尝试占有1
				synchronized (resource1) {
					// 成功占有1，如果没有就会等着
					System.out.println(getName() + "," + resource1);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
