package com.hwua.demo01;

public class Demo02 {
	public static void main(String[] args) {
		
		//-- 求水仙花数时曾经用过的方法. 自幂数
		//-- 自幂数是指一个 n 位数，它的每个位上的数字的 n 次幂之和等于它本身
		//-- N = 1 时叫做独身数 0-9
		//-- N = 2 时没有
		//-- N = 3 时水仙花
		//水仙花数、四叶玫瑰数、五角星数、六合数、北斗七星数、八仙数、九九重阳数、十全十美数
		//-- 1.表达所有的三位数  个位 十位 百位
		for (int i = 100 ; i < 1000 ; i++) {
			//-- 123
			//-- 个位
			int j = i % 10;
			//-- 十位
			int k = i / 10  %10;
			//-- 两种写法都可以
			//int k1 = i % 100 / 10;
			//-- 百位
			int l = i / 100;
			int temp = (int)(Math.pow(j, 3) + Math.pow(k, 3) + Math.pow(l, 3));
			if (temp == i) {
				System.out.println(i);
			}
		}
	}

}
