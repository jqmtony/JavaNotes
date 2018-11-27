package carServer.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Entity.Car;
import carServer.Entity.insertCar;

public interface CarDao {

	public ArrayList<Car> getCarList() throws SQLException;

	public ArrayList<Car> getCarListByPrice() throws SQLException;

	public ArrayList<Car> getCarListByPriceDESC() throws SQLException;

	public ArrayList<Car> getCarListByCategory(String carCategory) throws SQLException;

	public ArrayList<Car> getCarListByBrand(String carBrand) throws SQLException;

	public ArrayList<Car> getAdminListCar(String carId) throws SQLException;

	public boolean addCar(insertCar car) throws SQLException;

	public boolean updateCar(String carId, String updChoose, String updContent) throws SQLException;

	
}
