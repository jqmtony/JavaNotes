import java.util.Random;

public class Demo02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15) + 1;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
		/*
		 * ��ķ���.ȡÿһ�����ͺ����Ԫ��һ�αȽ�.�Ƚ���ɺ��¼�ظ��Ĵ���
		 */
		
		int[] target = new int[20];
		boolean[] record = new boolean[20];
		
		//-- ȡ�����е�ÿһ��Ԫ��
		for (int i = 0; i < array.length; i++) {
			// -- �������е�ÿһ��Ԫ�ؽ��бȽ�
			for (int j = 0; j < target.length; j++) {
				if (array[i] == array[j] && record[array[i]] == false) {
					target[i] = target[i] + 1;
				}
			}
			//-- ���ڲ�ѭ������.��array[i]���Ԫ���Ѿ�ͳ�ƹ�������.
			//-- �޸ı�־.���ٴ�����ʱ������ͳ�Ƹ�Ԫ�صĴ���
			record[array[i]] = true;
		}
		
		System.out.println();
		int sum = 0;
		for (int i = 0; i < target.length; i++) {
			System.out.println("Ԫ��:\t" + array[i] + "\t����:\t" + target[i]);
			sum += target[i];
		}
		
		System.out.println("sum:\t" + sum);
	
	}
}
