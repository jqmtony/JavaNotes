class Demo05 {
	public static void main(String[] args) {
		
		byte b = 2;
		int i = 1;
		
		//-- �ѱ���b���������ֵ��ֵ������i
		i = b;
		System.out.println(i);
		//-- �ѱ���i���������ֵ��ֵ������b
		b = (byte)i;
		System.out.println(b);
		
		
	}
}