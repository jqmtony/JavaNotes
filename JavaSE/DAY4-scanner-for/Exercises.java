/* 课堂练习1，求1+4+7+10...+100之和 */

class test1 {
	public static void main(String[] args) {
		int sum = 0;
		// 计算和
		for(int i=1;i<=100;i+=3) {	
			sum += i;
		}
		// 输出和，答案是1717
		System.out.println(sum);
	}
}

/* 课堂练习2，使用for打印出10~100之间所有能同时被5和9整除的整数 */

class test2 {
	public static void main(String[] args) {
		for(int i=10; i<=100; i++) {
			// 可以被5和9整除，就是可以被45整除，直接写i%45=0即可
			if(i%45==0) {
				System.out.println(i);
			}
		}
	}
}

/* 
	课堂练习3，有数列：9,99,999……，编程计算前10项的值
	i = 9,9*10+9=99, 99*10+9=999,999*10+9=9999...
 */

class test3 {
	public static void main(String[] args) {
		long num = 9;
		for(int i=0; i<10; i++) {
			System.out.println(num);
			// 用这个算法，第10项是1410065407
			// 说明超出存储范围，所以需要用long类型，不能用int类型
			// int类型最大保存到9个9
			num = num * 10 + 9;
		}
	
	}
}

/* 1-100之间的奇数之和和偶数之和 */

class test4 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		// 循环
		for(int i=1; i<100; i++) {
			if(i%2==0) {
				num1 += i;
			}else{
				num2 += i;
			}
			// 输出
		}
		System.out.println("奇数之和："+num2);
		System.out.println("偶数之和："+num1);
	}
}

/* 用循环程序求10的阶乘 */

class test5 {
	public static void main(String[] args) {
		int times = 1;
		for(int i=1; i<=10; i++) {
			// 10的阶乘：1*2*3……*10
			times *= i;
		}
		System.out.println("10的阶乘为："+times);
	}
}

/* 
	求1!+2!+...+7!，求和
	分析 1 + 1*2 + 1*2*3 + 1*2*3*4 .... 1*....*7 
	第一次求值，1
	第二次求值，1+1*2
	第三次求值，1+1*2+1*2*3
	...
	第七次求值，1+1*2+1*2*3....1*2*3~*7
 */

class test6 {
	public static void main(String[] args) {
		int times = 1;
		int sum = 0;
		for(int i=1; i<8; i++) {
			times = times * i; // 最后一项是这个
			sum = sum + times; 
			System.out.println("1!+2!+...+7!为："+sum);
		}
		System.out.println("1~7的阶乘和为："+sum);
	}
}

/* 
	求1*3*5*……*19，也就是求奇数的乘积
 */

class test7 {
	public static void main(String[] args) {
		int times = 1;
		for(int i=1; i<20; i+=2) {
			times *= i;
			System.out.println("1*3*5*……*19为："+times);
		}
		// 输出，：654729075
	}
}


/* 给定一个正整数n，求1+2+3...+n之和并输出 */

class test8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<10; i++) {
			sum += i;
			System.out.println("i："+i);
			System.out.println("和："+sum);
		}
		System.out.println("假设n为10，1+2+3...+n之和为："+sum);
	}
}

/* 
	求 1-1/3+1/5-1/7.....-1/99+1/101
	首先要是奇数，并且n*i-3
	-3,5,-7,9,-11....-99,101
	公式是：1/(2i-1) * (-1)的i-1次方
	有分数，所以一定是用double，不然取值都是0
 */

class test9 {
	public static void main(String[] args) {
		double sum = 0.0d;
		double base1 = 0.0d;
		double base2 = -1.0d;
		for(double i=1; i<102; i+=2) {
			base1 = 1/i;
			base2 = base2 * -1;
			sum = sum + base1 * base2;
			System.out.println(sum); // 输出：0.7902
		}
	}
}

/* 优化后 */

class test9_2 {
	public static void main(String[] args) {
		double sum = 0;
		int num = 1;
		for(double i=1; i<102; i+=2) {
			sum = sum + (double)1/i*num;
			num = num * -1;
		}
		System.out.println(sum);
	}
}

/* 
	10.	求得斐波那契数列前20项的值并输出。 
	从第3项开始,每一项都等于前两项之和
	n1,n2,n3（n1+n2）,n4(n2+n3),n5(n3+n4).....n20(n18+n19)
*/

class test10 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		for(int i=0; i<20; i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			// 输出1711
			System.out.println("n3:"+n3);
		}
	}
}

/* 
	11.	求出所有的水仙花数
	（各位数字立方之和等于数本身的三位整数）并输出。
	x*x*x+y*y*y+z*z*z=xyz
*/
class test11 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		for(int i=99; i<190; i++) {
			a = i/100;
			b = i/10%10;
			c = i%10;
			sum = a*a*a+b*b*b+c*c*c;
			if(sum==i) {
				// 输出153是水仙花数
				System.out.println(i+"是水仙花数！");
			}else{
				System.out.println(i+"不是");
			}
			// System.out.println(i);
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			// System.out.println(sum);
			System.out.println("----------------");
		}
	}
}































