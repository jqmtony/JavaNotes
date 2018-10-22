package com.hwua.customer;

import java.util.Arrays;

/**
 * �ͻ��Ĺ�����.�����ṩ������Ӧ�ͻ�����ɾ�Ĳ�
 * 		1.����Щ��Ϊ(����)
 * 			���Բ�Ҫ����ʵ�ֵ�ϸ��
 * 		2.����Customerʵ����
 * 		3.�������淽����ϸ��.
 * 		4.��������
 * 
 * @author Administrator
 *
 */
public class CustomerManager {
	private Customer[] array;
	/**
	 * ���ڼ�¼������ʵ�ʴ�ŵ�Ԫ�ظ���
	 *  	��Ա�����ᱻ�Զ���ʼ��.��ʼ��Ĭ��ֵ
	 */
	private int size;
	
	/**
	 * 
	 * @param initCapacity ����ĳ�ʼ����
	 */
	public CustomerManager(int initCapacity) {
		array = new Customer[initCapacity];
	}
	
	/**
	 * ����������ʵ�ʴ���Ԫ�صĸ���
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * �ж�����������Ƿ���Ҫ����
	 */
	public void dilatation() {
		//-- 1.����������е������Ƿ��㹻.�����������.
		//-- ���ݵı�׼��ʵ�ʴ洢Ԫ�ظ������������鳤�ȵ�80%.
		if ((double)size / array.length >= 0.8) {
			array = Arrays.copyOf(array, (int)(array.length * 1.75));
		}
	}
	
	/**
	 * ����һ���ͻ�
	 * 
	 * @param customer Ҫ�����ӵĿͻ�
	 */
	public void addCustomer(Customer customer) {
		//-- �������
		if (customer == null) {
			System.out.println("Ҫ����Ŀͻ���Ϣ����,����ʧ��!");
			//-- return �ǽ�����ǰ����.�����ǰ������main����.���������Ӧ��.
			return ;
		}
		//-- �������
		dilatation();
		//-- ��Ԫ�ط��뵽������
		array[size] = customer;
		//-- �ø���+1
		/*
		 *   Ҫ����Ԫ���±�		Ԫ�ظ���
		 *	    0			          0 
		 * 		1					  1
		 */
		size = size + 1;
		
	}

	/**
	 * ͬһ������ͬ����ͬ�����Ľ�����������. ���������Ǹ�addCustomer����.
	 * 
	 * @param customer Ҫ�����ӵĿͻ�
	 * @param index    ָ����λ��.
	 */
	public void addCustomer(Customer customer, int index) {
		//-- ������
		if (customer == null || index < 0 || index > array.length) {
			System.out.println("λ�ò����ڻ��߲���Ŀͻ���Ϣ����ȷ");
			return;
		}
		//- �ж�����
		dilatation();
		
		//-- ����Ԫ��
		for (int i = size; i > index ; i--) {
			array[i] = array[i-1];
		}
		array[index] = customer;
		
		size ++;
	}

	/**
	 * ɾ��һ��ָ���Ŀͻ�
	 * 
	 * @param customer Ҫ��ɾ���Ŀͻ�
	 */
	public void delCustomer(Customer customer) {

	}

	/**
	 * ����λ��ɾ��ָ���Ŀͻ�
	 * 
	 * @param index ָ����λ��
	 */
	public void delCustomer(int index) {

	}

	/**
	 * ���ݿͻ��ȼ���������
	 */
	public void sortCustomerByLevel() {

	}

	/**
	 * �������öȽ�������.
	 */
	public void sortCustomerBuCredit() {
		//The constructor Customer() is undefined
		//Customer c = new Customer();
	}

	/**
	 * ���ݵ�����ܿͻ�������
	 * 
	 * @param place Ҫ�����ܵĵ���
	 * @return �õ���Ŀͻ�����
	 */
	public int getCustomerCountByPlace(String place) {
		return 0;
	}
	
	/**
	 * ��ʾ���еĿͻ�
	 */
	public void showAllCustomer() {
		if (size == 0) {
			System.out.println("������û��Ԫ��");
			return ;
		}else {
			System.out.println("��������" + size + "��Ԫ��,�������ܿռ�Ϊ:\t" + array.length);
		}
		for (Customer customer : array) {
			if (customer != null) {
				System.out.println(customer);
			}
		}
	}
}
