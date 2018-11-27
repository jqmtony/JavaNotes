package carServer.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Entity.Car;
import carServer.Entity.insertCar;
/**
 * 租车查询
 * @author 李文娟
 *
 */
public interface CarService {
	
	/**
	 * 查询所有车辆信息（用户）
	 * @return
	 * @throws SQLException 
	 */
	public ArrayList<Car> listCar() throws SQLException;

	public ArrayList<Car> listCarByPrice() throws SQLException;

	public ArrayList<Car> listCarByPriceDESC() throws SQLException;

	public ArrayList<Car> listCarByCategory(String carCategory) throws SQLException;

	public ArrayList<Car> listCarByBrand(String carBrand) throws SQLException;

	public ArrayList<Car> adminListCar(String carId) throws SQLException;

	public boolean adminAddCar(insertCar car) throws SQLException;

	public boolean adminUpdateCar(String carId, String updChoose,String updContent) throws SQLException;

}
