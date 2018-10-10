import java.util.Scanner;
class Ex05{
	public static void main(String[] args){
		//-- 1.导包
		//-- 2.提供Scanner
		Scanner scan = new Scanner(System.in);
		//-- 3.录入一个四位整数(条件结构的验证.保证是四位整数)
		System.out.println("请输入一个四位数");
		int num = scan.nextInt();
		System.out.println("加密前:\t" + num);
		//-- 4.加密
		//-- 4.1 求四个位上的数
		//-- 个位
		int i = num % 10;
		//-- 十位
		int j = num % 100 / 10;
		//-- 百位
		int k = num % 1000 / 100;
		//-- 千位
		int l = num / 1000;
		//-- 4.2 每个位上的数+5%10求余数
		i = (i + 5) % 10;
		j = (j + 5) % 10;
		k = (k + 5) % 10;
		l = (l + 5) % 10;
		//-- 4.3 1和4位交换
		//-- 提供中间变量
		int temp = 0;
		temp = i;
		i = l;
		l = temp;
		//-- 4.4 2和3位交换
		temp = j;
		j = k;
		k = temp;
		//-- 4.5重新构成一个四位数
		num = l * 1000 + k * 100 + j * 10 + i;
		//-- 5.输出新的四位数
		System.out.println("加密后:\t" + num);
		//-- 如果学了条件可以利用条件来判断新的数是长度是杜少不足4位补0.
		System.out.println("加密后:\t" + l + k + j + i);
		
	}
}