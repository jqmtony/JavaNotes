package McD;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1.��������������̨�ڽ��е�͹���.��̨������������Ա����������. ������ABCD�ĸ��ͻ�����ͷֱ��:
 * ��½����ζ���,�����������,�����������ȱ��ײ�,����֮��˫ţ���ײ�. ʹ���̳߳غ�����������ʵ����һ����.
 * 
 * @author Administrator
 *
 */
public class McDonaldSerLine {
	/**
	 * ��Ҫ����ȫ�ֱ����Ķ��У�����㵥����������
	 */
	protected BlockingQueue<Hamburger> orderHamburgers;
	protected BlockingQueue<Hamburger> makeHamburgers;

	public McDonaldSerLine(BlockingQueue<Hamburger> orderHamburgers) {
		this.orderHamburgers = new ArrayBlockingQueue<>(10);
		this.makeHamburgers = new ArrayBlockingQueue<>(10);
		this.orderHamburgers = orderHamburgers;
	}

	/**
	 * ��������̨�ͺ�̨�������̳߳أ�ǰ̨Ҳ���ǲ�����Ҫ��������Ϊ������������
	 */
	public void start() {
		// һ���̳߳����������������̨��һ��ֻ�ܽ������߳�
		ExecutorService threadPoolOrder = Executors.newFixedThreadPool(3);
		Runnable orderTable = new orderTable();
		// ������Ա������һ��ֻ�ܽ������߳�
		ExecutorService threadPoolMake = Executors.newFixedThreadPool(2);
		Runnable makeTable = new makeTable();
		// ����
		while (true) {
			threadPoolOrder.execute(orderTable);
			threadPoolMake.execute(makeTable);
		}
	}

	/**
	 * ��������̨�Ĺ�����
	 */
	class orderTable implements Runnable {
		public void run() {
			// �ͻ��µ�����
			try {
				Hamburger toMake = orderHamburgers.take();
				// ��hamburger����getname()�����ú�������
				System.out.println("[����̨ " + Thread.currentThread().getName() + "] �µ��ˣ�" + toMake.getName());
				// �Ѻ������µ��Ķ��и������Ķ���
				makeHamburgers.put(toMake);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("�㵥�쳣");
			}
		}
	}

	/**
	 * ��̨������������Ա����������
	 */
	class makeTable implements Runnable {

		public void run() {
			// Ա����������
			try {
				// �������Ķ�����ȡ��������makeHamburgers.take()
				System.out.println(
						"[��̨���� " + Thread.currentThread().getName() + "] ��ȡ�ͣ�" + makeHamburgers.take().getName());
				Thread.sleep(333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("�����쳣");
			}
		}
	}

}
