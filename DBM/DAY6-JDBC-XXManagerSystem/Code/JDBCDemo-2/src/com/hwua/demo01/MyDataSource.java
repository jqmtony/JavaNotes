package com.hwua.demo01;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource implements DataSource{

	private final static List<Connection> connList;
	static {
		connList = new ArrayList<>(10);
		//-- 循环提供连接
		for (int i = 0; i < 10; i++) {
			connList.add(JDBCUtils.getConnection());
		}
		System.out.println("初始化完成,连接池中有连接数为:\t" + connList.size());
	}
	
	/**
	 *  ' 获取连接
	 */
	@Override
	public Connection getConnection() throws SQLException {
		System.out.print("连接池中有连接数:\t" + connList.size());
		Connection conn = connList.remove(0);
		System.out.print("取走一个连接,剩余:\t" + connList.size());
		System.out.println();
		return conn;
	}

	public static void returnConn(Connection conn) {
		System.out.print("连接池中有连接数:\t" + connList.size());
		connList.add(conn);
		System.out.print("归还一个连接,剩余:\t" + connList.size());
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
