
public class DataType{
	public static void main(String[] args){
		/*
			-- ����8��������Ӧԭ���������͵�8С��
		*/
		
		byte b = 1;
		short s = 1;
		int i = 1;
		//-- ��׺L������ǿ����������long���ͣ�L��Сд����
		long L1 = 1L;
		long l1 = 1l;
		//-- ͬ��float��doubleǿ����f��d��Сд����
		float f = 0.5f;
		double d = 0.6d;
		
		char ch = 'a';
		boolean blnT = true;
		boolean blnF = false;
		
		//-- ���8������
		System.out.println("b");
		System.out.println("s");
		System.out.println("i");
		System.out.println("L1");
		System.out.println("l1");
		System.out.println("f");
		System.out.println("d");
		System.out.println("ch");
		System.out.println("blnT");
		System.out.println("blnF");
		
		/*
			�ַ����͵����ָ�ֵ��ʽ
		*/
		
		//-- '����������'ֻ����һ���ַ���������һ���ַ������򷵻ش���δ�������ַ����֣�char��2���ֽڱ�1���ַ�
		char chNormal = 'a';
		//-- ASCii���벻��Ҫ�����ţ����ֶ�Ӧ�������ַ�
		char chASCii = 97; 
		char chA = 40;
		char chB = 57;
		
		//-- ��������ַ�
		System.out.println("chNormal");
		System.out.println("chASCii");		
		//-- ����char��������֣�������ӣ��õ�int����
		System.out.println("char 40 + char 57 ="+(chA+chB));	
		
		/*
			�����������͵ĸ�ֵ�Ƿ����������������
			���bool = 1��int���ͣ��� 'a'���ַ����ͣ���
			����ʾ���󣺲����ݵ����ͣ�int�޷�ת��Ϊboolean
		*/
		boolean bool = true;
		System.out.println("bool");
		
	}
}