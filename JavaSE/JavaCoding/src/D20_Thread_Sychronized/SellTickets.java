package D20_Thread_Sychronized;

public class SellTickets {
	static int tickets = 100;

	public static int getTickets() {
		return tickets;
	}
	public static void setTickets(int tickets) {
		SellTickets.tickets = tickets;
	}

	/**
	 * 四个卖票的，卖完就别卖了，一张张卖，两个继承Thread，两个实现Runnable
	 */
	class SellA extends Thread {
		private String name;

		public SellA(String name) {
			this.name = name;
		}

		public void run() {
			while (true) {
				if (tickets <= 0) {
					System.out.println("卖光了！");
					break;
				} else {
					System.out.println(name + " 卖了1张票，还剩 " + (tickets - 1));
					tickets = tickets - 1;
				}
			}
		}
	}

	class SellB implements Runnable {

		private String name;
		public SellB() {
		}

		public SellB(SellTickets tickets) {
		}

		@Override
		public void run() {
			while (true) {
				if (SellTickets.getTickets() <= 0) {
					System.out.println("卖光了！");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " 卖了1"
							+ "张票，还剩 " + (SellTickets.getTickets() - 1));
					SellTickets.setTickets(SellTickets.getTickets()-1);
				}
			}
		}
	}

	/**
	 * 测试类
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SellTickets sellTickets = new SellTickets();
		SellA t1 = sellTickets.new SellA("线程A1");
		SellA t2 = sellTickets.new SellA("线程A2");

		
		SellB b = sellTickets.new SellB();
		Thread t3 = new Thread(b, "线程B1");
		Thread t4 = new Thread(b, "线程B2");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
