package com.hwua.demo01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Test {

	public static void main(String[] args) {
		DataSource mds = new MyDataSource();
		try {
			Connection conn = mds.getConnection();
			System.out.println(conn == null);
			//--对Connection进行装饰得到MyConnection
			MyConnection mc = new MyConnection(conn);
			mc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
