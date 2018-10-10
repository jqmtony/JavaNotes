class Demo05 {
	public static void main(String[] args) {
		
		byte b = 2;
		int i = 1;
		
		//-- 把变量b中所保存的值赋值给变量i
		i = b;
		System.out.println(i);
		//-- 把变量i中所保存的值赋值给变量b
		b = (byte)i;
		System.out.println(b);
		
		
	}
}