package com.hwua.customer;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class CustomerTest {
	public static void main(String[] args) {
		CustomerTest ct = new CustomerTest();

		Customer c1 = new Customer();
		c1.setCustomerID(ct.createCustomerID());
		c1.setCustomerName("����");
		
		Customer c2 = new Customer();
		c2.setCustomerID(ct.createCustomerID());
		c2.setCustomerName("����");
		
		Customer c3 = new Customer();
		c3.setCustomerID(ct.createCustomerID());
		c3.setCustomerName("����");
		
		Customer c4 = new Customer();
		c4.setCustomerID(ct.createCustomerID());
		c4.setCustomerName("����");
		
		Customer[] array = new Customer[10];
		//-- �������͵�Ĭ��ֵ����null
		System.out.println(Arrays.toString(array));
		
		array[0] = c1;
		array[1] = c2;
		array[2] = c3;
		array[3] = c4;
		
		//-- �������е�Ԫ�ؽ��б���
		for (Customer cu : array) {
			System.out.println(cu);
		}

	}

	/**
	 * �����ͻ���� KH + ���� + ��λ����� UUID�ȷ�ʽ��ʵ��.
	 * 
	 * @return
	 */
	public String createCustomerID() {
		// -- Java�ṩ��Calendar������������.һ���ȡʱ�䶼ͨ����
		Calendar cal = Calendar.getInstance();

		// -- ��ȡ�� ȡֵ0-11
		int month = cal.get(Calendar.MONTH) + 1;
		// -- ��ȡ��
		int day = cal.get(Calendar.DAY_OF_MONTH);

		// -- ��ȡ��λ�����
		Random random = new Random();
		int ran = random.nextInt(9000) + 1000;

		String custID = "KH";
		
		if (month < 10) {
			custID = custID + "0" + month;
		} else {
			custID = custID + month;
		}
		
		if (day < 10) {
			custID = custID + "0" + day;
		} else {
			custID = custID + day;
		}

		custID = custID + ran;

		return custID;

	}
}
