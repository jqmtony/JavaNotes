package D20_Thread_Sychronized.MonkeyPeach;

public class MonkeyTest {

	public static void main(String[] args) {
		// ������Ҫ�Ķ���ͳ�ʼ������
		Monkey monkey = new Monkey();
		monkey.setPeachNum(100);
		monkey.setMonkey("����1");
		monkey.setMonkey("����2");
		monkey.setMonkey("����3");

		// �������̶���
		MonekyThread test = new MonekyThread(monkey);
		Thread t2 = new Thread(test, "����2");
		Thread t3 = new Thread(test, "����3");
		Thread t1 = new Thread(test, "����1");

		t2.start();
		t3.start();
		t1.start();
		

	}

}
