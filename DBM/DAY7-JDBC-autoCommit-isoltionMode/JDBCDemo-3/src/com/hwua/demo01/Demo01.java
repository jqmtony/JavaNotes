package com.hwua.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Demo01 {
	public static void main(String[] args) {
		//-- 假设这是在做转账业务.  从第二个对象中转100到第一个对象
		Connection conn = null;
		Savepoint savepoint = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql:///tc35?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "123456");
			
			//-- 1.关闭事务的自动提交
			conn.setAutoCommit(false);
			String sql1 = "update account set balance = balance + 100 where id = 1";
			PreparedStatement prepareStatement = conn.prepareStatement(sql1);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			 savepoint = conn.setSavepoint();
			String sql2 = "update account111 set balance1 = balance1 - 100 where id = 2";
			PreparedStatement prepareStatement2 = conn.prepareStatement(sql2);
			prepareStatement2.executeUpdate();
			conn.commit();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback(savepoint);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}