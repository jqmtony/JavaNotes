import java.util.Random;
import java.util.Arrays;
class Demo04{
	public static void main(String[] args){
	
		//-- ��һ������9������
		byte[] array1 = {1,2,3,4,5,6,7,8,9,10};
		short[] array2 = {1,2,3,4,5,6,7,8,9,10};
		int[] array3 = {1,2,3,4,5,6,7,8,9,10};
		long[] array4 = {1,2,3,4,5,6,7,8,9,10};
		
		float[] array5 = new float[10];
		double[] array6 = new double[10];
		
		char[] array7 = new char[10];
		
		boolean[] array8 = new  boolean[10];
		
		//-- �ڶ�����Եڶ��ַ�ʽ�������������Ƿ���ֵ
		System.out.println(array8.length);
		
		//-- ����ѭ�����������е�Ԫ��
		//-- һ�����鴴��.ϵͳ���Զ���������ÿ��λ�ø�ֵ
		//-- �������͵�Ĭ��ֵ.
		for(int i = 0 ; i < array8.length ; i ++){
			System.out.println(array8[i]);
		}
		
		
		//-- ������
		Random random = new Random();
		//-- Arrays.toString(����) �������е�Ԫ��һ�д�ӡ.
		System.out.println("��ֵǰ:\t" + Arrays.toString(array3));
		for(int i = 0 ;i < array3.length ; i ++ ){
			array3[i] = random.nextInt(10)+1;
		}
		System.out.println("��ֵ��:\t" + Arrays.toString(array3));
		
		//-- ������.��������б���
		//-- ��һ�ֱ�����ʽ ʹ����ͨfor
		for(int i = 0 ; i < array3.length ; i ++ ){
			System.out.println(array[i]);
		}
		
		//-- �ڶ��ֱ�����ʽ ʹ�ü�ǿfor Ҳ����for-each
		//-- ���������ı���.��д���Ƽ�ʹ��.
		//-- ��ʽ:for(������Ԫ�ص����� ���� : ����Դ)
		//-- ������Դarray3��ȡint���͵ı���������i��.
		//-- ����д����for���Զ����е���.
		for(int i : array3){
			System.ot.println(i);
		}
		
		//-- �����ֱ�����ʽ ʹ��API :Arrays.toString();
		//-- ��Ҫjava.util.Arrays����֧��
		System.out.println(Arrays.toString(array3));
		
		
		//-- ʹ��while����������
		int index = 0 ;
		while(index < array3.length){
			System.ot.println(array3[index++]);
		}
		
		//-- ʹ��do-while����������
		index = 0;
		do{
			System.ot.println(array3[index++]);
		}while(index < array3.length);
		
	}

}