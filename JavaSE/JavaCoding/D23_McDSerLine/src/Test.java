import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// 创建汉堡
		Hamburger h1 = new Hamburger("海陆空三味大餐");
		Hamburger h2 = new Hamburger("无辣不欢组合");
		Hamburger h3 = new Hamburger("经典麦辣鸡腿堡套餐");
		Hamburger h4 = new Hamburger("不素之霸双牛堡套餐");
//		Hamburger h5 = new Hamburger("经典麦辣鸡腿堡套餐");
//		Hamburger h6 = new Hamburger("不素之霸双牛堡套餐");
		// 把汉堡放到队列里面
		BlockingQueue<Hamburger> orderHam = new ArrayBlockingQueue<>(10);
		orderHam.put(h1);
		orderHam.put(h2);
		orderHam.put(h3);
		orderHam.put(h4);
//		orderHam.put(h5);
//		orderHam.put(h6);
		// 创建麦当劳，把汉堡给麦当劳
		McDonaldSerLine visitMcD = new McDonaldSerLine(orderHam);
		visitMcD.start();
	}
}
