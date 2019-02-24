import java.util.Random;
class Demo02{
	public static void main(String[] args){
		//-- 获取随机数的第一种方式Math.random() 取值[0,1)
		double num1 = Math.random();
		System.out.println("num1:\t" + num1);
		
		//-- 获取随机数的第二种方式Random
		//-- 1是种子.如果不给就默认是当前系统时间
		//-- 给种子和不给种子的区别在于每次执行产生的随机数一样和不一样.
		//-- 种子的目的是为了测试使用.保证代码可以再相同的数据下测试N遍
		//-- 1只是一个基数.作为产生随机数算法的数据源可以提供任意整数.
		Random random = new Random(1);
		
		//-- 1000 是范围即取值在[0,1000);
		int num2 = random.nextInt(1000);
		System.out.println("num2:\t" + num2);	
	}
}