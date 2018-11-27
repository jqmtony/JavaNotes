package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Entity.User;
import carServer.Entity.insertCar;
import carServer.Utils.DateUtils;
import carServer.Utils.JDBCUtils;
import carServer.Utils.JSONUtils;

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
	DateUtils dateUtils;

	public rSetUtils() {
		connection = JDBCUtils.getConnection();
		dateUtils = new DateUtils();
		System.out.println("[rSetUtils] /n [print - Connection]"+connection);
	}

	/**
	 * 用户验证
	 * 
	 * @throws SQLException
	 */
	public User getUser(String sql, String userName, String userPwd) throws SQLException {
		// 1sql 2name 3pwd
		preparedStatement = connection.prepareStatement(sql);
		System.out.println(userName);
		System.out.println(userPwd);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, userPwd);
		ResultSet rSet = preparedStatement.executeQuery();
		User user = new User();
		while (rSet.next()) {
			user = new User(rSet.getShort("userID"), rSet.getString("userName"), rSet.getString("passWord"),
					rSet.getString("sex"), rSet.getString("userIdNumber"), rSet.getString("tel"),
					rSet.getString("addr"), rSet.getShort("type"));
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return user;
	}

	/**
	 * 用户添加
	 * 
	 * @throws SQLException
	 */
	public boolean addUser(String sql, User user) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		// 赋值占位符
		preparedStatement.setObject(1, user.getUserId());
		preparedStatement.setObject(2, user.getUserName());
		preparedStatement.setObject(3, user.getPassWord());
		preparedStatement.setObject(4, user.getSex());
		preparedStatement.setObject(5, user.getUserIdNumber());
		preparedStatement.setObject(6, user.getTel());
		preparedStatement.setObject(7, user.getAddr());
		preparedStatement.setObject(8, user.getType());
		// 执行添加，返回受影响的行数
		int rSet = preparedStatement.executeUpdate();
		return rSet == 1;
	}

	/**
	 * 查询功能
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
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
			System.out.println(car);
		}
//		 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	// 按照类型查询
	public ArrayList<Car> getCarListByCategory(String sql, String carCategory) throws SQLException {
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
			carsList.add(car);
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	/**
	 * 修改字段值，返回受影响的行数
	 */
	public int getUpdateResult(String sql) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		int resultRow = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return resultRow;
	}

	/**
	 * 借
	 * 
	 * @param updRecord
	 * @return
	 * @throws SQLException
	 */
	public int updRentRecord(String updRecord, String carId, String userId) throws SQLException {
		preparedStatement = connection.prepareStatement(updRecord);
		preparedStatement.setInt(1, Integer.parseInt(carId));
		preparedStatement.setInt(2, Integer.parseInt(userId));
		preparedStatement.setString(3, DateUtils.getCurDate());
		int rSet = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return rSet;
	}

	public ArrayList<Record> getRecordRentList(String selRecord, String carId, String userId) throws SQLException {
		preparedStatement = connection.prepareStatement(selRecord);
		preparedStatement.setInt(1, Integer.parseInt(carId));
		preparedStatement.setInt(2, Integer.parseInt(userId));
		ResultSet rSet = preparedStatement.executeQuery();
		ArrayList<Record> recordList = new ArrayList<>();
		while (rSet.next()) {
			Record record = new Record(rSet.getInt("record_id"), rSet.getString("car_number"), rSet.getDouble("rent"),
					rSet.getDouble("payment"), rSet.getString("t_comments"), rSet.getString("brand_name"),
					rSet.getString("category_name"), rSet.getDate("start_date"), rSet.getDate("return_date"));
			recordList.add(record);
		}
		System.out.println("[服务器][rSetUtils]>>满足条件的有：" + recordList.size());
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	/**
	 * 还
	 * 
	 * @throws SQLException
	 */
	public int updReturnRecord(String updReturnRecord, String carId, String userId) throws SQLException {
		preparedStatement = connection.prepareStatement(updReturnRecord);
		// update start_date
		preparedStatement.setString(1, DateUtils.getCurDate());
		preparedStatement.setInt(2, Integer.parseInt(carId));
		preparedStatement.setInt(3, Integer.parseInt(userId));
		int rSet = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return rSet;
	}

	/**
	 * 还车查询返回
	 * 
	 * @param selRecord
	 * @return
	 * @throws SQLException
	 * @throws ParseException
	 */
	public ArrayList<Record> getRecordList(String selRecord, String carId, String userId)
			throws SQLException, ParseException {
		preparedStatement = connection.prepareStatement(selRecord);
		preparedStatement.setInt(1, Integer.parseInt(carId));
		preparedStatement.setInt(2, Integer.parseInt(userId));
		ResultSet rSet = preparedStatement.executeQuery();
		ArrayList<Record> recordList = new ArrayList<>();
		while (rSet.next()) {
			Record record = new Record(rSet.getInt("record_id"), rSet.getString("car_number"), rSet.getDouble("rent"),
					rSet.getDouble("payment"), rSet.getString("t_comments"), rSet.getString("brand_name"),
					rSet.getString("category_name"), rSet.getDate("start_date"), rSet.getDate("return_date"));
			// 添加return_date
			System.out.println("-----------" + record.getReturn_date());
			if (record.getReturn_date() != null) {
				// 计算总金额
				double days = DateUtils.getSubDays(record.getStart_date(), record.getReturn_date());
				double totalPay = days * record.getRent();
				System.out.println("[服务器][rSetUtils]总天数（不足一天按一天算）：" + days + "\t 总金额" + totalPay);
				record.setPayment(totalPay);
				// update 数据库
				String updPayment = "update car_record set payment = " + record.getPayment() + " where record_id="
						+ rSet.getInt("record_id");
				getUpdateResult(updPayment);
				recordList.add(record);
				System.out.println(record);
			}
			System.out.println("[服务器][rSetUtils]]>>满足条件的有：" + recordList.size());
		}
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	/**
	 * 查看租赁信息
	 * 
	 * @param selRecord
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Record> listAllRecord(String selRecord) throws SQLException {
		preparedStatement = connection.prepareStatement(selRecord);
		ResultSet rSet = preparedStatement.executeQuery();
		ArrayList<Record> recordList = new ArrayList<>();
		while (rSet.next()) {
			Record record = new Record(rSet.getInt("record_id"), rSet.getString("car_number"), rSet.getDouble("rent"),
					rSet.getDouble("payment"), rSet.getString("t_comments"), rSet.getString("brand_name"),
					rSet.getString("category_name"), rSet.getDate("start_date"), rSet.getDate("return_date"));
			recordList.add(record);
		}
		System.out.println("[服务器][rSetUtils]>>满足条件的有：" + recordList.size());
		// 关闭结果集，关闭预处理
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	// 添加车
	public boolean insertCarList(String sql, insertCar car) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		Object[] carValue = { car.getId(), car.getCar_number(), car.getBrand_id(), car.getModel(), car.getColor(),
				car.getCategory_id(), car.getT_comments(), car.getPrice(), car.getRent(), car.getStatus(),
				car.getUseable() };
		for (int i = 0; i < carValue.length; i++) {
			preparedStatement.setObject(i + 1, carValue[i]);
		}
		int rSet = preparedStatement.executeUpdate();
		return rSet != 0;
	}

	// 查询车
	public boolean updateCar(String sql, String updContent, String carId) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setObject(1, updContent);
		preparedStatement.setObject(2, carId);
		int rSet = preparedStatement.executeUpdate();
		return rSet != 0;
	}
}