class Demo08{
	public static void main(String[] args) {
	
		//-- ��������int���͵ı������ֱ����ʼֵ5,2��0
		int i = 5;
		int j = 2;
		double result = 0;
		//-- ʹ��������������м���
		result = i + j;
		System.out.println("Result:"+(result));//7
		result = i - j;
		System.out.println("Result:"+(result));//3
		result = i * j;
		System.out.println("Result:"+(result));//10
		//-- int���͵���������������������Ľ������int
		//-- ���ﲻ�������������.ִ�е���ȥβ����
		result = i / j;
		System.out.println("Result:"+(result));//2
		result = i % j;
		System.out.println("Result:"+(result));//1
	}
}