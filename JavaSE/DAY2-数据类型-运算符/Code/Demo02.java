class Demo02{
	public static void main(String[] args){
		/* 
			声明一个int类型的变量
			变量名称叫做i
			将数值10赋值给该变量
		 */
		int i = 10;
		String str = "ABC";	

		/*
			在可以访问到i的范围内(范围可以参考大括号的范围)
			只要使用i就代表i所保存的值:10
		 */
		System.out.println(i);
		/*
			这个10不是变量 .是一个恒定不变的数值
			既然它不变我们把它叫做字面常量.
			字面常量在内存中是唯一的.(有且只有一个)
		 */
		System.out.println(10);
		System.out.println(str);
		
		//-- 我们对i进行重新赋值
		i = 11;
		//-- 输出使用i
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}