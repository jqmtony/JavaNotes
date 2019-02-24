package com.hwua.customer;

import java.util.Calendar;
import java.util.Random;

/**
 * ר���������ɿͻ�ID�Ĺ�����
 * @author Administrator
 *
 */
public class CustomerIDTools {
	/**
	 * �����ͻ���� KH + ���� + ��λ����� UUID�ȷ�ʽ��ʵ��.
	 * 
	 * @return
	 */
	public static String createCustomerID() {
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
