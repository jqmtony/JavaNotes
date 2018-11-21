package carServer.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Entity.Car;
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

}
