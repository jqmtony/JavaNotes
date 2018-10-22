package com.hwua.customer;

/**
 * 客户关系管理系统中的客户不是人.而是公司.
 * 
 * @author Administrator
 *
 */
public class Customer {
	/**
	 * 客户编号
	 */
	private String customerID;
	/**
	 * 客户姓名
	 */
	private String customerName;
	/**
	 * 客户地区
	 */
	private String customerPlace;
	/**
	 * 客户经理 对应的应该是联系人
	 */
	private String customerManager;
	/**
	 * 客户等级
	 */
	private String customerLevel;
	/**
	 * 客户满意度
	 */
	private String customerDegree;
	/**
	 * 客户信用等级
	 */
	private String customerCredit;
	/**
	 * 客户地址
	 */
	private String customerAddress;
	/**
	 * 客户电话
	 */
	private String customerTel;
	/**
	 * 客户邮编
	 */
	private String customerPostalcode;
	/**
	 * 客户传真
	 */
	private String customerFax;
	/**
	 * 客户网址
	 */
	private String customerUrl;

	/**
	 * 我们创建了一个有参构造 目的:希望在构造对象时,外面传入一个姓名赋值给成员变量customerName
	 */
	public Customer(String customerName) {
		// -- 给customerName进行赋值.
		// The assignment to variable customerName has no effect
		this.customerName = customerName;
	}

	/**
	 * 我们创建一个无参构造
	 */
	public Customer() {
		this.customerID = CustomerIDTools.createCustomerID();
	}

	public Customer(String customerName, String customerPlace, String customerManager, String customerLevel,
			String customerDegree, String customerCredit, String customerAddress, String customerTel,
			String customerPostalcode, String customerFax, String customerUrl) {
		this.customerID = CustomerIDTools.createCustomerID();
		this.customerName = customerName;
		this.customerPlace = customerPlace;
		this.customerManager = customerManager;
		this.customerLevel = customerLevel;
		this.customerDegree = customerDegree;
		this.customerCredit = customerCredit;
		this.customerAddress = customerAddress;
		this.customerTel = customerTel;
		this.customerPostalcode = customerPostalcode;
		this.customerFax = customerFax;
		this.customerUrl = customerUrl;
	}

	@Override
	public String toString() {
		return "Coustomer [客户编号=" + customerID + ", 客户名称=" + customerName + ", 客户地区=" + customerPlace + ", 客户经理="
				+ customerManager + ", 客户登记=" + customerLevel + ", 客户满意度=" + customerDegree + ", 客户信用度="
				+ customerCredit + ", 客户地址=" + customerAddress + ", 客户电话=" + customerTel + ", 客户邮编="
				+ customerPostalcode + ", 客户传真=" + customerFax + ", 客户网址=" + customerUrl + "]";
	}

}