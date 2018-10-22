package com.hvua.domain.customer;

import java.util.Calendar;
import java.util.Random;

public class CustomerTool {

	// �����ͻ��������ɷ���
	public static String creatCustomerID() {
		// ��ȡʱ�䣬��ʽ��201802
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		// ��λ�����
		Random random = new Random();
		int last4d = random.nextInt(9000) + 1000; // �������4λ��
		String custID = "KH";
		// ��ȡ��
		if(month<10) {
			custID = custID + "0"+month;
		}else {
			custID = custID + month;
		}
		// ��ȡ��
		if(day<10) {
			custID=custID+"0"+day;
		}else {
			custID = custID+day;
		}
		// ����ID
		custID=custID+last4d;
		return custID;
	}
}
