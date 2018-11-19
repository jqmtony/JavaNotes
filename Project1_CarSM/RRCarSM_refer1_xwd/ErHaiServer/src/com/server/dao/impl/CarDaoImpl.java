package com.server.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;
import com.server.dao.CarDao;
import com.server.service.impl.Utils;

public class CarDaoImpl implements CarDao {
	/**
	 * 获得所有车的类型，字符串数组
	 */
	@Override
	public String[] getCategory() throws SQLException, Exception {
		ResultSet selcetData = Utils.SelcetData("select * from t_category");
		return Utils.resultToStringArray(selcetData);
	}
	/**
	 * 获得所有车的对象，返回ArrayList数组
	 */
	@Override
	public ArrayList<CarBrandCategory> listCar() throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_brand");
		return Utils.resultToCarList(rs);
	}
	/**
	 * 获得所有车的品牌，字符串数组
	 */
	@Override
	public String[] getBrand() throws SQLException, Exception {
		ResultSet selcetData = Utils.SelcetData("select * from t_car");
		return Utils.resultToStringArray(selcetData);
	}
	/**
	 * 添加一辆汽车,返回这辆汽车
	 */
	@Override
	public int addCar(Car car) throws SQLException, Exception {
		return Utils.updateData(
				"insert into t_car (car_number, brand_id, model, color, category_id, t_comments, price, rent, status, useable) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				car.getCarNumber() , car.getBrandId() , car.getModel(),
				car.getColor() , car.getCategoryId() , car.getCarComments(),
				car.getPrice() , car.getRent() , car.getStatus() ,car.getUseable());
	}
	/**
	 * 更新汽车的租赁价格
	 * @throws Exception 
	 * @throws SQLException 
	 */
	@Override
	public int updateCar(String carId, String rent) throws SQLException, Exception {
		return Utils.updateData("update t_car set rent=? where id=?" ,
				 rent ,carId );
	}
	/**
	 * 更新汽车是否上架
	 * @throws Exception 
	 * @throws SQLException 
	 */
	@Override
	public int updateCar(String carId, int useable) throws SQLException, Exception {
		return Utils.updateData("update t_car set useable=? where id=?" ,
				 useable ,carId );
	}
	/**
	 * 通过汽车编号查询汽车
	 * @throws Exception 
	 * @throws SQLException 
	 */
	@Override
	public CarBrandCategory getCarBrandCategoryByCarId(String carId) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_car where carid = ?", carId);
		return Utils.resultToCar(rs);
	}
	/**
	 * 通过车牌查询汽车
	 * @throws Exception 
	 * @throws SQLException 
	 */
	@Override
	public CarBrandCategory getCarBrandCategoryByCarNumber(String carNumber) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_car where carid = ?", carNumber);
		return Utils.resultToCar(rs);
	}
	@Override
	public int updateCarStatus(String carId, String status) throws SQLException, Exception {
		return Utils.updateData("update t_car set rent=? where id=?" ,
				status ,carId );
	}


}
