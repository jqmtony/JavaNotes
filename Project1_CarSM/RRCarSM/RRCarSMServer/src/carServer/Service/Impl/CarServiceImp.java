package carServer.Service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Dao.CarDao;
import carServer.Dao.Imp.CarDaoImpl;
import carServer.Entity.Car;
import carServer.Service.CarService;

public class CarServiceImp implements CarService {
	CarDao carDao;

	public CarServiceImp() {
		carDao = new CarDaoImpl();
	}

	// ��ѯ���г���
	@Override
	public ArrayList<Car> listCar() throws SQLException {
		return carDao.getCarList();
	}

	// ���ݼ۸�����
	@Override
	public ArrayList<Car> listCarByPrice() throws SQLException {
		return carDao.getCarListByPrice();
	}

	@Override
	public ArrayList<Car> listCarByPriceDESC() throws SQLException {
		return carDao.getCarListByPriceDESC();
	}
	
	// ��ѯĳ���͵ĳ�
	@Override
	public ArrayList<Car> listCarByCategory(String carCategory) throws SQLException {
		return carDao.getCarListByCategory(carCategory);
	}
	// ��ѯĳƷ�Ƶĳ�
	@Override
	public ArrayList<Car> listCarByBrand(String carBrand) throws SQLException {
		return  carDao.getCarListByBrand(carBrand);
	}

}
