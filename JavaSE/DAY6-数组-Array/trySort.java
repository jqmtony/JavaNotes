import java.util.Arrays;

/*
 * �ҳ���������ֵ����Сֵ
 */
class trySort {
	public static void main(String[] args) {
		int[] arraySort = {7,3,4,9,3,2,6,10,16,12,4};
		System.out.println(Arrays.toString(arraySort));
		// �ҳ�����ֵ����С��ֵ
		// ����ֱ�Ӳ���api: Arrays.sort(array);
		int temp = 0;
		for(int i=0;i<=arraySort.length;i++) {
			for(int j=0; j<arraySort.length-1-i;j++) {
				if(arraySort[j]>arraySort[j+1]) { // С����ǰ���������
					temp = arraySort[j];
					arraySort[j] = arraySort[j+1];
					arraySort[j+1] = temp;
//					System.out.println(Arrays.toString(arraySort));
				}
			}
		}
		System.out.println("��Сֵ��\t"+arraySort[0]);
		System.out.println("���ֵ��\t"+arraySort[arraySort.length-1]);
		
		// �鿴�Ƿ����ظ�����ֵ�������λ��
		System.out.println();
		
	}
}















