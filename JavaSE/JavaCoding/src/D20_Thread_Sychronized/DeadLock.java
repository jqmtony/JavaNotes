package D20_Thread_Sychronized;

public class DeadLock {
	/**
	 * ���ԣ����֤����������������������Ϊ�ȴ���
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
		 * �߳�1
		 */
		Thread t1 = new Thread("�߳�1") {
			public void run() {
				// ����ռ��1
				synchronized (resource1) {
					// �ɹ�ռ��1
					System.out.println(getName() + "," + resource1);
					// ��Ϣһ���
					try {
						sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// ����ռ��2
				synchronized (resource2) {
					// �ɹ�ռ��2�����û�оͻ����
					System.out.println(getName() + "," + resource2);
				}
			}
		};
		Thread t2 = new Thread("�߳�2") {
			public void run() {
				// ����ռ��2
				synchronized (resource2) {
					// �ɹ�ռ��2
					System.out.println(getName() + "," + resource2);
					// ��Ϣһ���
					try {
						sleep(300);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// ����ռ��1
				synchronized (resource1) {
					// �ɹ�ռ��1�����û�оͻ����
					System.out.println(getName() + "," + resource1);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
