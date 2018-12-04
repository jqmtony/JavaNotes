class Demo10 {
	public static void main(String[] args){
		/*
		逻辑运算符示例
		 */
		boolean b1 = true;
		boolean b2 = false;
		
		boolean result = true;
		//-- 同为真时为真,有一个是假就是假 
		result = b1 &&  b2;
		System.out.println("result:" + result);//false
		//-- 同为假时为假,有一个位真就是真
		result = b1 ||  b2;
		System.out.println("result:" + result);//true
		//-- 真的取反就是假
		result = !b1;
		System.out.println("result:" + result);//false
		//-- 假的取反就是真
		result = !b2;
		System.out.println("result:" + result);//true
		
		//-- 一次性声明多个同类型的变量
		int i = 3,j = 4;
		//-- i>j使用关系运算符构成一个表达式.
		//-- 该表达式的运算结果是布尔类型
		//-- 涉及关系和逻辑两种运算.
		//-- 先执行关系得到布尔值.再执行逻辑
		//--     false && true
		result = i>j && i<j ;
		System.out.println("result:" + result);//false
		result = i>j || i<j ;
		System.out.println("result:" + result);//true
		result = !(i>j);
		System.out.println("result:" + result);//true
		
		
		
		
		
		
		
		
		
	}
}