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
 * ���������ݿ�����ӣ�����ִ��Dao����sql��䣬��ɾ�Ĳ�
 * 
 * @author ���ľ�
 *
 */
public class rSetUtils {
	// �������ݿ�
	static Connection connection;
	static PreparedStatement preparedStatement;
	DateUtils dateUtils;

	public rSetUtils() {
		connection = JDBCUtils.getConnection();
		dateUtils = new DateUtils();
		System.out.println("[rSetUtils] /n [print - Connection]"+connection);
	}

	/**
	 * �û���֤
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
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return user;
	}

	/**
	 * �û����
	 * 
	 * @throws SQLException
	 */
	public boolean addUser(String sql, User user) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		// ��ֵռλ��
		preparedStatement.setObject(1, user.getUserId());
		preparedStatement.setObject(2, user.getUserName());
		preparedStatement.setObject(3, user.getPassWord());
		preparedStatement.setObject(4, user.getSex());
		preparedStatement.setObject(5, user.getUserIdNumber());
		preparedStatement.setObject(6, user.getTel());
		preparedStatement.setObject(7, user.getAddr());
		preparedStatement.setObject(8, user.getType());
		// ִ����ӣ�������Ӱ�������
		int rSet = preparedStatement.executeUpdate();
		return rSet == 1;
	}

	/**
	 * ��ѯ����
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
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
			System.out.println(car);
		}
//		 �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	// �������Ͳ�ѯ
	public ArrayList<Car> getCarListByCategory(String sql, String carCategory) throws SQLException {
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
			carsList.add(car);
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return carsList;
	}

	/**
	 * �޸��ֶ�ֵ��������Ӱ�������
	 */
	public int getUpdateResult(String sql) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		int resultRow = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return resultRow;
	}

	/**
	 * ��
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
		System.out.println("[������][rSetUtils]>>�����������У�" + recordList.size());
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	/**
	 * ��
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
	 * ������ѯ����
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
			// ���return_date
			System.out.println("-----------" + record.getReturn_date());
			if (record.getReturn_date() != null) {
				// �����ܽ��
				double days = DateUtils.getSubDays(record.getStart_date(), record.getReturn_date());
				double totalPay = days * record.getRent();
				System.out.println("[������][rSetUtils]������������һ�찴һ���㣩��" + days + "\t �ܽ��" + totalPay);
				record.setPayment(totalPay);
				// update ���ݿ�
				String updPayment = "update car_record set payment = " + record.getPayment() + " where record_id="
						+ rSet.getInt("record_id");
				getUpdateResult(updPayment);
				recordList.add(record);
				System.out.println(record);
			}
			System.out.println("[������][rSetUtils]]>>�����������У�" + recordList.size());
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	/**
	 * �鿴������Ϣ
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
		System.out.println("[������][rSetUtils]>>�����������У�" + recordList.size());
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}

	// ��ӳ�
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

	// ��ѯ��
	public boolean updateCar(String sql, String updContent, String carId) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setObject(1, updContent);
		preparedStatement.setObject(2, carId);
		int rSet = preparedStatement.executeUpdate();
		return rSet != 0;
	}
}