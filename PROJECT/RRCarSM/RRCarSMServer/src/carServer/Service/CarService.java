package carServer.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Entity.Car;
import carServer.Entity.insertCar;
/**
 * �⳵��ѯ
 * @author ���ľ�
 *
 */
public interface CarService {
	
	/**
	 * ��ѯ���г�����Ϣ���û���
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
