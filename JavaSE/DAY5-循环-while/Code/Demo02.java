class Demo02{
	public static void main(String[] args){
		//--While
		
		//-- 目标:打印1-10.
		int i = 1;
		//-- 条件.是一个布尔值或者是所有能够产生布尔值的表达式.
		while(i <= 10){
			//-- 要重复执行的内容
			System.out.println(i);
			i ++;
		}
		
		System.out.println("******************");
		
		//-- 目标: 打印10-1
		i = 10;
		while(i>0){
			System.out.println(i);
			i -- ;
		}
		
		System.out.println("******************");
		System.out.println("i:\t" + i);
		//-- 目标: 还是打印1-10
		i = 1;
		while(true){
			System.out.println(i);
			i ++ ;
			if(i == 11){
				break;
			}
		}		
	}
}