package D20_thread;

public class AccountTransfer {
	/**
	 * 定义线程的类
	 */
	public class Thread1 extends Thread {
		/**
		 * 构造
		 */
		public Thread1() {

		}

		public Thread1(Runnable Target) {
			super(Target);
		}
		/**
		 * 重写run方法
		 */
		public void run() {
			System.out.println("扣除50块钱，剩余：");
		}
		
		class Thread2 implements Runnable{

			@Override
			public void run() {
				System.out.println("扣除50块钱，剩余：");
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
