package com.client.view;

import java.util.List;

import com.client.bean.CarBrandCategory;
import com.client.bean.Record;
import com.client.bean.User;
import com.client.service.CarService;
import com.client.service.RecordService;
import com.client.service.UserService;
import com.client.service.impl.CarServiceImpl;
import com.client.service.impl.RecordServiceImpl;
import com.client.service.impl.UserServiceImpl;

public abstract class View {
	/**
	 * ��¼���û�
	 */
	static User user;
	/**
	 * �û�����
	 */
	static UserService us;
	/**
	 * ��������
	 */
	static CarService cs;
	/**
	 * ������¼����
	 */
	static RecordService rs;
	/**
	 * �����б�
	 */
	public static List<CarBrandCategory> listCar;
	/**
	 * ������¼�б�
	 */
	public static List<Record> listRecord;
	/**
	 * ���������б�
	 */
	public static String [] listCategory;
	/**
	 * ����Ʒ���б�
	 */
	public static String [] listBrand;
	
	static {
		if (us ==null) {
			us = new UserServiceImpl();
		}
		if (cs ==null) {
			cs = new CarServiceImpl();
		}
		if (rs == null) {
			rs = new RecordServiceImpl();
		}
		if (listBrand ==null) {
			listBrand = cs.getBrand();
		}
		if (listCategory == null) {
			listCategory = cs.getCarCategory();
		}
		
	}
	/**
	 * ���󷽷���ʼ������
	 */
	abstract void initFrame();
}
