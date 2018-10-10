class Demo08{
	public static void main(String[] args) {
	
		//-- 声明三个int类型的变量并分别赋予初始值5,2和0
		int i = 5;
		int j = 2;
		double result = 0;
		//-- 使用算术运算符进行计算
		result = i + j;
		System.out.println("Result:"+(result));//7
		result = i - j;
		System.out.println("Result:"+(result));//3
		result = i * j;
		System.out.println("Result:"+(result));//10
		//-- int类型的两个变量进行算术运算的结果还是int
		//-- 这里不会进行四舍五入.执行的是去尾操作
		result = i / j;
		System.out.println("Result:"+(result));//2
		result = i % j;
		System.out.println("Result:"+(result));//1
	}
}