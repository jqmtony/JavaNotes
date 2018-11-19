package com.server.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.server.bean.CarBrandCategory;
import com.server.bean.Record;
import com.server.bean.User;
import com.server.util.JDBCUtils;

public class Utils {
	
	public static ResultSet SelcetData(String sql) throws SQLException, Exception {
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		return prepareStatement.executeQuery();
	}
	/**
	 * 从数据库中查询,返回一个结果集
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public static ResultSet SelcetData(String sql, Object... params) throws SQLException, Exception {
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		for (int i = 0; i < params.length; i++) {
			prepareStatement.setObject(i + 1, params[i]);
		}
		return prepareStatement.executeQuery();
	}
	
	public static int updateData(String sql, Object... params) throws SQLException, Exception {
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		for (int i = 0; i < params.length; i++) {
			prepareStatement.setObject(i + 1, params[i]);
		}
		return prepareStatement.executeUpdate();
	}
	/**
	 * 通过结果集的内容返回一个用户对象
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static User resultToUser(ResultSet rs) throws SQLException {
		User user = new User();
		while (rs.next()) {
			user.setUserId(rs.getString(1));
			user.setUserName(rs.getString(2));
			user.setPassWord(rs.getString(3));
			user.setSex(rs.getInt(4));
			user.setUserIdNumber(rs.getString(5));
			user.setTel(rs.getString(6));
			user.setAddr(rs.getString(7));
			user.setType(rs.getInt(8));
        }
		return user;
	}
	/**
	 * 通过结果集的内容返回一个汽车对象
	 * @param rs
	 * @return
	 * @throws SQLException 
	 */
	public static CarBrandCategory resultToCar(ResultSet rs) throws SQLException {
		CarBrandCategory car = new CarBrandCategory();
		while (rs.next()) {
			car.setCarId(rs.getString(1));
			car.setCarNumber(rs.getString(2));
			car.setBrandId(rs.getString(3));
			car.setModel(rs.getString(4));
			car.setColor(rs.getString(5));
			car.setCategoryId(rs.getString(6));
			car.setCarComments(rs.getString(7));
			car.setPrice(rs.getDouble(8));
			car.setRent(rs.getDouble(9));
			car.setStatus(rs.getInt(10));
			car.setUseable(rs.getInt(11));
        }
		return car;
	}
	/**
	 * 通过结果集的内容返回一个记录对象
	 * @param rs
	 * @return
	 * @throws SQLException 
	 */
	public static Record resultToRecord(ResultSet rs) throws SQLException {
		Record record = new Record() ;
		while (rs.next()) {
			record.setRecordId(rs.getInt(1));
			record.setRecordUserId(rs.getInt(2));
			record.setCarBrandCategory(new CarBrandCategory(rs.getString(3)));
			record.setRecordStartDate(rs.getDate(4));
			record.setRecordReturnDate(rs.getDate(5));
			record.setRecordPayment(rs.getInt(6));
        }
		return record;
	}
	
	/**
	 * 通过结果集的内容返回一个汽车列表
	 * @param rs
	 * @return
	 * @throws SQLException 
	 */
	public static ArrayList<CarBrandCategory> resultToCarList(ResultSet rs) throws SQLException {
		ArrayList<CarBrandCategory> list = new ArrayList<>();
		while (rs.next()) {
			CarBrandCategory car = new CarBrandCategory();
			car.setCarId(rs.getString(1));
			car.setCarNumber(rs.getString(2));
			car.setBrandId(rs.getString(3));
			car.setModel(rs.getString(4));
			car.setColor(rs.getString(5));
			car.setCategoryId(rs.getString(6));
			car.setCarComments(rs.getString(7));
			car.setPrice(rs.getDouble(8));
			car.setRent(rs.getDouble(9));
			car.setStatus(rs.getInt(10));
			car.setUseable(rs.getInt(11));
			list.add(car);
        }
		return list;
	}
	/**
	 * 通过结果集的内容返回一个记录列表
	 * @param rs
	 * @return
	 * @throws SQLException 
	 */
	public static ArrayList<Record> resultToRecordList(ResultSet rs) throws SQLException {
		ArrayList<Record> list = new ArrayList<>();
		while (rs.next()) {
			Record record = new Record() ;
			record.setRecordId(rs.getInt(1));
			record.setRecordUserId(rs.getInt(2));
			record.setCarBrandCategory(new CarBrandCategory(rs.getString(3)));
			record.setRecordStartDate(rs.getDate(4));
			record.setRecordReturnDate(rs.getDate(5));
			record.setRecordPayment(rs.getInt(6));
			list.add(record);
        }
		return list;
	}
	public static String[] resultToStringArray(ResultSet rs) throws SQLException {
		String [] str = new String [rs.getMetaData().getColumnCount()];
		while (rs.next()) {
			int i = 0;
			str[i] = rs.getString(2);
			i++;
		}
		return null;
	}


}
