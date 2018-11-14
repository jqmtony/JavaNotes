package com.hwua.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JButton;

/**
 * 
 * ' 这是一个工具类拥有获取数据库的链接,并提供相关资源的关闭方法
 * 
 * @author Administrator
 *
 */
public final class JDBCUtils {
	// Alt + /可以进行联想
	private static Properties sProperties;
	// -- 提供四个变量用于接受配置文件中的内容
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	/**
	 * ' 通过静态域读取配置文件
	 */
	static {
		// -- 1.实例化Properties对象
		sProperties = new Properties();
		// -- 2.给Properties对象加载配置文件.通过提供指向配置文件的流对象
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			sProperties.load(is);
			// -- 3.读取配置文件
			driver = sProperties.getProperty("driver");
			url = sProperties.getProperty("url");
			user = sProperties.getProperty("user");
			pwd = sProperties.getProperty("pwd");
		} catch (IOException e) {
			System.out.println("读取配置文件失败!");
		}
	}

	/**
	 * ' 一般情况下成员变量会以小写m开头 ' 静态变量会以小写s开头
	 */
	private static Connection mConnection;

	/**
	 * '用于获取数据库连接对象
	 * 
	 * @return 返回所获取的数据库连接对象
	 */
	public static Connection getConnection() {
		// -- 判断连接是否已经打开,如果已经打开则直接返回连接,否则打开连接
		if (mConnection == null) {
			try {
				// -- 1.加载驱动
				Class.forName(driver);
				// -- 2.通过DriverManager来获取驱动
				mConnection = DriverManager.getConnection(url, user, pwd);
			} catch (ClassNotFoundException e) {
				System.out.println("驱动文件不存在!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mConnection;
	}

	/**
	 * ' 关闭连接
	 *
	 */
	public void closeConnection(Connection conn) {
		try {
			// -- Alt + Shift + Z 对代码进行try-catch
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭连接失败");
			return;
		}

		System.out.println("关闭连接成功!~");

	}

	public static void main(String[] args) {
		JDBCUtils u = new JDBCUtils();
		Connection conn = u.getConnection();
		if (conn != null) {
			u.closeConnection(conn);
		}
	}

}
