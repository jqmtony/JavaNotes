package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Dao.CarDao;
import carServer.Entity.Car;
import carServer.Entity.insertCar;
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
		return rSetUtils.getCarList(sql);
	}

	// 按价格排序
	@Override
	public ArrayList<Car> getCarListByPrice() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.price";
		return rSetUtils.getCarList(sql);
	}

	@Override
	public ArrayList<Car> getCarListByPriceDESC() throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id order by a.price DESC";
		return rSetUtils.getCarList(sql);
	}

	// 按类型查询
	@Override
	public ArrayList<Car> getCarListByCategory(String carCategory) throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id where a.category_id="+carCategory;
		return rSetUtils.getCarListByCategory(sql, carCategory);
	}

	// 按品牌查找
	@Override
	public ArrayList<Car> getCarListByBrand(String carBrand) throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id where a.brand_id="+carBrand;
		return rSetUtils.getCarListByBrand(sql, carBrand);
	}

	// 查看制定车
	@Override
	public ArrayList<Car> getAdminListCar(String carId) throws SQLException {
		String sql = "select a.id,a.model,a.t_comments,b.brand_name,c.category_name,a.price, a.rent, a.status, a.useable from car a join car_brand b on a.brand_id=b.id join car_category c on a.category_id = c.id where a.id="+carId;
		return rSetUtils.getCarList(sql);
	}
	// 添加车
	@Override
	public boolean addCar(insertCar car) throws SQLException {
		String sql = "insert into car values(?,?,?,?,?,?,?,?,?,?,?)";
		return rSetUtils.insertCarList(sql,car);
	}
	// 更新车信息
	@Override
	public boolean updateCar(String carId, String updChoose, String updContent) throws SQLException {
		String sql;
		if(updChoose.equals("1")) {
			sql = "update car set rent = ? where id = ?";
		}else if(updChoose.equals("2")){
			sql = "update car set useable = ? where id = ?";
		}else {
			System.out.println("没有这个选项，请重新输入！");
			return false;
		}
		System.out.println(updContent);
		return rSetUtils.updateCar(sql,updContent,carId);
	}

}
