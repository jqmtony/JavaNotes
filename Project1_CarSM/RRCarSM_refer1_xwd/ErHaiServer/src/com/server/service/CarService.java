package com.server.service;

import java.util.ArrayList;
import java.util.List;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;

public interface CarService {
	/**
	 * ������г������ͣ��ַ�������
	 * @return
	 */
	String[] getCarCategory();
	/**
	 * ������г���Ʒ�ƣ��ַ�������
	 * @return
	 */
	String[] getBrand();
	/**
	 * ������г��Ķ��󣬷���ArrayList����
	 * @return
	 */
	ArrayList<CarBrandCategory> listCar();
	/**
	 * ���һ������,������������
	 * @param car
	 * @return ����Ϊnull �������ʧ��
	 */
	CarBrandCategory addCar(Car car);
	/**
	 * 
	 * @return
	 */
	List<CarBrandCategory> adminListCar();
	/**
	 * �������������޼۸�
	 * @param carId
	 * @param change
	 * @return����Ϊnull,�������ʧ��
	 */
	CarBrandCategory updateCarRent(String carId, String change);
	/**
	 * ���������Ƿ��ϼ�
	 * @param carId
	 * @param useable
	 * @return ����Ϊnull,�������ʧ��
	 */
	CarBrandCategory updateCarUseable(String carId, int useable);
}
