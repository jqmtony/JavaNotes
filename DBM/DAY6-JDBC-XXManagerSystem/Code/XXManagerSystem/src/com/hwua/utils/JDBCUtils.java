package com.hwua.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

/**
 * 
 * @author Administrator
 *
 */
public final class JDBCUtils {

	private static Properties mProperties;
	private static DataSource mDataSource;
	private static Connection mConnection;

	// -- 1.���������ļ�
	static {
		mProperties = new Properties();
		try {
			mProperties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties"));
			/*
			 * DataSource ��ʵ��������ֻ��һ��.
			 */
			mDataSource = BasicDataSourceFactory.createDataSource(mProperties);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// -- 3.��ȡ����
	public static Connection getConnection() throws SQLException, Exception {
		mConnection = mDataSource.getConnection();
		return mConnection;
	}

	
	public static void closeResultSet(ResultSet rSet) throws SQLException {
		if (rSet != null && !rSet.isClosed()) {
			rSet.close();
		}
	}
	
	public static void closePreparedStatement(PreparedStatement statement) throws SQLException {
		if (statement != null && !statement.isClosed()) {
			statement.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
