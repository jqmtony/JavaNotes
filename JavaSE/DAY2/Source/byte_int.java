class byte_int {
	public static void main(String[] args) {
		/*
			��ν�����ʵ���Ƿ���Ҫǿ��ת�������⣬
			С�ĵ���Ĳ���ǿת�����תС�ı���ǿת
		*/
		byte b = 1;
		//-- byte���Ϳ����Զ�ת��Ϊint���ͣ���ȫ����Ҫǿת
		System.out.println(b);
		//-- ����byte��int��1�����㷨��ʱ�򣬱���ǿת
		b = (byte)(b+1);
		System.out.println("b+1="+b);
	}
}