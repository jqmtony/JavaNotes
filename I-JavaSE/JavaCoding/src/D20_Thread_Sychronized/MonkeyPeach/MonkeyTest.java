package D20_Thread_Sychronized.MonkeyPeach;

public class MonkeyTest {

	public static void main(String[] args) {
		// 创建主要的对象和初始化数据
		Monkey monkey = new Monkey();
		monkey.setPeachNum(100);
		monkey.setMonkey("猴子1");
		monkey.setMonkey("猴子2");
		monkey.setMonkey("猴子3");

		// 创建进程对象
		MonekyThread test = new MonekyThread(monkey);
		Thread t2 = new Thread(test, "猴子2");
		Thread t3 = new Thread(test, "猴子3");
		Thread t1 = new Thread(test, "猴子1");

		t2.start();
		t3.start();
		t1.start();
		

	}

}
