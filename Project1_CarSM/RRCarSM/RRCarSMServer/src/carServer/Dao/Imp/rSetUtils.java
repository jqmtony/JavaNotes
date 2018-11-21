package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import carServer.Entity.Car;
import carServer.Utils.JDBCUtils;

/**
 * 建立与数据库的连接，并且执行Dao给的sql语句，增删改查
 * 
 * @author 李文娟
 *
 */
public class rSetUtils {
	// 访问数据库
	static Connection connection;
	static PreparedStatement preparedStatement;

	public rSetUtils() {
		connection = JDBCUtils.getConnection();
	}

	/**
	 * 查询功能
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	  public static <T>ArrayList getCarListaaaa(String sql) throws SQLException{
		  preparedStatement = connection.prepareStatement(sql);
			ResultSet rSet = preparedStatement.executeQuery();
			// 将rSet转换为ArrayList
			ArrayList<Car> carsList = new ArrayList<>();
			while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				carsList.add(car);
			}
			// 关闭结果集，关闭预处理
			JDBCUtils.closeResultSet(rSet);
			JDBCUtils.closePreparedStatement(preparedStatement);
			return carsList;
	    }
	public ArrayList<Car> getCarList(String sql) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// 将rSet转换为ArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
			Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
					rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
					rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
			carsList.add(car);
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	// 按照类型查询
	public ArrayList<Car> getCarListByCategory(String sql,String carCategory) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// 将rSet转换为ArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				if(car.getCategory_name().equals(carCategory)) {
					carsList.add(car);
				}
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}
	
	// 按照品牌查询
	public ArrayList<Car> getCarListByBrand(String sql, String carBrand) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// 将rSet转换为ArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				if(car.getBrand_name().contains(carBrand)) {
					carsList.add(car);
				}
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

}
