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
 * ���������ݿ�����ӣ�����ִ��Dao����sql��䣬��ɾ�Ĳ�
 * 
 * @author ���ľ�
 *
 */
public class rSetUtils {
	// �������ݿ�
	static Connection connection;
	static PreparedStatement preparedStatement;

	public rSetUtils() {
		connection = JDBCUtils.getConnection();
	}

	/**
	 * ��ѯ����
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	  public static <T>ArrayList getCarListaaaa(String sql) throws SQLException{
		  preparedStatement = connection.prepareStatement(sql);
			ResultSet rSet = preparedStatement.executeQuery();
			// ��rSetת��ΪArrayList
			ArrayList<Car> carsList = new ArrayList<>();
			while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				carsList.add(car);
			}
			// �رս�������ر�Ԥ����
			JDBCUtils.closeResultSet(rSet);
			JDBCUtils.closePreparedStatement(preparedStatement);
			return carsList;
	    }
	public ArrayList<Car> getCarList(String sql) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// ��rSetת��ΪArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
			Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
					rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
					rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
			carsList.add(car);
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	// �������Ͳ�ѯ
	public ArrayList<Car> getCarListByCategory(String sql,String carCategory) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// ��rSetת��ΪArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				if(car.getCategory_name().equals(carCategory)) {
					carsList.add(car);
				}
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}
	
	// ����Ʒ�Ʋ�ѯ
	public ArrayList<Car> getCarListByBrand(String sql, String carBrand) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// ��rSetת��ΪArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
				Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
						rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
						rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
				if(car.getBrand_name().contains(carBrand)) {
					carsList.add(car);
				}
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

}
