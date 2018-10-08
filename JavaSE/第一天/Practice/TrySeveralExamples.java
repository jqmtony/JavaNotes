public class TrySeveralExamples {
	public static void main(String[] args) {
	System.out.println("----------------------------------");
	System.out.println("尝试写法1：把class左边的public去掉可以吗");
	System.out.println("结果：去掉public仍然可以编译、运行");
	System.out.println("----------------------------------");
	System.out.println("尝试写法2：文件的名称一定要和class的名称一致吗");
	System.out.println("结果：文件名和class名不一致，无法完成编译");
	System.out.println("----------------------------------");
	System.out.println("尝试写法3：一个源文件中可以有多少个class");
	System.out.println("结果：如果都定为public class，编译出错，如果后续只定义为class则可以单独运行");
	System.out.println("----------------------------------");
	System.out.println("尝试写法4：输出语句:System.out.println()和System.out.print()的区别");
	System.out.print("----这一行用的是：System.out.print()----");
	System.out.println("结果：print是直接接下一句，println，输出后换行");
	System.out.println("----------------------------------");
	System.out.println("尝试写法5：输出一个数字");
	System.out.println("结果："+1234);
	System.out.println("----------------------------------");
	System.out.println("尝试写法6：在输出语句中是否可以做加法运算");
	System.out.println("结果：1234+1234="+(1234+1234));
	}
}

 class class2{
	public static void main(String[] args) {
	System.out.println("----------------------------------");
	System.out.println("class 2");
	System.out.println("尝试写法3：一个源文件中可以有多少个class");
	}
}

 class class3{
	public static void main(String[] args) {
	System.out.println("----------------------------------");
	System.out.println("class 3");
	System.out.println("尝试写法3：一个源文件中可以有多少个class");
	}
}