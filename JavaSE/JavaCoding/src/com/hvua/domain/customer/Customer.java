package com.hvua.domain.customer;

/** 
 * 	客户关系管理系统中的客户不是人，而是公司。
 * 
 * @author Administrator
 */
public class Customer {
	/**
	 * 	客户编号
	 */
	private String customerID;
	/**
	 * 	客户姓名
	 */
	private String customerName;
	/**
	 * 	客户地区
	 */
	private String CustomerPlace;
	/**
	 * 	客户经理 对应的应该是联系人
	 */
	private String customerManager;
	/**
	 * 	客户等级
	 */
	public int customerLevel;
	/**
	 *  客户满意度
	 */
	private String customerDegree;
	/** 
	 * 客户信用等级
	 */
	private String customerCredit;
	/**
	 * 	客户地址
	 */
	private String customerAddress;
	/**
	 * 	客户电话
	 */
	private String customerTel;
	/**
	 *  客户邮编
	 */
	private String customerPostalcode;
	/**
	 * 	客户传真
	 */
	private String customerFax;
	/**
	 * 	客户网址
	 */
	private String customerUrl;
	
	public int getCustomerLevel() {
		return customerLevel;
	}
	/**
	 * 通过赋值参数添加Customer对象
	 * @param customerID
	 * @param customerName
	 * @param customerPlace
	 * @param customerManager
	 * @param customerLevel
	 * @param customerDegree
	 * @param customerCredit
	 * @param customerAddress
	 * @param customerTel
	 * @param customerPostalcode
	 * @param customerFax
	 * @param customerUrl
	 */
	public Customer(String customerID, String customerName, String customerPlace, String customerManager,
			int customerLevel, String customerDegree, String customerCredit, String customerAddress,
			String customerTel, String customerPostalcode, String customerFax, String customerUrl) {
		super();
		this.customerID = CustomerTool.creatCustomerID(); // 赋值ID以随机生成的customerID
		this.customerName = customerName;
		this.CustomerPlace = customerPlace;
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

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", CustomerPlace="
				+ CustomerPlace + ", customerManager=" + customerManager + ", customerLevel=" + customerLevel
				+ ", customerDegree=" + customerDegree + ", customerCredit=" + customerCredit + ", customerAddress="
				+ customerAddress + ", customerTel=" + customerTel + ", customerPostalcode=" + customerPostalcode
				+ ", customerFax=" + customerFax + ", customerUrl=" + customerUrl + "]";
	}
	
	
}