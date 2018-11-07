import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ʹ��Lock��ӡABABAB
 */
public class tryLock {

	// ��Ϊ��Ҫ�������Ա���������Ա����
	private Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	// main����
	public static void main(String[] args) {
		final tryLock tryLock = new tryLock();

		// �߳�1
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
					System.out.println("��ȡʧ��");
				}
			};
		}.start();

		// �߳�2
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
				System.out.println(Thread.currentThread().getName() + "�ɹ���ȡlock��");
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				lock.unlock();
				System.out.println(Thread.currentThread().getName() + "�ͷ���lock!");
			}
			condition.signal();
		} else {
			System.out.println(Thread.currentThread().getName() + "��ȡʧ�ܣ�");
		}

	}
}
