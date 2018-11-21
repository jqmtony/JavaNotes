package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Dao.CarDao;
import carServer.Entity.Car;
import carServer.Utils.JDBCUtils;

/**
 * Car的数据层实现
 * 
 * @author 李文娟
 *
 */
public class CarDaoImpl implements CarDao {
	// 初始化
	Connection connection;
	rSetUtils rSetUtils;
	ArrayList<Car> carArrayList;

	public CarDaoImpl() {
		connection = JDBCUtils.getConnection();
		rSetUtils = new rSetUtils();
	}
	
	// 查询所有车辆，三表查询（car、brand、category）
	@Override
	public ArrayList<Car> getCarList() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.id ";
		carArrayList = rSetUtils.getCarList(sql);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	
	// 按价格排序
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
	// 按类型查询
	@Override
	public ArrayList<Car> getCarListByCategory(String carCategory) throws SQLException {
		String sql =  "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id";
		carArrayList = rSetUtils.getCarListByCategory(sql,carCategory);
		if (carArrayList.size() <= 0) {
			return null;
		}
		return carArrayList;
	}
	// 按品牌查找
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
