//��Ŀ����1��2��3��4�ĸ����֣�
//     ����ɶ��ٸ�������ͬ��һ�����������ظ����ֵ���λ�����������Ƕ����롣 
public class Demo08 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					if (i != j && j != k && i != k) {
						count ++;
						System.out.println(100*i+10*j+k); 
					}
				}
			}
		}
		System.out.println("�ܹ���:\t" + count + "����λ��");
		
	}
}
