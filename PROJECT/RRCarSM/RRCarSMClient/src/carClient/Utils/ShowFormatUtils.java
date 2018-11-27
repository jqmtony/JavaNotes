package carClient.Utils;

public class ShowFormatUtils {
	public static void showClientMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("输入0退出");
		System.out.println("输入1+汽车编号 进入租车订单 如1+2");
		System.out.println("输入2+1 按价格降序排序 2+2 按价格升序排序");
		System.out.println("输入3+类型编号 按类型搜索");
		System.out.println("输入4+品牌编号 按品牌搜素");
		System.out.println("输入5 产看全部汽车");
		System.out.println("输入6 查看我的租车记录");
		System.out.println("输入7+汽车编号 还车");
		System.out.println("-----------------------------------------------------------------");
	}
	public static void showAdminMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("输入0退出");
		System.out.println("输入1+汽车编号 查看制定汽车");
		System.out.println("输入2+1 按价格降序排序 2+2 按价格升序排序");
		System.out.println("输入3+类型编号 按类型搜索");
		System.out.println("输入4+品牌编号 按品牌搜素");
		System.out.println("输入5 产看全部汽车");
		System.out.println("输入6 添加汽车");
		System.out.println("输入7+汽车编号 修改汽车信息");
		System.out.println("输入8 查看汽车记录");
		System.out.println("-----------------------------------------------------------------");
	}
	public static void showWelcomeInfo() {
		System.out.println("===========================");
		System.out.println("欢迎访问二嗨租车");
		System.out.println("===========================");
	}
	public static void showCarQueryHeader() {
		String line = "---------------------------------------------------------------------------------";
		System.out.println(line+line+line+"\n编号 \t 类型 \t 简介 \t 品牌 \t 车型 \t\t 市场价\t\t租赁价\t0可租1不可租 0上架1下架");
	}
	public static void showRecordQueryHeader() {
		String line = "---------------------------------------------------------------------------------";
		System.out.println(line+line+line+"\n编号 \t 名称\t 简介 \t 品牌 \t 类型 \t\t 单日租金 \t 总金额 \t 每日租金\t 开始日 \t 结束日");
	}
	public static void main(String[] args) {
		showCarQueryHeader();
	}
}
