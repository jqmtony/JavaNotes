/*
 * Ŀ��:��Ҫ��һ������.��������������������(������Ԫ�ص���������int)
 */
public class Demo05 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		int[] array1 = {3,1,2,4,6,7,0,9};
		sortArray(array1);
		for (int i : array1) {
			System.out.println(i);
		}
	}
	
	
	
	
	/**
	 * 
	 * @param target Ҫ�����������
	 */
	public static void sortArray(int[] target) {
		int temp= 0;
		for (int i = 0; i < target.length - 1; i++) {
			for (int j = 0; j < target.length - 1 - i; j++) {
				if (target[j] < target[j+1]) {
					temp = target[j];
					target[j] = target[j+1];
					target[j+1] = temp;
				}
			}
		}
	}

}
