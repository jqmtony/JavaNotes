class Demo04{
	public static void main(String[] args){
		
		System.out.println(1);
		/*
			可以充当条件的内容:
			1.关系运算符. 关系运算符运算的结果是一个布尔值可以作为条件
			2.布尔值常量.
			3.逻辑运算符.
			4.赋值语句.仅限布尔类型的赋值语句.
		 */
		int i = 10; 
		 
		 
		if(i >= 10){
			System.out.println("条件为真1");
		}
		
		if(true){
			System.out.println("条件为真2");
		}
		//-- 逻辑运算符的操作数本身就是布尔值.结果也是布尔值.
		if(1!=1 || 1==1){
			System.out.println("条件为真3");			
		}
		
		boolean b = false;
		if(b = true){
			System.out.println("条件为真4");			
		}
		//-- if小括号内必须是一个布尔值或者是能够产生布尔值的表达式.
		/*
		if(i = 11){
			System.out.println("条件为真5");
		}
		*/
		
		System.out.println(2);
	}
}





