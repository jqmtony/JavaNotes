package com.hwua.customer;

/**
 * 客户关系管理系统中的客户不是人.而是公司.
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
	private String customerPlace;
	private String customerManager;
	private String customerLevel;
	/**
	 * 客户满意度
	 */
	private String customerDegree;
	/**
	 * 客户信用等级
	 */
	private String customerCredit;
	private String customerAddress;
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
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPlace() {
		return customerPlace;
	}
	public void setCustomerPlace(String customerPlace) {
		this.customerPlace = customerPlace;
	}
	public String getCustomerManager() {
		return customerManager;
	}
	public void setCustomerManager(String customerManager) {
		this.customerManager = customerManager;
	}
	public String getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	public String getCustomerDegree() {
		return customerDegree;
	}
	public void setCustomerDegree(String customerDegree) {
		this.customerDegree = customerDegree;
	}
	public String getCustomerCredit() {
		return customerCredit;
	}
	public void setCustomerCredit(String customerCredit) {
		this.customerCredit = customerCredit;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getCustomerPostalcode() {
		return customerPostalcode;
	}
	public void setCustomerPostalcode(String customerPostalcode) {
		this.customerPostalcode = customerPostalcode;
	}
	public String getCustomerFax() {
		return customerFax;
	}
	public void setCustomerFax(String customerFax) {
		this.customerFax = customerFax;
	}
	public String getCustomerUrl() {
		return customerUrl;
	}
	public void setCustomerUrl(String customerUrl) {
		this.customerUrl = customerUrl;
	}
	@Override
	public String toString() {
		return "Coustomer [客户编号=" + customerID + ", 客户名称=" + customerName + ", 客户地区="
				+ customerPlace + ", 客户经理=" + customerManager + ", 客户登记=" + customerLevel
				+ ", 客户满意度=" + customerDegree + ", 客户信用度=" + customerCredit + ", 客户地址="
				+ customerAddress + ", 客户电话=" + customerTel + ", 客户邮编=" + customerPostalcode
				+ ", 客户传真=" + customerFax + ", 客户网址=" + customerUrl + "]";
	}
	
}