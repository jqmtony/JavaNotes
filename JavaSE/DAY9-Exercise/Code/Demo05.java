//题目： 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
//      小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
//      问每个月的兔子总数为多少？
public class Demo05 {

	public static void main(String[] args) {
		//-- 限定两年内
		System.out.println("第一个月兔子对数:\t" + 1);
		System.out.println("第二个月兔子对数:\t" + 1);
		
		int numX = 0, num1 = 1, num2 = 1 , month = 24;
		for (int i = 3; i <= month; i++) {
			numX = num2;
			num2 = num1 + num2;
			num1 = numX;
			System.out.println("第" + i + "个月兔子对数:\t" + num2);
		}
	}
	
}
