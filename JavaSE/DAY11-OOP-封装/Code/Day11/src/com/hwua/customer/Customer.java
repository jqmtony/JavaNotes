package com.hwua.customer;

/**
 * �ͻ���ϵ����ϵͳ�еĿͻ�������.���ǹ�˾.
 * 
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
	/**
	 * �ͻ�����
	 */
	private String customerPlace;
	/**
	 * �ͻ����� ��Ӧ��Ӧ������ϵ��
	 */
	private String customerManager;
	/**
	 * �ͻ��ȼ�
	 */
	private String customerLevel;
	/**
	 * �ͻ������
	 */
	private String customerDegree;
	/**
	 * �ͻ����õȼ�
	 */
	private String customerCredit;
	/**
	 * �ͻ���ַ
	 */
	private String customerAddress;
	/**
	 * �ͻ��绰
	 */
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

	/**
	 * ���Ǵ�����һ���вι��� Ŀ��:ϣ���ڹ������ʱ,���洫��һ��������ֵ����Ա����customerName
	 */
	public Customer(String customerName) {
		// -- ��customerName���и�ֵ.
		// The assignment to variable customerName has no effect
		this.customerName = customerName;
	}

	/**
	 * ���Ǵ���һ���޲ι���
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
		return "Coustomer [�ͻ����=" + customerID + ", �ͻ�����=" + customerName + ", �ͻ�����=" + customerPlace + ", �ͻ�����="
				+ customerManager + ", �ͻ��Ǽ�=" + customerLevel + ", �ͻ������=" + customerDegree + ", �ͻ����ö�="
				+ customerCredit + ", �ͻ���ַ=" + customerAddress + ", �ͻ��绰=" + customerTel + ", �ͻ��ʱ�="
				+ customerPostalcode + ", �ͻ�����=" + customerFax + ", �ͻ���ַ=" + customerUrl + "]";
	}

}