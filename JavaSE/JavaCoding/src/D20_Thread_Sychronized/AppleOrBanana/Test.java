package D20_Thread_Sychronized.AppleOrBanana;

public class Test {
	public int apple;

	/**
	 * �ְ�
	 * 
	 * @param args
	 */
	class Father extends Thread {
		public void run() {
			while (true) {
				if(apple>=1) {
					System.out.println("��������"+apple+"��ƻ���ˣ�");
					break;
				}
				apple = apple + 1;
				System.out.println("�ְַ���һ��ƻ������������"+apple+"��ƻ��");
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Ů��
	 * 
	 */
	class Daughter extends Thread {
		public void run() {
			while (true) {
				if(apple<=0) {
					System.out.println("��������"+apple+"��ƻ��");
					break;
				}
				apple = apple - 1;
				System.out.println("Ů������һ��ƻ������������"+apple+"��ƻ��");
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
