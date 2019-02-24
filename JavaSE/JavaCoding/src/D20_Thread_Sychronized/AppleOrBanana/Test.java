package D20_Thread_Sychronized.AppleOrBanana;

public class Test {
	public int apple;

	/**
	 * 爸爸
	 * 
	 * @param args
	 */
	class Father extends Thread {
		public void run() {
			while (true) {
				if(apple>=1) {
					System.out.println("盘子里有"+apple+"个苹果了！");
					break;
				}
				apple = apple + 1;
				System.out.println("爸爸放了一个苹果，盘子里有"+apple+"个苹果");
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 女儿
	 * 
	 */
	class Daughter extends Thread {
		public void run() {
			while (true) {
				if(apple<=0) {
					System.out.println("盘子里有"+apple+"个苹果");
					break;
				}
				apple = apple - 1;
				System.out.println("女儿吃了一个苹果，盘子里有"+apple+"个苹果");
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		Father father = test.new Father();
		Daughter daughter = test.new Daughter();
		father.start();
		daughter.start();
	}
}
