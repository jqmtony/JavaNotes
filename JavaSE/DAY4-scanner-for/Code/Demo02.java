class Demo02{
	public static void main(String[] args){
		int num = 1;
		/*
			目的:打印1-10
			i 的作用是记录了循环了多少次
		 */
		for(int i = 1;i <= 10;i++){
			System.out.println(num);
			num = num + 1;
		}
		//-- 对上面代码做修改
		//-- 发现全程:i和num的取值一样.是否可以让i
		//-- 身兼数职:即记录循环了多少次.也充当被打印的数字
		for(int i = 1;i <= 100;i+=2){
			System.out.println(i);
			
		}
	}
}