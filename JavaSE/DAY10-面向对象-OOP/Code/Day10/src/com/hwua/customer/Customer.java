package com.hwua.customer;

/**
 * �ͻ���ϵ����ϵͳ�еĿͻ�������.���ǹ�˾.
 * @author Administrator
 *
 */
public class Customer {
	/**
	 * �ͻ����
	 */
	private String customerID;
	/**
	 * �ͻ�����
	 */
	private String customerName;
	private String customerPlace;
	private String customerManager;
	private String customerLevel;
	/**
	 * �ͻ������
	 */
	private String customerDegree;
	/**
	 * �ͻ����õȼ�
	 */
	private String customerCredit;
	private String customerAddress;
	private String customerTel;
	/**
	 * �ͻ��ʱ�
	 */
	private String customerPostalcode;
	/**
	 * �ͻ�����
	 */
	private String customerFax;
	/**
	 * �ͻ���ַ
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
		return "Coustomer [�ͻ����=" + customerID + ", �ͻ�����=" + customerName + ", �ͻ�����="
				+ customerPlace + ", �ͻ�����=" + customerManager + ", �ͻ��Ǽ�=" + customerLevel
				+ ", �ͻ������=" + customerDegree + ", �ͻ����ö�=" + customerCredit + ", �ͻ���ַ="
				+ customerAddress + ", �ͻ��绰=" + customerTel + ", �ͻ��ʱ�=" + customerPostalcode
				+ ", �ͻ�����=" + customerFax + ", �ͻ���ַ=" + customerUrl + "]";
	}
	
}