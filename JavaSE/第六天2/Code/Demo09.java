import java.util.Arrays;

public class Demo09 {

	public static void main(String[] args) {
		
		//-- �����е�������������ı䴦��.���ʻ��Ǵ���һ���µ�����.
		
		int[] array = {1,2,3,4,5};
		
		System.out.println(array.length);
		
		//-- ����API�����ı���������
		array = Arrays.copyOf(array, 10);
		
		System.out.println(Arrays.toString(array));	
	}
}
