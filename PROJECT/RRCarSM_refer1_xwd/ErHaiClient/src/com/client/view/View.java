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
	 * 登录的用户
	 */
	static User user;
	/**
	 * 用户服务
	 */
	static UserService us;
	/**
	 * 汽车服务
	 */
	static CarService cs;
	/**
	 * 还车记录服务
	 */
	static RecordService rs;
	/**
	 * 汽车列表
	 */
	public static List<CarBrandCategory> listCar;
	/**
	 * 还车记录列表
	 */
	public static List<Record> listRecord;
	/**
	 * 汽车类型列表
	 */
	public static String [] listCategory;
	/**
	 * 汽车品牌列表
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
	 * 抽象方法初始化界面
	 */
	abstract void initFrame();
}
