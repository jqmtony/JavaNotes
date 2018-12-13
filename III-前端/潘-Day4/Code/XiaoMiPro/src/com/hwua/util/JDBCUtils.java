package com.hwua.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC�Ĺ�����: ��ȡ���ݿ������
 * @author Administrator
 *
 */
public class JDBCUtils {
	
	private static DataSource dataSource=null;
	static{
		//��C3P0�������ļ��������õ�������mysql��
		dataSource=new ComboPooledDataSource("mysql");
	}

	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}

}