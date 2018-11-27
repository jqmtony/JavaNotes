package carServer.Service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Dao.CarDao;
import carServer.Dao.Imp.CarDaoImpl;
import carServer.Entity.Car;
import carServer.Entity.insertCar;
import carServer.Service.CarService;

public class CarServiceImp implements CarService {
	CarDao carDao;

	public CarServiceImp() {
		carDao = new CarDaoImpl();
	}

	// 查询所有车辆
	@Override
	public ArrayList<Car> listCar() throws SQLException {
		return carDao.getCarList();
	}

	// 根据价格排序
	@Override
	public ArrayList<Car> listCarByPrice() throws SQLException {
		return carDao.getCarListByPrice();
	}

	@Override
	public ArrayList<Car> listCarByPriceDESC() throws SQLException {
		return carDao.getCarListByPriceDESC();
	}
	
	// 查询某类型的车
	@Override
	public ArrayList<Car> listCarByCategory(String carCategory) throws SQLException {
		return carDao.getCarListByCategory(carCategory);
	}
	// 查询某品牌的车
	@Override
	public ArrayList<Car> listCarByBrand(String carBrand) throws SQLException {
		return  carDao.getCarListByBrand(carBrand);
	}
	// 查看特定车辆
	@Override
	public ArrayList<Car> adminListCar(String carId) throws SQLException {
		return carDao.getAdminListCar(carId);
	}
	// 添加车辆
	@Override
	public boolean adminAddCar(insertCar car) throws SQLException {
		return carDao.addCar(car);
	}

	@Override
	public boolean adminUpdateCar(String carId, String updChoose, String updContent) throws SQLException {
		return carDao.updateCar(carId,updChoose,updContent);
	}

}
