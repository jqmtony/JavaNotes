class Demo04{
	public static void main(String[] args){
		//-- 1！+2！+3！+...+6!+7! 求阶乘和
		//-- 拆分一:求1-7的和
		int sum = 0;
		for(int i = 1 ; i <= 7 ; i ++){
			sum = sum + i;
		}
		
		//-- 拆分二:求1-7每个数的阶乘
		//-- 阶乘: 从1开始乘到该数本身.
		/*
			1! = 1*1
			2! = 1*2 = 2*1!
			3! = 1*2*3 = 3*2!
			7! = 1*2*3*4*5*6*7
			n! = N*(n-1)!
		 */
		int product = 1;
		for(int i = 1;i <= 7 ;i ++){
			//-- 求得的就是1!
			product = product * i;
		}
		
		//-- 汇总
		//-- 因为上面有循环已经使用过了连个变量.
		//-- 所以这里需要重新赋值.
		sum = 0;
		product = 1;
		for(int i = 1 ;i <= 7 ;i ++){
			product = product * i;
			sum = sum + product;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}