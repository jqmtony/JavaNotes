import java.util.Arrays;
import java.util.Random;

class tryArray1 {
	public static void main(String[] args) {
		// int���͵�����
		int[] array1 = {1,2,3,4,5};
		double[] array2 = {0.0,0.1,0.2,0.3,0.4};
		// boolean,string,scanner
		
		// �鿴����Ƿ�˳��
		System.out.println(array1); // c1@....
		System.out.println(Arrays.toString(array1));// [1,2,3,4,5]
		System.out.println(array2);
	}
}

class tryArray2 {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		// ���6,�ɼ��±��0��ʼ
		System.out.println("ԭ����ֵ"+array1[5]); 
		// ��array1[5]��ֵ��6��Ϊ10
		array1[5] = 10;
		System.out.println("��ֵ���ֵ"+array1[5]); 
		
	}
}

class printArray {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9,13};
		//-- �������������б�����ѭ��ȡ���е�Ԫ��
		//-- ���ʽ1~3�����Ȼ�ȡ���ʽarray.length�����赼��
		for(int i=0;i<array1.length;i++) { 
			//-- ѭ������ʽ4
			System.out.println(array1[i]); 
		}
	}
}

class exercise {
	public static void main(String[] args) {
		// 1.1�������飬ԭ������8С��
		/* int[] arrayint = {1,2,3,4,5,6,7,8,9};
		byte[] arraybyte = {1,2,3,4,5,6,7,8,9};
		short[] arrayshort = {1,2,3,4,5,6,7,8,9};
		long[] arraylong = {1,2,3,4,5,6,7,8,9};
		float[] arrayfloat = {1,2,3,4,5,6,7,8,9};
		double[] arraydouble = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
		char[] arraychar = {'a','b','c','d','e'}; // ˫���ţ��������޷�ת��string
		String[] arrayString = {"a","b","c","d","e","f","g"}; // ˫���ţ��������޷�ת��string
		boolean[] arrayboolean = {true,false,true,false,true,false}; */

		// 1.2�������飬����Ϊ18
		int[] arrayint2 = new int[11];
		byte[] arraybyte2 = new byte[18];
		short[] arrayshort2 = new short[18];
		long[] arraylong2 = new long[18];
		float[] arrayfloat2 = new float[18];
		double[] arraydouble2 = new double[18];
		char[] arraychar2 = new char[18];
		String[] arrayString2 = new String[18];
		boolean[] arrayboolean2 = new boolean[18];
		
		// 2.��1.2��9��������б������������ֵ
		/* for(int int2=0;int2<arrayint2.length;int2++) {
			System.out.println(arrayint2[int2]);
		}
		for(int byte2=0;byte2<arraybyte2.length;byte2++) {
			System.out.println(arraybyte2[byte2]);
		}
		for(int short2=0;short2<arrayshort2.length;short2++) {
			System.out.println(arrayshort2[short2]);
		}
		for(int long2=0;long2<arraylong2.length;long2++) {
			System.out.println(arraylong2[long2]);
		}
		for(int float2=0;float2<arrayfloat2.length;float2++) {
			System.out.println(arrayfloat2[float2]);
		}
		for(int double2=0;double2<arraydouble2.length;double2++) {
			System.out.println(arraydouble2[double2]);
		}
		for(int char2=0;char2<arraychar2.length;char2++) {
			System.out.println(arraychar2[char2]);
		}
		for(int String2=0;String2<arrayString2.length;String2++) {
			System.out.println(arrayString2[String2]);
		}
		// ��ӡ��������flase,.....����Ϊϵͳ��ֵ����Ĭ��ֵ��false
		for(int boolean2=0;boolean2<arrayboolean2.length;boolean2++) {
			System.out.println(arrayboolean2[boolean2]);
		} */
		
		// 3.��int���͵����鸳ֵ.ȡֵ�����(�����ȡֵ��Χ10)
		// System.out.println("--------3.���鸳ֵ--------");
		/* 
			random������ȡֵ��ʽ
			��һ�֣�
			import java.util.Random;
			Random random = new Random();
			int num = random.nextInt(10)+1; 
			�ڶ��֣�
			int num = (int)(Math.random()*10+1);
		*/
		System.out.println("��ֵǰ��"+Arrays.toString(arrayint2));
		
		// for(int int3=0;int3<arrayint2.length;int3++) {
			// int num = (int)(Math.random()*10+1);
			// arrayint2[int3]= num;
		// }
		
		// Arrays.toString(array); һ�д�ӡ����Ԫ��
		// System.out.println("��ֵ��"+Arrays.toString(arrayint2));
		
		// 4.�ӵ�����.��int����������б���.
		//-- �ڶ��ֱ�����ʽ����ǿfor��Ҳ����for-each���Ƽ�ʹ��
		// for(int i:arrayint2) {
			// System.out.println(i);
		// }
		
		// 5.Ҫ�������е�Ԫ�ز����ظ�
		// int[] arrayintb = new[10];
		for(int i=0;i<arrayint2.length;i++) {
			 /* 
				ע�����int�����Ԫ�س���10����Ҫ���������ΧҲ������
				��Ȼ�����ţ��ᵼ����ѭ��~~ 
			*/
			int arraynum = (int)(Math.random()*20+1);
			arrayint2[i]=arraynum;
			// ��array[i]��array[0~i]�Ƚ�
			/* System.out.println("---------------");
			System.out.println("���i��"+i) */;
			for(int j=0;j<i;j++) {
				/* System.out.println("���j��"+j); // j=i-1
				System.out.println("���arrayint2[j]��"+arrayint2[j]);
				System.out.println("���arrayint2[i]��"+arrayint2[i]);
				System.out.println(); */
				if(arrayint2[j]==arrayint2[i]) {
					/* System.out.println("��ȣ���Ҫ�޸ĵ�ǰԪ��ֵ��\n"); */
					i = i-1;
				}
			}
		}
		System.out.println("��ֵ��"+Arrays.toString(arrayint2));
	}
}


















