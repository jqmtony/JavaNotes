/* 给定一个x的值，求y的值并输出,三种情况 */
import java.util.Random;

class VariableF {
	public static void main(String[] args){
		// 随意给定一个x的值
		double x = Math.random()*10 - 5;
		System.out.println("给定的x的值为："+x);
		// 定义y
		int y = 0;
		if(x>0) {
			y = 1;
		}else if(x==0) {
			y = 0;
		}else {
			y = -1;
		}
		// 输出
		System.out.println("y的值为："+y);
		}
}