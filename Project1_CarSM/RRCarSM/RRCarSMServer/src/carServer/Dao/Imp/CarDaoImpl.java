package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Dao.CarDao;
import carServer.Entity.Car;
import carServer.Utils.JDBCUtils;

/**
 * Car�����ݲ�ʵ��
 * 
 * @author ���ľ�
 *
 */
public class CarDaoImpl implements CarDao {
	// ��ʼ��
	Connection connection;
	rSetUtils rSetUtils;
	ArrayList<Car> carArrayList;

	public CarDaoImpl() {
		connection = JDBCUtils.getConnection();
		rSetUtils = new rSetUtils();
	}
	
	// ��ѯ���г����������ѯ��car��brand��category��
	@Override
	public ArrayList<Car> getCarList() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.id ";
		carArrayList = rSetUtils.getCarList(sql);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	
	// ���۸�����
	@Override
	public ArrayList<Car> getCarListByPrice() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.price";
		carArrayList = rSetUtils.getCarList(sql);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	@Override
	public ArrayList<Car> getCarListByPriceDESC() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.price DESC";
		carArrayList = rSetUtils.getCarList(sql);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	// �����Ͳ�ѯ
	@Override
	public ArrayList<Car> getCarListByCategory(String carCategory) throws SQLException {
		String sql =  "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id";
		carArrayList = rSetUtils.getCarListByCategory(sql,carCategory);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	// ��Ʒ�Ʋ���
	@Override
	public ArrayList<Car> getCarListByBrand(String carBrand) throws SQLException {
		String sql =  "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id";
		carArrayList = rSetUtils.getCarListByBrand(sql,carBrand);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
}
