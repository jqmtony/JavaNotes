package McD;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1.麦当劳有三个服务台在进行点餐工作.后台有两名工作人员在制作汉堡. 现在有ABCD四个客户来点餐分别点:
 * 海陆空三味大餐,无辣不欢组合,经典麦辣鸡腿堡套餐,不素之霸双牛堡套餐. 使用线程池和阻塞队列来实现这一过程.
 * 
 * @author Administrator
 *
 */
public class McDonaldSerLine {
	/**
	 * 需要两个全局变量的队列，按需点单和制作汉堡
	 */
	protected BlockingQueue<Hamburger> orderHamburgers;
	protected BlockingQueue<Hamburger> makeHamburgers;

	public McDonaldSerLine(BlockingQueue<Hamburger> orderHamburgers) {
		this.orderHamburgers = new ArrayBlockingQueue<>(10);
		this.makeHamburgers = new ArrayBlockingQueue<>(10);
		this.orderHamburgers = orderHamburgers;
	}

	/**
	 * 启动服务台和后台制作的线程池，前台也就是测试类要给汉堡作为参数！！！！
	 */
	public void start() {
		// 一个线程池里面存在三个服务台，一次只能进三个线程
		ExecutorService threadPoolOrder = Executors.newFixedThreadPool(3);
		Runnable orderTable = new orderTable();
		// 有两名员工，即一次只能进两个线程
		ExecutorService threadPoolMake = Executors.newFixedThreadPool(2);
		Runnable makeTable = new makeTable();
		// 运行
		while (true) {
			threadPoolOrder.execute(orderTable);
			threadPoolMake.execute(makeTable);
		}
	}

	/**
	 * 三个服务台的工作流
	 */
	class orderTable implements Runnable {
		public void run() {
			// 客户下单汉堡
			try {
				Hamburger toMake = orderHamburgers.take();
				// 用hamburger里面getname()方法拿汉堡名字
				System.out.println("[服务台 " + Thread.currentThread().getName() + "] 下单了：" + toMake.getName());
				// 把汉堡从下单的队列给制作的队列
				makeHamburgers.put(toMake);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("点单异常");
			}
		}
	}

	/**
	 * 后台有两名工作人员在制作汉堡
	 */
	class makeTable implements Runnable {

		public void run() {
			// 员工制作汉堡
			try {
				// 从制作的队列中取出汉堡：makeHamburgers.take()
				System.out.println(
						"[后台制作 " + Thread.currentThread().getName() + "] 请取餐：" + makeHamburgers.take().getName());
				Thread.sleep(333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("制作异常");
			}
		}
	}

}
