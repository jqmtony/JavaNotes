import java.util.Arrays;
import java.util.Random;

/*
 * Ŀ��:
 * 	ʵ��һ������.����Ϊ10.�����Ԫ��ȡֵ�����1-10.û���ظ�
 */
public class Demo05 {

	public static void main(String[] args) {
		//-- �����Ƿ��ӡ.
		boolean isSame = false;
		//-- 1.�ṩRandom
		Random random = new Random();
		//-- 2.�ṩ��������
		int[] array = new int[10];
		//-- 3.����ѭ���������е�Ԫ�ؽ��и�ֵ����
		for(int i = 0 ; i < array.length ; i ++) {		
			//-- ����һ���������������.�����ȡֵ1-10
			//-- Ŀ��:��������ŵ�����array�е�i��λ����
			array[i] = random.nextInt(10)+1;			
			//-- Ŀ��:ȡ��0~i-1λ���ϵ�Ԫ�غ͵�iλ���ϵ�Ԫ�ؽ��бȽ�
			//-- ʵ��ֻ����i+1��Ԫ��.(+1��ԭ��:��Ϊiȡֵ��0��ʼ)
			//-- ����ֻ����5��Ԫ��.����Ҫ�Ƚϵ���ǰ�ĸ��͵����..���������Ĳ���Ҫ�Ƚ�.
			for(int j = 0 ; j < i ;j ++) {
				//-- ���������ṹ�͹�ϵ��������γɱȽ�����
				if(array[i] == array[j]) {
					/*
					 * Ҫ˼�����:
					 * 	���Ҫ����:�뿪�ڲ�for�������for �������������
					 *  �����Ҫ����:�����Ƚ���һ��.ֱ����i-1��Ԫ�ض���i��Ԫ�ز����.
					 */
					//-- Ŀ��:��֤i����.
					i--;
					isSame = true;
					break;	
				}else {
					isSame = false;
				}
			}
			if (!isSame) {
				System.out.println("��" + (i+1) + "λ���ϵ�Ԫ����:" + array[i]);
			}
		}
		
	}	
}
