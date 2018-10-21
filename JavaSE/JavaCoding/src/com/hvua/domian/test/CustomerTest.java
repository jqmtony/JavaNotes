package com.hvua.domian.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.hvua.domain.Customer;

/*
 * 	2.	提供一个数组,数组中的元素类型是客户类型..
	a)	向数组中插入10条客户信息
	b)	遍历整个数组中所有客户的信息.
 */

public class CustomerTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CustomerTest test = new CustomerTest();

		// 1.创建3个客户系列，引用Customer类
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();

		// 2. 为客户系列赋值
		c1.customerID = creatCustomerID();
		c1.companyName = "全家便利店1";
		c1.region = "上海";
		c1.managerName = "李明";
		c1.customerLevel = 3;
		c1.customerLove = "❤";
		c1.customerCredit = "☆☆☆";
		c1.address = "上海市长宁区";
		c1.postCode = 201845;
		c1.phoneNum = "021-61557874";
		c1.faxNum = "021-11231233";
		c1.website = "www.baidu.com";

		c2.customerID = creatCustomerID();
		c2.companyName = "全家便利店2";
		c2.region = "北京";
		c2.managerName = "李明";
		c2.customerLevel = 2;
		c2.customerLove = "❤❤";
		c2.customerCredit = "☆☆☆☆";
		c2.address = "上海市静安区";
		c2.postCode = 201921;
		c2.phoneNum = "021-61557874";
		c2.faxNum = "021-11231233";
		c2.website = "www.baidu.com";

		c3.customerID = creatCustomerID();
		c3.companyName = "全家便利店3";
		c3.region = "杭州";
		c3.managerName = "李明";
		c3.customerLevel = 4;
		c3.customerLove = "❤❤❤";
		c3.customerCredit = "☆☆";
		c3.address = "上海市普陀区";
		c3.postCode = 21249;
		c3.phoneNum = "021-61557874";
		c3.faxNum = "021-11231233";
		c3.website = "www.baidu.com";

		c4.customerID = creatCustomerID();
		c4.companyName = "全家便利店4";
		c4.region = "杭州";
		c4.managerName = "李明";
		c4.customerLevel = 1;
		c4.customerLove = "❤❤❤";
		c4.customerCredit = "☆☆";
		c4.address = "上海市普陀区";
		c4.postCode = 21249;
		c4.phoneNum = "021-61557874";
		c4.faxNum = "021-11231233";
		c4.website = "www.baidu.com";

		Customer c5 = new Customer();
		c5.customerID = creatCustomerID();
		c5.companyName = "全家便利店";
		c5.region = "杭州";
		c5.managerName = "李明";
		c5.customerLevel = 5;
		c5.customerLove = "❤❤";
		c5.customerCredit = "☆☆";
		c5.address = "上海市普陀区";
		c5.postCode = 21249;
		c5.phoneNum = "021-61557874";
		c5.faxNum = "021-11231233";
		c5.website = "www.baidu.com";

		// 3.插入数组
		// 3.1 创建Customer类数组
		Customer[] array = new Customer[6]; // 输入10个客户的序列
		// System.out.println(Arrays.toString(array));

		// 3.2 赋值数组
		array[0] = c1;
		array[1] = c2;
		array[2] = c3;
		array[3] = c4;
		array[4] = c5;

		// 5.通过控制台对数组进行增删改查
		System.out.println("请选择操作类型：");
		System.out.println("0.预览数组元素");
		System.out.println("1.顺序插入一个客户");
		System.out.println("2.指定位置插入一个客户");
		System.out.println("3.制定位置删除一个客户");
		System.out.println("4.按照客户等级降序排列");
		System.out.println("5.按照客户信用度降序排列");
		System.out.println("6.汇总不同区域客户数量");
		int operate = scan.nextInt();
		switch (operate) {
		case 0:
			// 4.输出数组元素
			for (Customer cu : array) {
				System.out.println(cu);
			}
			break;
		case 1:
			Customer add1 = new Customer();
			System.out.print("输入customerID：");
			add1.customerID = scan.next();
			System.out.print("输入companyName：");
			add1.companyName = scan.next();
			System.out.print("输入region：");
			add1.region = scan.next();
			System.out.print("输入managerName：");
			add1.managerName = scan.next();
			System.out.print("输入customerLevel：");
			add1.customerLevel = scan.nextInt();
			System.out.print("输入customerLove：");
			add1.customerLove = scan.next();
			System.out.print("输入customerCredit：");
			add1.customerCredit = scan.next();
			System.out.print("输入adress：");
			add1.address = scan.next();
			System.out.print("输入postCode：");
			add1.postCode = scan.nextInt();
			System.out.print("输入phoneNum：");
			add1.phoneNum = scan.next();
			System.out.print("输入faxNum：");
			add1.faxNum = scan.next();
			System.out.print("输入website：");
			add1.website = scan.next();
			// 顺序插入
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = add1;
			for (Customer cu : array) {
				System.out.println(cu);
			}
			break;
		case 2:
			// 功能2：指定位置插入
			Customer addi = new Customer();
			System.out.print("输入customerID：");
			addi.customerID = scan.next();
			System.out.print("输入companyName：");
			addi.companyName = scan.next();
			System.out.print("输入region：");
			addi.region = scan.next();
			System.out.print("输入managerName：");
			addi.managerName = scan.next();
			System.out.print("输入customerLevel：");
			addi.customerLevel = scan.nextInt();
			System.out.print("输入customerLove：");
			addi.customerLove = scan.next();
			System.out.print("输入customerCredit：");
			addi.customerCredit = scan.next();
			System.out.print("输入adress：");
			addi.address = scan.next();
			System.out.print("输入postCode：");
			addi.postCode = scan.nextInt();
			System.out.print("输入phoneNum：");
			addi.phoneNum = scan.next();
			System.out.print("输入faxNum：");
			addi.faxNum = scan.next();
			System.out.print("输入website：");
			addi.website = scan.next();
			// 指定位置插入
			array = Arrays.copyOf(array, array.length + 1);
			System.out.println("请输入插入的下标位置：");
			int posAdd = scan.nextInt();
			for (int i = array.length - 2; i > posAdd; i--) { // 从倒数第二位开始往后
				array[i] = array[i - 1]; // 后面一位等于前面一位
			}
			array[posAdd] = addi;
			for (Customer cu : array) {
				System.out.println(cu);
			}
			break;
		case 3:
			// 功能3：指定位置删除
			System.out.println("当前数组如下：");
			int index = 0;
			for (Customer cu : array) {
				System.out.println("序号：" + (index++) + "，数组元素：" + cu);
			}
			System.out.println("请输入要删除的数组序号：");
			int posDel = scan.nextInt();
			for (int i = posDel; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			for (Customer cu : array) {
				System.out.println(cu);
			}
			break;
		case 4: // TODO Exception in thread "main"
			// 功能4：按照客户等级降序排列
			// for(Customer cu: array) {
			// System.out.println(cu.customerLevel);
			// }
			Customer temp = new Customer();
			for (int i = 0; i < array.length; i++) {
				// System.out.println("数组元素.customerLevel的长度"+array[i].customerLevel);
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j].customerLevel < array[j + 1].customerLevel) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			break;
		case 5: // TODO Exception in thread "main"
			// 功能5：按照客户信用度降序排列
			Customer temp3 = new Customer();
			for (int i = 0; i < array.length; i++) {
				// System.out.println("数组元素.customerLevel的长度"+array[i].customerLevel);
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j].customerCredit.length() > array[j + 1].customerCredit.length()) {
						temp3 = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp3;
					}
				}
			}
			break;
		case 6: // TODO Exception in thread "main"
			// 功能6：汇总不同区域客户数量
			int p1 = 0;
			int p2 = 0;
			int p3 = 0;
			int p4 = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].region.equals("北京")) {
					p1++;
				} else if (array[i].region.equals("杭州")) {
					p2++;
				} else if (array[i].region.equals("上海")) {
					p3++;
				} else {
					p4++;
				}
			}
			break;
		default:
			break;
		}

	}

	// 创建客户编码生成方法
	public static String creatCustomerID() {
		Random random = new Random();
		int date = 201810;
		// TODO Java提供了Calendar类来代表日历，一般获取时间通过它
		int last4d = random.nextInt(9000) + 1000; // 随机生成4位数
		String customerID = "KH" + date + last4d;
		return customerID;
	}

}
