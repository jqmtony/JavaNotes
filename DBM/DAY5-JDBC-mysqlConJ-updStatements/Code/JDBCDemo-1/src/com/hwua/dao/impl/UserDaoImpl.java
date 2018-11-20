package com.hwua.dao.impl;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hwua.dao.UserDao;
import com.hwua.domain.User;
import com.hwua.util.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User u) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ' Statement
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static boolean method1() throws SQLException {

		// -- 1.获取连接
		Connection con = JDBCUtils.getConnection();

		// -- 2.通过连接获取处理对象Statement 这里是没有参数的.
		Statement statement = con.createStatement();

		// -- 3.提供要执行的sql语句
		String sql = "update _user set id = 3 where name = '王五' and sex = 1";

		// -- 4.把语句给Statement来执行 .返回的受影响的行数.
		int result = statement.executeUpdate(sql);

		return result != 0;
	}

	/**
	 * ' 使用PreparedStatement
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static boolean method2() throws SQLException {

		// -- 1.获取连接
		Connection con = JDBCUtils.getConnection();
		// -- 2.提供要执行的sql语句 ? 是占位符.
		String sql = "update _user set sex = ? where id = ?";
		// -- 3.通过连接获取PreparedStatement对象
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		// -- 4.给占位符赋值 占位符的下标从1开始
		preparedStatement.setBoolean(1, false);
		preparedStatement.setInt(2, 3);
		// -- 5.执行sql语句.
		int result = preparedStatement.executeUpdate();
		return result != 0;
	}

	public static void method3() throws SQLException {

		// -- 1 建立连接
		Connection conn = JDBCUtils.getConnection();
		// -- 2.提供要执行的查询语句
		String sql = "select id,name,sex from _user";
		// -- 3.通过Connection来获取PreparedStatement Ctrl + 1
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		// -- 4.替换占位符
		// -- 5.执行sql语句 得到结果集
		ResultSet rSet = preparedStatement.executeQuery();
		// -- 6.结果集是一张临时表.行和列.我们需要的是User对象.所以需要遍历结果集
		List<User> list = new ArrayList<>();
		while (rSet.next()) {
			User u = new User();
			u.setUserId(rSet.getInt("id"));
			u.setUserName(rSet.getString("name"));
			u.setUserSex(rSet.getBoolean("sex"));
			list.add(u);
		}

		// -- 测试对集合进行遍历
		for (User user : list) {
			System.out.println(user);
		}
	}

	/**
	 * '泛型函数
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException 
	 */
	public static boolean updateObject(String sql,Object... params) throws SQLException {
		// -- 1 建立连接
		Connection conn = JDBCUtils.getConnection();
		System.out.println(conn);
		// -- 3.通过Connection来获取PreparedStatement Ctrl + 1
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		// -- 4.替换占位符
		// -- 使用元数据metadata来获取sql语句中占位符的数量
		ParameterMetaData metaData = preparedStatement.getParameterMetaData();
		System.out.println("占位符个数:\t"+metaData.getParameterCount());
		//-- 遍历赋值占位符
		for (int i = 0; i < metaData.getParameterCount(); i++) {
			preparedStatement.setObject(i+1, params[i]);
		}		
		//-- 执行sql语句		
		return preparedStatement.executeUpdate() != 0;
	}

	public static void main(String[] args) {
		try {
			String sql = "insert into score values(?,?,?)";
			updateObject(sql,99,99,99);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
