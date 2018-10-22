package com.hvua.domain.customer;

import java.util.Arrays;

/**
 * �ͻ��Ĺ����࣬�ṩ�Կͻ���ɾ�Ĳ�ķ���
 * 
 * @author Administrator
 *
 */

public class CustomerManager {
	/**
	 * ֻ�г�Ա����������main���ʼ�������Ĭ��ֵ
	 */
	private Customer[] array; // ���ڴ��Customer����
	private int size;

	/**
	 * ��ʼ�����鳤�ȣ��вι��취 ����ʱ�ĵ��÷�������������ĳ��ȣ�CustomerManager cm = new CustomerManager(4);
	 */
	public CustomerManager(int initCapacity) {
		array = new Customer[initCapacity];
	}

	/**
	 * ��ȡ�����Ĵ�С
	 */
	public int getSize() {
		return size;
	}

	/**
	 * ��������������Ƿ��㹻��ʹ���ʳ���80%����������
	 */
	public void enlarge() {
		// -- 1.����������е������Ƿ��㹻.�����������.
		// -- ���ݵı�׼��ʵ�ʴ洢Ԫ�ظ������������鳤�ȵ�80%.
		if ((double) size / array.length >= 0.8) {
			array = Arrays.copyOf(array, (int) (array.length * 1.8)); // ���� = ���������飡
		}
	}

	/**
	 * ���һ������
	 */
	public void addCustomer(Customer customer) {
		if (customer == null) {
			System.out.println("Ҫ��ӵ�Customer���������������������룡"); // TODO �Ƿ������������
			return;
		}
		enlarge(); // ȷ���������㹻�ռ�������
		array[size] = customer;
		size = size + 1;
	}

	/**
	 * ָ��λ�����һ������
	 */
	public void addCustomer(Customer customer, int index) {
		if (customer == null || index < 0 || index > array.length) {
			System.out.println("������±�λ�����벻�Ϸ������������� ��_��");
			return;
		}
		enlarge();
		for (int i = size; i > index; i--) { // ��������ƣ�i--
			array[i] = array[i - 1];
		}
		array[index] = customer;
		size = size + 1;
	}

	/**
	 * ָ��λ��ɾ��һ������
	 */
	public void delCustomer(int index) {
		if (index < 0 || index > array.length) {
			System.out.println("������±�λ�����벻�Ϸ������������� ��_��");
			return;
		}
		enlarge();
		for (int i = index; i < array.length-1; i++) { // ������ǰ��
			array[i] = array[i + 1];
		}
		size = size - 1;
	}
	
	/**
	 * �ͻ��ȼ���������
	 */
	public void sortCustomerLevel() {
		Customer a = new Customer();
		Customer b = new Customer();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[j].getCustomerLevel().length()<array[j-1].getCustomerLevel().length()) {
					
				}
			}
		}
	}

	/**
	 * ��ʾ���е�Customer����
	 */
	public void showAllCustomer() {
		if (size == 0) {
			System.out.println("������gon o(�i�n�i)o �Ͽ���Ӱɣ�"); // TODO �Ƿ����
		} else {
			System.out.println("�����й���" + size + "������Ԫ�أ������ܿռ�Ϊ��" + array.length);
		}
		for (Customer cu : array) {
			if (cu != null) {
				System.out.println(cu);
			}
		}
	}
}
