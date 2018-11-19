package carClient.Utils;

public class ShowFormatUtils {
	public static void showClientMenu() {
		System.out.println("输入0退出");
		System.out.println("输入1+汽车编号 进入租车订单 如1+2");
		System.out.println("输入2+1 按价格降序排序 2+2 按价格升序排序");
		System.out.println("输入3+类型编号 按类型搜索");
		System.out.println("输入4+品牌编号 按品牌搜素");
		System.out.println("输入5 产看全部汽车");
		System.out.println("输入6 查看我的租车记录");
		System.out.println("输入7+汽车编号+换车");
	}
	public static void showWelcomeInfo() {
		System.out.println("===================");
		System.out.println("欢迎访问二嗨租车");
		System.out.println("===================");
	}
}
