import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock打印ABABAB
 */
public class tryLock {

	// 因为需要共享，所以必须声明成员变量
	private Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	// main方法
	public static void main(String[] args) {
		final tryLock tryLock = new tryLock();

		// 线程1
		new Thread() {
			@Override
			public void run() {
				if(tryLock.lock.tryLock()) {
					System.out.println("A");
					try {
						Thread.sleep(333);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						tryLock.lock.unlock();
					}
				}else {
					System.out.println("获取失败");
				}
			};
		}.start();

		// 线程2
		new Thread() {
			@Override
			public void run() {
				try {
					tryLock.test(this);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}

	public void test(Thread thread) throws InterruptedException {

		if (lock.tryLock()) {
			condition.await();
			try {
				System.out.println(Thread.currentThread().getName() + "成功获取lock！");
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + "释放了lock!");
			}
			condition.signal();
		} else {
			System.out.println(Thread.currentThread().getName() + "获取失败！");
		}

	}
}
