import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class tryBlockQueue {
	public static void main(String[] args) {
		// �ṩ�̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		// ������
		Lock lock = new ReentrantLock();
		// �ṩRunnable����
		Runnable runnable = new Runnable() {
			int index = 1;
			@Override
			public void run() {
				lock.lock();
				try {
					System.out.println(Thread.currentThread().getName() + "\t���˵�" + (index++) + "��Ʊ");
					Thread.sleep(500);
				} catch (Exception e) {
				} finally {
					lock.unlock();
				}
			}
		};
		// ִ���߳�
		for (int i = 0; i < 100; i++) {
			threadPool.execute(runnable);
		}
	}
}
