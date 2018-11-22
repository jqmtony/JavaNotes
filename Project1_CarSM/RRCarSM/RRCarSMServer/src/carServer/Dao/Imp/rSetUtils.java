package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Utils.DateUtils;
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
	public static <T> ArrayList getCarListaaaa(String sql) throws SQLException {
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
	public ArrayList<Car> getCarListByCategory(String sql, String carCategory) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rSet = preparedStatement.executeQuery();
		// ��rSetת��ΪArrayList
		ArrayList<Car> carsList = new ArrayList<>();
		while (rSet.next()) {
			Car car = new Car(rSet.getInt("id"), rSet.getString("model"), rSet.getString("t_comments"),
					rSet.getString("brand_name"), rSet.getString("category_name"), rSet.getDouble("price"),
					rSet.getDouble("rent"), rSet.getInt("status"), rSet.getInt("useable"));
			if (car.getCategory_name().equals(carCategory)) {
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
			if (car.getBrand_name().contains(carBrand)) {
				carsList.add(car);
			}
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
		preparedStatement.setInt(1, Integer.parseInt(userId));
		preparedStatement.setInt(2, Integer.parseInt(carId));
		preparedStatement.setString(3, DateUtils.getCurDate());
		int rSet = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return rSet;
	}

	/**
	 * ��
	 * @throws SQLException 
	 */
	public int updReturnRecord(String updReturnRecord, String carId, String userId) throws SQLException {
		preparedStatement = connection.prepareStatement(updReturnRecord);
		preparedStatement.setString(1, DateUtils.getCurDate());
		preparedStatement.setInt(2, Integer.parseInt(carId));
		preparedStatement.setInt(3, Integer.parseInt(userId));
		int rSet = preparedStatement.executeUpdate();
		JDBCUtils.closePreparedStatement(preparedStatement);
		return rSet;
	}

	/**
	 * ��
	 * 
	 * @param selRecord
	 * @return
	 * @throws SQLException
	 * @throws ParseException 
	 */
	public ArrayList<Record> getRecordList(String selRecord) throws SQLException, ParseException {
		preparedStatement = connection.prepareStatement(selRecord);
		ResultSet rSet = preparedStatement.executeQuery();
		ArrayList<Record> recordList = new ArrayList<>();
		while (rSet.next()) {
			Record record = new Record(rSet.getInt("record_id"), rSet.getString("car_number"), rSet.getDouble("rent"),
					rSet.getDouble("payment"), rSet.getString("t_comments"), rSet.getString("brand_name"),
					rSet.getString("category_name"), rSet.getDate("start_date"), rSet.getDate("return_date"));
			recordList.add(record);
			// ������������
			System.out.println("1");
			Date end = record.getReturn_date();
			Date start = record.getStart_date();
			System.out.println("return date \t"+end);
			System.out.println("start date \t"+start);
			String date = DateUtils.getSubDays(start, end);
			System.out.println("return date - start date \t"+date);
			Double days = Double.parseDouble(date);
			System.out.println(days);
			double totalPay =5*record.getPayment();
			System.out.println("�������"+date+"*ÿ������"+record.getPayment()+"="+totalPay);
		}
		// �رս�������ر�Ԥ����
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		return recordList;
	}
	/**
	 * ������
	 * 
	 * @throws SQLException
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws SQLException, ParseException {
		rSetUtils rSetUtils = new rSetUtils();
		String updRecord = "insert into car_record(user_id, car_id, start_date) values(?,?,?)";
//		rSetUtils.updRentRecord(updRecord, "4", "4");
		String updReturnRecord = "update car_record set return_date= ? where car_id=? and user_id=?";
//		rSetUtils.updReturnRecord(updReturnRecord, "2", "1");
		String selRecord = "SELECT d.record_id,a.car_number,a.t_comments,b.brand_name,c.category_name,a.rent,d.payment,d.start_date,d.return_date from car a,car_brand b,car_category c,car_record d where a.brand_id=b.id and  a.category_id=c.id and a.id=d.car_id and d.user_id=3";
		rSetUtils.getRecordList(selRecord);
	}

}