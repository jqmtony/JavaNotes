import java.util.Random;

public class Demo03 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15) + 1;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		//-- ȡֵ��Χ��1-15 �ܹ�ȡ��15.���±����15.���Գ��Ⱦ���16.
		int[] target = new int[16];
		//-- ѭ��1-15.
		for (int i = 0; i < target.length; i++) {
			//--ȡi��ֵ�������е�ÿһ��Ԫ�ؽ��бȽ�
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					target[i] =  target[i] + 1;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < target.length; i++) {
			System.out.println("Ԫ��:\t" + (i) + "\t���ִ���:\t" + target[i]);
		}
	}
}
