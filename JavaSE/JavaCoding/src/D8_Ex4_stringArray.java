import java.lang.reflect.Array;

/*
 * 	�����������ַ����ĳ��Ƚ��н�������
 */
public class D8_Ex4_stringArray {
	public static void main(String[] args) {
		// �����ַ�������
		String[] array = {"a","abc","abcd","abcde","abcdef","a3333","a2"};
		System.out.print("ԭ���飺\t" + array);
		// ���÷���
		stringArray(array);
		// �������Ԫ��
		for(String i: array) { // i������Ԫ��
			System.out.println("����Ԫ�أ�\t"+i+"\t�ַ������ȣ�\t"+i.length());
		}
	}
	
	// ����
	public static void stringArray(String[] target) {
		// ��ȡ�ַ�������
		for(int i =0; i<target.length-1;i++) {
			for(int j =0; j<target.length-1-i;j++) { 
				if(target[j].length() < target[j+1].length()  ) { // ǰ���str����С����������
					// str 1, str 2, str3
					String temp = target[j]; // str1,(str2),str3
					target[j] = target[j+1]; // str1,(str1),str3
					target[j+1] = temp; // 
				}
			}
		// ����С�������ţ����ȴ����ǰ��
		}
	}
	
}
