package com.hvua.domian.test;
import java.util.Calendar;
import java.util.Random;
import com.hvua.domain.Customer;

/*
 * 	2.	�ṩһ������,�����е�Ԫ�������ǿͻ�����..
	a)	�������в���10���ͻ���Ϣ
	b)	�����������������пͻ�����Ϣ.
 */

public class CustomerTest {
	public static void main(String[] args) {
	
	}

	// �����ͻ��������ɷ���
	public String customerID() { // ����Ҫ��static��̬��ͨ���������
		Random random = new Random();
		int date = 201810;
		// TODO Java�ṩ��Calendar��������������һ���ȡʱ��ͨ����
		Calendar cal = new Calendar;
		int month = cal.get
		int last4d = random.nextInt(9000)+1000; // �������4λ��
		String customerID = "KH"+date+last4d;
		return customerID; 
	}
}
