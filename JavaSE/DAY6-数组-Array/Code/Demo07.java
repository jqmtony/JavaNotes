import java.util.Arrays;

public class Demo07 {
	public static void main(String[] args) {
		//-- ���ŵ����þ��Ƿָ��� ��C�������ǳ��Ϸָ�����Ϊ��������ڵ�.
		int[] array = {7,3,4,9,3,2,6,10,16,12,4};
		
		//-- �����ֵ����Сֵ.
		
		Arrays.sort(array);
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("��Сֵ:\t" + array[0]);
		System.out.println("���ֵ:\t" + array[array.length]);
	}
}
