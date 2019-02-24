package D20_Thread_Sychronized;

/**
 * 1. 编一个程序，实现两个线程 A 和 B ，A 和 B 同时启动， A线程每隔5秒显示字符串”AAA”，B线程每隔 1秒显示字符‘B’。
 * 提示需要用到两个方法wait和notify
 * 
 * @author ztnn
 */
public class waitNotify {
	/**
	 * 交错打印AAA和B，牵涉到两个线程的等待和唤醒，即wait和notify方法 它们属于Object，而非Thread
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
						 * 如果只写wait不写notify就全部进入等待， 也就是AAA B，然后什么也不输出了
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
	 * 测试类
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
