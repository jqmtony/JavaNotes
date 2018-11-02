package D20_thread;

public class MonekyThread implements Runnable {

	private Monkey monkey;

	/**
	 * ���죬����new����
	 */
	public MonekyThread() {
		// TODO Auto-generated constructor stub
	}

	public MonekyThread(Monkey monkey) {
		this.monkey = monkey;
	}

	/**
	 * ��ֻ���ӣ������ӳԣ�ÿ�γԵ�һ�룬ֱ������
	 */
	@Override
	public void run() {
		// ������Դ������һ���߳̽���֮�󶼿���ȥ��
		while (true) {
			synchronized (monkey) {
				// û�����Ӿͽ���
				if (monkey.getPeachNum() <= 0) {
					System.out.println("û�������ˣ�");
					break;
				}
				if (monkey.getPeachNum() == 1) {
					System.out.println("����һ�����ӣ�ȡ���ˣ�");
					monkey.setPeachNum(monkey.getPeachNum() - 1);
				} else {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("ERRO!!!!!!!");
					}
					// �������ӵĻ���ִ��һ���̣߳����Ӿ���һ��
					System.out.print("��ǰ���� " + monkey.getPeachNum() + " �����ӣ�");
					System.out.print(Thread.currentThread().getName() + " ���ڳ�����******\n");
					monkey.setPeachNum(monkey.getPeachNum() - monkey.getPeachNum() / 2);
				}
			}
		}
	}
}
