import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// ��������
		Hamburger h1 = new Hamburger("��½����ζ���");
		Hamburger h2 = new Hamburger("�����������");
		Hamburger h3 = new Hamburger("�����������ȱ��ײ�");
		Hamburger h4 = new Hamburger("����֮��˫ţ���ײ�");
//		Hamburger h5 = new Hamburger("�����������ȱ��ײ�");
//		Hamburger h6 = new Hamburger("����֮��˫ţ���ײ�");
		// �Ѻ����ŵ���������
		BlockingQueue<Hamburger> orderHam = new ArrayBlockingQueue<>(10);
		orderHam.put(h1);
		orderHam.put(h2);
		orderHam.put(h3);
		orderHam.put(h4);
//		orderHam.put(h5);
//		orderHam.put(h6);
		// �������ͣ��Ѻ���������
		McDonaldSerLine visitMcD = new McDonaldSerLine(orderHam);
		visitMcD.start();
	}
}
