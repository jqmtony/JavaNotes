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

	// -- 1.加载配置文件
	static {
		mProperties = new Properties();
		try {
			mProperties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties"));
			/*
			 * DataSource 的实例化必须只有一次.
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

	// -- 3.获取连接
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
