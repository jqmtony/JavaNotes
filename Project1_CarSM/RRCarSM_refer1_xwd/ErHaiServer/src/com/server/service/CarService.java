package com.server.service;

import java.util.ArrayList;
import java.util.List;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;

public interface CarService {
	/**
	 * 获得所有车的类型，字符串数组
	 * @return
	 */
	String[] getCarCategory();
	/**
	 * 获得所有车的品牌，字符串数组
	 * @return
	 */
	String[] getBrand();
	/**
	 * 获得所有车的对象，返回ArrayList数组
	 * @return
	 */
	ArrayList<CarBrandCategory> listCar();
	/**
	 * 添加一辆汽车,返回这辆汽车
	 * @param car
	 * @return 返回为null 代表添加失败
	 */
	CarBrandCategory addCar(Car car);
	/**
	 * 
	 * @return
	 */
	List<CarBrandCategory> adminListCar();
	/**
	 * 更新汽车的租赁价格
	 * @param carId
	 * @param change
	 * @return返回为null,代表更新失败
	 */
	CarBrandCategory updateCarRent(String carId, String change);
	/**
	 * 更新汽车是否上架
	 * @param carId
	 * @param useable
	 * @return 返回为null,代表更新失败
	 */
	CarBrandCategory updateCarUseable(String carId, int useable);
}
