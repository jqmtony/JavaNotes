package carClient.Utils;
/**
 * 提供Scanner容器并提供异常处理和输入提示语
 * @author 李文娟
 *
 */

import java.util.Scanner;

import carClient.Entity.insertCar;

public class InputUtils {
	protected static Scanner myInput;
	public InputUtils() {
		myInput = new Scanner(System.in);
		}

	/**
	 * 获取字符串
	 */
	public String myInputString() {
		String result = myInput.next();
		return result;
	}
	/**
	 * 获取整型
	 */
	public int myInputInt() {
		int result = myInput.nextInt();
		return result;
	}
	/**
	 * 获取double类型
	 */
	public static double myInputDouble() {
		double result = myInput.nextDouble();
		return result;
	}
	/**
	 * 获取用户名
	 * @return 
	 */
	public String inputUserName() {
		System.out.println("请输入用户名：");
		String name = myInput.next();
		return name;
	} 
	/**
	 * 获取用户密码
	 * @return 
	 */
	public String inputUserPwd() {
		System.out.println("请输入密码：");
		String pwd = myInput.next();
		return pwd;
	} 
	/**
	 * 添加车
	 */
	public static insertCar adminAddCar() {
		insertCar car = new insertCar();
		System.out.println("请输入车牌号：");
		car.setCar_number(myInput.next());
		System.out.println("请输入品牌id号（数字）：");
		car.setBrand_id(myInput.nextInt());
		System.out.println("请输入类型（T）：");
		car.setModel(myInput.next());
		System.out.println("请输入颜色：");
		car.setColor(myInput.next());
		System.out.println("请输入类别id号（数字）：");
		car.setCategory_id(myInput.nextInt());
		System.out.println("请输入简介：");
		car.setT_comments(myInput.next());
		System.out.println("请输入市场价格（数字）：");
		car.setPrice(myInputDouble());
		System.out.println("请输入租金（按天计算）：");
		car.setRent(myInputDouble());
		System.out.println("是否出租 0.可借 1.已借出");
		car.setStatus(myInput.nextInt());
		System.out.println("是否上架 0.上架 1.不上架");
		car.setUseable(myInput.nextInt());
	return car;
	}
	// 更新车辆信息
	public String getUpdInfo() {
		String result = null;
		System.out.println("请选择修改项：1. 租金 2.上架/下架");
		int choose = myInputInt();
		if(choose==1) {
			System.out.println("请输入修改金额：");
			double rent = myInputDouble();
			result = 1+"#"+rent;
		}else if(choose==2) {
			System.out.println("0.上架 1.下架");
			int useable = myInputInt();
			 result = 2+"#" + useable;
		}
		return result;
	}
}
