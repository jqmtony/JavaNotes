class Demo05{
	//目标:求10以内所有偶数的阶乘和
	
	public static void main(String[] args){
		//-- 1.先提供一个环境:提供1-10以内的数
		//-- 提供1.提供2.提供3 一直到 提供10
		//-- 一直在做重复的事情.就要考虑使用循环来减少工作量
		int i = 1;
		int producet = 1;
		int sum = 0;
		for(; i <= 10 ; i++){
			//-- 求阶乘
			producet *= i;
			System.out.println(i+"!:\t" + producet);
			//-- 添加判断条件:能够被2整除求偶数
			if(i % 2 == 0){

				//-- 求和
				sum += producet;
			}
		}
		System.out.println("1-10所有偶数的阶乘和:\t" + sum);
		
	}
}