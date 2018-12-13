package com.hwua.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC的工具类: 获取数据库的连接
 * @author Administrator
 *
 */
public class JDBCUtils {
	
	private static DataSource dataSource=null;
	static{
		//在C3P0的配置文件中找配置的名称是mysql的
		dataSource=new ComboPooledDataSource("mysql");
	}

	/**
	 * 获取数据库连接
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}

}