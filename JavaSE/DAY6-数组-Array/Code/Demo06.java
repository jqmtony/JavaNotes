import java.util.Random;
/**
 * Ŀ��:  ʵ��ð��
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//-- 0.�ṩRandom
		Random random = new Random();
		//-- 1.�ṩһ������Ϊ20������
		int[] array = new int[20];
		//-- 2.����ѭ���������е�Ԫ�ؽ��и�ֵ.
		for(int i = 0 ; i < array.length ; i ++) {
			array[i] = random.nextInt(30);
		}
		//-- 3.�������ǰ������
		System.out.println("����ǰ:");
		for(int i : array) {
			System.out.print(i+"  ");
		}
		//-- 4.ʵ��ð������.���մ�С��������.
		//-- ���Ƶڼ��ֱȽ�
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			//-- ���Ƶ�i�ֵ�j�αȽ�.��ʵ�ʿ���Ԫ�������Ƚϵĵط�
			//-- -1  ��Ϊ�˱���Խ��
			//-- -i ����һ��ɨ�Ƚ�һ��Ԫ��
			for (int j = 0; j < array.length - 1 - i; j++) {
				System.out.println("\n��" + (i+1) + "�ֵ�" + (j+1) +"�αȽ�.�Ƚϵ���:\t"+array[j]+"\t��\t" + array[j+1]);
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
		
		
	}
}














