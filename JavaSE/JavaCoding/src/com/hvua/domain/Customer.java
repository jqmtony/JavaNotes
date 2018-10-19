package com.hvua.domain;

import java.util.Random;

/*
 *  	创建客户类
 *  	a)	编号的取值:KH + 当前日期的月和日(不足两位数的补零) + 四位随机数.
 */
public class Customer {
	public String customerID = customerID();
	// 调用客户编码生成器
	public String companyName;
	public String region;
	public String managerName;
	public String customerLevel;
	public String customerLove; // 客户满意度
	public String customerCredit; // 客户信用度
	public String address;
	public String postCode;
	int phoneNum;
	int faxNum;
	String website;
	

	
	
}

