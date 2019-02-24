package D20_Thread_Sychronized.MonkeyPeach;

public class MonekyThread implements Runnable {

	private Monkey monkey;

	/**
	 * 构造，用于new对象
	 */
	public MonekyThread() {
		// TODO Auto-generated constructor stub
	}

	public MonekyThread(Monkey monkey) {
		this.monkey = monkey;
	}

	/**
	 * 三只猴子，抢桃子吃，每次吃掉一半，直到吃完
	 */
	@Override
	public void run() {
		// 共享资源，就是一个线程结束之后都可以去抢
		while (true) {
			synchronized (monkey) {
				// 没有桃子就结束
				if (monkey.getPeachNum() <= 0) {
					System.out.println("没有桃子了！");
					break;
				}
				if (monkey.getPeachNum() == 1) {
					System.out.println("还有一个桃子！被"+Thread.currentThread().getName()+"抢走了！");
					monkey.setPeachNum(monkey.getPeachNum() - 1);
				} else {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("ERRO!!!!!!!");
					}
					// 还有桃子的话，执行一次线程，桃子就少一半
					System.out.print("当前桃子数量为"+monkey.getPeachNum()+",");
					System.out.print(Thread.currentThread().getName()+"吃"
							+ "了"+(monkey.getPeachNum()/2)+"个桃子，还剩");
					// 剩余桃子数量
					monkey.setPeachNum(monkey.getPeachNum()-monkey.getPeachNum()/2);
					System.out.println(monkey.getPeachNum()+"个桃子");
				}
				try {
					Thread.sleep(333);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
