package D20_thread;

public class AccountTransfer {
	/**
	 * �����̵߳���
	 */
	public class Thread1 extends Thread {
		/**
		 * ����
		 */
		public Thread1() {

		}

		public Thread1(Runnable Target) {
			super(Target);
		}
		/**
		 * ��дrun����
		 */
		public void run() {
			System.out.println("�۳�50��Ǯ��ʣ�ࣺ");
		}
		
		class Thread2 implements Runnable{

			@Override
			public void run() {
				System.out.println("�۳�50��Ǯ��ʣ�ࣺ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		AccountTransfer accountTransfer = new AccountTransfer();
		Thread thread1 = accountTransfer.new Thread1();
		Thread thread2 = accountTransfer.new Thread1();
		thread1.start();
		thread2.start();
		
	}
	
}
