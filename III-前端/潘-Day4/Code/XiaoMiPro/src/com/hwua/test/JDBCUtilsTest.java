package com.hwua.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.hwua.util.JDBCUtils;

public class JDBCUtilsTest {

	/**
	 * @Test ע���ʾ��ǰ��������ǲ��Է���.
	 */
	@Test
	public void testConnection() {
		try {
			Connection connection = JDBCUtils.getConnection();
			if (connection != null) {
				connection.close();
				System.out.println("�����Ѿ��ر�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
