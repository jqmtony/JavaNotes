//��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
//     �����£������� ��10�����ʱ�������������ף�
//     ��10�η�����ߣ�
public class Demo07 {

	public static void main(String[] args) {
		double h = 100,s = 0;
		for (int i = 1; i <= 10; i++) {
			s = s + 2*h;
			h = h / 2;
		}
		s = s - 100;
		System.out.println("������·��:\t" + s);
		System.out.println("���ĸ߶�:\t" + h);
	}
}
