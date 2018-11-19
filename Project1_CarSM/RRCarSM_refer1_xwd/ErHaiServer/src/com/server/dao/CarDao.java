package com.server.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;

public interface CarDao {

	String[] getCategory() throws SQLException, Exception;

	ArrayList<CarBrandCategory> listCar() throws SQLException, Exception;

	String[] getBrand() throws SQLException, Exception;

	int addCar(Car car) throws SQLException, Exception;


	int updateCar(String carId, String change) throws SQLException, Exception;

	int updateCar(String carId, int useable) throws SQLException, Exception;

	CarBrandCategory getCarBrandCategoryByCarId(String carId) throws SQLException, Exception;

	CarBrandCategory getCarBrandCategoryByCarNumber(String carNumber) throws SQLException, Exception;
	
	int updateCarStatus(String carId, String status) throws SQLException, Exception;
}
