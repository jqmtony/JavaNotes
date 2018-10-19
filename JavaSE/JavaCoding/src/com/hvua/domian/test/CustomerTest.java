package com.hvua.domian.test;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import com.hvua.domain.Customer;

/*
 * 	2.	提供一个数组,数组中的元素类型是客户类型..
	a)	向数组中插入10条客户信息
	b)	遍历整个数组中所有客户的信息.
 */

public class CustomerTest {
	public static void main(String[] args) {
		// 1.创建3个客户系列，引用Customer类
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		// 2. 为客户系列赋值
		c1.customerID = creatCustomerID();
		c1.companyName = "姓名1";
		c1.region = "上海";
		c1.managerName="李明";
		c1.customerLevel = "☆☆☆";
		c1.customerLove = "❤";
		c1.customerCredit = "☆☆☆";
		c1.address = "上海市长宁区";
		c1.postCode = 201845;
		c1.phoneNum = "021-61557874";
		c1.faxNum = "021-11231233";
		c1.website = "www.baidu.com";
		
		c2.customerID = creatCustomerID();
		c2.companyName = "姓名2";
		c2.region = "北京";
		c2.managerName="李明";
		c2.customerLevel = "☆☆";
		c2.customerLove = "❤❤";
		c2.customerCredit = "☆☆☆☆";
		c2.address = "上海市静安区";
		c2.postCode = 201921;
		c2.phoneNum = "021-61557874";
		c2.faxNum = "021-11231233";
		c2.website = "www.baidu.com";
		
		c3.customerID = creatCustomerID();
		c3.companyName = "姓名3";
		c3.region = "杭州";
		c3.managerName="李明";
		c3.customerLevel = "☆";
		c3.customerLove = "❤❤❤";
		c3.customerCredit = "☆☆";
		c3.address = "上海市普陀区";
		c3.postCode = 21249;
		c3.phoneNum = "021-61557874";
		c3.faxNum = "021-11231233";
		c3.website = "www.baidu.com";
		
		c4.customerID = creatCustomerID();
		c4.companyName = "输出插入";
		c4.region = "杭州";
		c4.managerName="李明";
		c4.customerLevel = "☆";
		c4.customerLove = "❤❤❤";
		c4.customerCredit = "☆☆";
		c4.address = "上海市普陀区";
		c4.postCode = 21249;
		c4.phoneNum = "021-61557874";
		c4.faxNum = "021-11231233";
		c4.website = "www.baidu.com";
		
		// 3.插入数组
		// 3.1 创建Customer类数组
		Customer[] array = new Customer[10];  // 输入10个客户的序列
//		System.out.println(Arrays.toString(array));
		
		// 3.2 赋值数组
		array[0] = c1;
		array[1] = c2;
		array[2] = c3;
		
		// 4.输出数组元素
		for(Customer cu: array) {
			System.out.println(cu);
		}
//		System.out.println("where is it");
	}
	
	
	// 创建客户编码生成方法
	private static String creatCustomerID() {
		Random random = new Random();
		int date = 201810;
		// TODO Java提供了Calendar类来代表日历，一般获取时间通过它
		int last4d = random.nextInt(9000)+1000; // 随机生成4位数
		String customerID = "KH"+date+last4d;
		return customerID; 
	}


		
}
