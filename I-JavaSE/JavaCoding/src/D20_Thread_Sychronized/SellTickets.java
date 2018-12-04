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
	 * �ĸ���Ʊ�ģ�����ͱ����ˣ�һ�������������̳�Thread������ʵ��Runnable
	 */
	class SellA extends Thread {
		private String name;

		public SellA(String name) {
			this.name = name;
		}

		public void run() {
			while (true) {
				if (tickets <= 0) {
					System.out.println("�����ˣ�");
					break;
				} else {
					System.out.println(name + " ����1��Ʊ����ʣ " + (tickets - 1));
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
					System.out.println("�����ˣ�");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " ����1"
							+ "��Ʊ����ʣ " + (SellTickets.getTickets() - 1));
					SellTickets.setTickets(SellTickets.getTickets()-1);
				}
			}
		}
	}

	/**
	 * ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SellTickets sellTickets = new SellTickets();
		SellA t1 = sellTickets.new SellA("�߳�A1");
		SellA t2 = sellTickets.new SellA("�߳�A2");

		
		SellB b = sellTickets.new SellB();
		Thread t3 = new Thread(b, "�߳�B1");
		Thread t4 = new Thread(b, "�߳�B2");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
