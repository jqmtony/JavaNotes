package D20_Thread_Sychronized;

/**
 * 1. ��һ������ʵ�������߳� A �� B ��A �� B ͬʱ������ A�߳�ÿ��5����ʾ�ַ�����AAA����B�߳�ÿ�� 1����ʾ�ַ���B����
 * ��ʾ��Ҫ�õ���������wait��notify
 * 
 * @author ztnn
 */
public class waitNotify {
	/**
	 * �����ӡAAA��B��ǣ�浽�����̵߳ĵȴ��ͻ��ѣ���wait��notify���� ��������Object������Thread
	 */
	class workA extends Thread {
		private Object obj;

		public workA(Object obj) {
			this.obj = obj;
		}

		public void run() {
			while (true) {
				synchronized (obj) {
					obj.notifyAll();
					System.out.println("AAA");
					try {
						/**
						 * ���ֻдwait��дnotify��ȫ������ȴ��� Ҳ����AAA B��Ȼ��ʲôҲ�������
						 */
						sleep(1000);
						obj.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}

			}
		}
	}

	class workB extends Thread {
		private Object obj;

		public workB(Object obj) {
			this.obj = obj;
		}

		public void run() {
			while (true) {
				synchronized (obj) {
					obj.notifyAll();
					System.out.println("B");
					try {
						sleep(1000);
						obj.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
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
		Object object = new Object();
		waitNotify wNotify = new waitNotify();
		workA wA = wNotify.new workA(object);
		workB wB = wNotify.new workB(object);
		wA.start();
		wB.start();
	}

}
