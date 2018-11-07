import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class tryBlockQueue {
	public static void main(String[] args) {
		// 提供线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		// 加上锁
		Lock lock = new ReentrantLock();
		// 提供Runnable方法
		Runnable runnable = new Runnable() {
			int index = 1;
			@Override
			public void run() {
				lock.lock();
				try {
					System.out.println(Thread.currentThread().getName() + "\t卖了第" + (index++) + "张票");
					Thread.sleep(500);
				} catch (Exception e) {
				} finally {
					lock.unlock();
				}
			}
		};
		// 执行线程
		for (int i = 0; i < 100; i++) {
			threadPool.execute(runnable);
		}
	}
}
