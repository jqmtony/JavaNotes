import java.util.Arrays;

/*
 * 2.	
 * ��һ�����������н��в���ָ��������Ӧ�±꣬
 * �ٲ���ָ���������������ɾ��ָ������
 */
public class insetArray {
	public static void main(String[] args) {
		// 1.������������
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(array));
		// 2.����ָ����
		int num = 5;
		// 3.���ָ�������±�
		int index=0;
		for(int i: array) {
			if(i==num) {
				System.out.println("ָ�������±�Ϊ��"+index);
			}
			index++;
		}
		// 4.����ָ������������ȡ��
		array = Arrays.copyOf(array, array.length+1); // ��Ų����һ��λ�ø�ָ������Ҳ������չһλ 
		System.out.println(Arrays.toString(array)); // ��������һ��Ԫ��Ϊ0
		
		for(int i=0; i<array.length; i)
		
		// 5.������������
		// 6.ɾ��ָ����
	}
}
