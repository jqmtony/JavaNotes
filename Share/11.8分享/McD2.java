import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class test1 {
	public static void main(String[] args) {
		BlockingQueue<hamburger> blockingQueue=new ArrayBlockingQueue<>(10);
		hamburger h1=new hamburger("海陆空三味大餐");
		hamburger h2=new hamburger("海陆空三味大餐");
		hamburger h3=new hamburger("经典麦辣鸡腿堡套餐");
		hamburger h4=new hamburger("不素之霸双牛堡套餐");
		try {
			blockingQueue.put(h1);
			blockingQueue.put(h2);
			blockingQueue.put(h3);
			blockingQueue.put(h4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Ex01 ex01=new Ex01();
		ex01.parturition(ex01.work(blockingQueue));;
	}
}






import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01 {
	private ExecutorService threadPool;
	private static BlockingQueue<hamburger> blockingQueue2;
	private static BlockingQueue<hamburger> blockingQueue3;

	
	public BlockingQueue<hamburger> work(BlockingQueue<hamburger> blockingQueue3) {
		blockingQueue2=new ArrayBlockingQueue<>(3);
		threadPool=Executors.newFixedThreadPool(3);
		while (blockingQueue3.size()>0) {
			Runnable runnable=new Runnable() {
			public void run() {
				try {
					hamburger hamburger=blockingQueue3.take();
					System.out.println(Thread.currentThread().getName()+"接单\t"+hamburger.getName());
					blockingQueue2.put(hamburger);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		};
		for (int i = 0; i < blockingQueue3.size(); i++) {
			threadPool.execute(runnable);
			if(blockingQueue2.size()==3) {
				return blockingQueue2;	
			}
		}
		}
		return blockingQueue2;
}	
	public void parturition(BlockingQueue<hamburger> blockingQueue2){
		threadPool=Executors.newFixedThreadPool(2);
		while (true ) {
			Runnable runnable=new Runnable() {
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()+"给到客户\t"+blockingQueue2.take().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		};
		for (int i = 0; i < blockingQueue2.size(); i++) {
			threadPool.execute(runnable);
		}
		if(blockingQueue2.size()==0) {
			break;
		}
		}
	}
}






public class hamburger {
	public hamburger(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}