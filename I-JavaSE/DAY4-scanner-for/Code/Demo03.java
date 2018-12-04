class Demo03{
	
	public static void main(String[] args){
		//1.	求1+4+7+10……+100之和。
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i += 3){
			sum = sum + i;
		}
		System.out.println("Sum:\t" + sum);
		
		System.out.println("---------------");
		
		//2.	打印输出10~100之间所有能同时被5和9整除的整数
		for(int i = 10 ;i <= 100 ; i ++){
			//-- 添加if条件
			if(i % 5 == 0 && i % 9 == 0){
				System.out.println(i);
			}
		}
		
		System.out.println("---------------");

		//3.	有数列：9，99，999，9999...，编程计算前10项的值。
		long temp = 9;
		for(int i = 1; i <= 10 ; i++){
			/*
				如果使用int来保存数据.最大保存到9个9.
			 */
			System.out.println(temp);
			temp = temp * 10 + 9;
		}

		System.out.println("---------------");

		//4.	求1到100之间的奇数之和与偶数之和。
		int sum1 = 0 , sum2 = 0;
		//-- sum1  奇数 sum2 代表偶数
		for(int i = 1 ; i <= 100 ; i++){
			if(i % 2 == 0){
				sum2 += i;
			}else{
				sum1 += i;
			}
		}
		System.out.println("奇数和:\t" + sum1);
		System.out.println("偶数和:\t" + sum2);
		
		//5.	用循环程序求10的阶乘 (就是从1乘到10)
		//-- 阶乘是从1乘到这个数本身.使用!来表示 1!就是1的阶乘
		System.out.println("---------------");
		int product = 1 ;
		for(int i = 1 ; i <= 10 ; i++){
			product *= i;
		}
		System.out.println("10!:\t" + product);
		
		System.out.println("---------------");
		
		//6.	循环求1！+2！+3！+...+6!+7!
		//-- 重新对两个变量进行初始化
		sum = 0;
		product = 1;
		for(int i = 1 ; i <= 7 ;i ++){
			//-- 求阶乘
			product*=i;
			//-- 求和
			sum += product;
		}
		
		System.out.println("sum:\t" + sum);
		
		//7. 	求1*3*5*...*19之积
		product = 1;
		for(int i = 1 ; i <= 19 ; i += 2){
			product *= i;
		}
		System.out.println("product:\t" + product);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}