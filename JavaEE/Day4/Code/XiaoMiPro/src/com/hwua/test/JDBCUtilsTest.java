package com.hwua.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.hwua.util.JDBCUtils;

public class JDBCUtilsTest {

	/**
	 * @Test 注解标示当前这个方法是测试方法.
	 */
	@Test
	public void testConnection() {
		try {
			Connection connection = JDBCUtils.getConnection();
			if (connection != null) {
				connection.close();
				System.out.println("连接已经关闭");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
