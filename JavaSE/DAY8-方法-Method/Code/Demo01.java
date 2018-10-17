
public class Demo01 {
	
	public static void main(String[] args) {
	
		//-- 通过方法名称()  调用方法
		printOneToTen();
		//The method printOneToX(int) in the type 
		//Demo01 is not applicable for the arguments ()
		printOneToX(7);

	}

	//-- [] 代表可选 
	//[访问修饰符] [静态修饰符] [抽象修饰符] 返回值 方法名称(参数列表) {方法体}
	
	//-- 声明一个方法.
	public static void printOneToTen() {
		for(int i = 1 ; i <= 10 ;i ++) {
			System.out.println(i);
		}
	}
	
	public static void printOneToX(int x) {
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}
	
	
	
	
	
}
