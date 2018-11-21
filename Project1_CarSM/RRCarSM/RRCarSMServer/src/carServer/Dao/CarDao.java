package carServer.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Entity.Car;

public interface CarDao {

	public ArrayList<Car> getCarList() throws SQLException;

	public ArrayList<Car> getCarListByPrice() throws SQLException;

	public ArrayList<Car> getCarListByPriceDESC() throws SQLException;

	public ArrayList<Car> getCarListByCategory(String carCategory) throws SQLException;

	public ArrayList<Car> getCarListByBrand(String carBrand) throws SQLException;
	
}
