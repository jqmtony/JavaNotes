package com.hvua.domain;

import java.util.Random;

/*
 *  	�����ͻ���
 *  	a)	��ŵ�ȡֵ:KH + ��ǰ���ڵ��º���(������λ���Ĳ���) + ��λ�����.
 */
public class Customer {
	public String customerID;
	public String companyName;
	public String region;
	public String managerName;
	public String customerLevel;
	public String customerLove; // �ͻ������
	public String customerCredit; // �ͻ����ö�
	public String address;
	public int postCode;
	public String phoneNum;
	public String faxNum;
	public String website;
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", companyName=" + companyName + ", region=" + region
				+ ", managerName=" + managerName + ", customerLevel=" + customerLevel + ", customerLove=" + customerLove
				+ ", customerCredit=" + customerCredit + ", address=" + address + ", postCode=" + postCode
				+ ", phoneNum=" + phoneNum + ", faxNum=" + faxNum + ", website=" + website + "]";
	}
	
	
	
	
}

