package com.server.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;
import com.server.dao.CarDao;
import com.server.dao.impl.CarDaoImpl;
import com.server.service.CarService;

public class CarServiceImpl implements CarService {

	CarDao cd;
	public CarServiceImpl() {
		cd = new CarDaoImpl();
	}
	
	@Override
	public String[] getCarCategory() {
		String[] str;
		try {
			str = cd.getCategory();
			return str;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String[] getBrand() {
		String[] str;
		try {
			str = cd.getBrand();
			return str;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<CarBrandCategory> listCar() {
		ArrayList<CarBrandCategory> arrayList;
		try {
			arrayList = cd.listCar();
			return arrayList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public CarBrandCategory addCar(Car car) {
		try {
			if (cd.addCar(car) > 0) {
				return cd.getCarBrandCategoryByCarNumber(car.getCarNumber());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<CarBrandCategory> adminListCar() {
		try {
			return cd.listCar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public CarBrandCategory updateCarRent(String carId, String change) {
		try {
			if (cd.updateCar(carId , change) > 0) {
				return cd.getCarBrandCategoryByCarId(carId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CarBrandCategory updateCarUseable(String carId, int useable) {
		try {
			if (cd.updateCar(carId , useable) > 0) {
				return cd.getCarBrandCategoryByCarId(carId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
