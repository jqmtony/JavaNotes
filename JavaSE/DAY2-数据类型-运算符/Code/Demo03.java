class Demo03 {
	public static void main(String[] args) {
		//-- 声明8个变量对应原生数据类型的8小种
		byte b = 1;
		short s = 1;
		int i = 1;
		//-- 后缀L是用于强调该类型是long类型.L大小写都可以
		long l = 1L;
		
		float f = 0.0F;
		double d = 0.0D;
		
		char c  = 'a';
		
		boolean bool = true;
		
		//-- 对8个变量进行输出
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
	}
}