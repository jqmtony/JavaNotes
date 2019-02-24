class Ex04{
	public static  void main(String[] args){
		//-- 1.使用随机数
		/*
			Math.random()会产生一个0到1的随机数.
			能够取到0,取不到1
			[0,1)
			一个三位数
			目标:[100,999]
			*1000 [0,1000)->[0,999]+100->[100,1099]
			1099->999 -100
			*(1000-100)
			
		 */
		int num = (int)(Math.random()*900+100);
		System.out.println("num:" + num);
		//-- 百位
		int i = num /100;
		//-- 十位
		int j = num % 100 / 10;
		//-- 个位
		int k = num % 10;
		
		System.out.println("个位:\t"+ k);
		System.out.println("十位:\t"+ j);
		System.out.println("百位:\t"+ i);
		
	}
}