import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		ExecutorService threadPoolOrder = Executors.newFixedThreadPool(3);
		Runnable orderTable = new orderTable();
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
				System.out.println("[服务台 " + Thread.currentThread().getName() + "] 下单了：" + toMake.getName());
				makeHamburgers.put(toMake);
			} catch (InterruptedException e) {
				System.out.println("点单异常");
			}
		}
	}
	/**
	 * 后台有两名工作人员在制作汉堡
	 */
	class makeTable implements Runnable {
		public void run() {
			try {
				System.out.println(
						"[后台制作 " + Thread.currentThread().getName() + "] 请取餐：" + makeHamburgers.take().getName());
				Thread.sleep(333);
			} catch (InterruptedException e) {
				System.out.println("制作异常");
			}
		}
	}

}

public class Hamburger {
	private String name;

	// 有参构造，输入汉堡名称
	public Hamburger(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// 创建汉堡
		Hamburger h1 = new Hamburger("海陆空三味大餐");
		Hamburger h2 = new Hamburger("无辣不欢组合");
		Hamburger h3 = new Hamburger("经典麦辣鸡腿堡套餐");
		Hamburger h4 = new Hamburger("不素之霸双牛堡套餐");
		Hamburger h5 = new Hamburger("经典麦辣鸡腿堡套餐");
		Hamburger h6 = new Hamburger("不素之霸双牛堡套餐");
		// 把汉堡放到队列里面
		BlockingQueue<Hamburger> orderHam = new ArrayBlockingQueue<>(10);
		orderHam.put(h1);
		orderHam.put(h2);
		orderHam.put(h3);
		orderHam.put(h4);
		orderHam.put(h5);
		orderHam.put(h6);
		// 创建麦当劳，把汉堡给麦当劳
		McDonaldSerLine visitMcD = new McDonaldSerLine(orderHam);
		visitMcD.start();
	}
}


