package com.hwua.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hwua.dao.UserDao;
import com.hwua.domain.User;
import com.hwua.utils.JDBCUtils;

public class UserDaoImpl implements UserDao,ResultSetHandler<User> {

	private Connection mConnection;
	

	@Override
	public User getUser(String... params) throws SQLException, Exception {

		//-- 1.获取连接
		mConnection = JDBCUtils.getConnection();
		//-- 2.执行查询语句
		String sql = "select * from user where name = ? and pwd = ?";
		PreparedStatement preparedStatement = mConnection.prepareStatement(sql);
		int paramsCount = preparedStatement.getParameterMetaData().getParameterCount();
		for (int i = 0; i < paramsCount; i++) {
			preparedStatement.setObject(i+1, params[i]);
		}
		ResultSet rSet = preparedStatement.executeQuery();
		List<User> list = this.handler(rSet);
		if (list.size() <= 0) {
			return null;
		}
		
		//-- 关闭资源 永远是先关结果集,再关预处理,最后关连接
		JDBCUtils.closeResultSet(rSet);
		JDBCUtils.closePreparedStatement(preparedStatement);
		
		return list.get(0);
		//-- 3.遍历结果集
		//-- 4.返回结果		
	}


	@Override
	public List<User> handler(ResultSet rSet) throws SQLException {
	
		List<User> list = new ArrayList<>();
		while (rSet.next()) {
			User u = new User();
			u.setId(rSet.getInt("id"));
			u.setName(rSet.getString("name"));
			u.setPwd(rSet.getString("pwd"));
			list.add(u);
		}
		System.out.println("--------");
		for (User u : list) {
			System.out.println(u);
		}
		System.out.println("--------");
		return list;
	}


	/**
	 * ' 增加用户
	 * @throws Exception 
	 * @throws SQLException 
	 */
	@Override
	public int addUser(String name, String pwd) throws SQLException, Exception {
		
		//-- 1.获取连接
		mConnection = JDBCUtils.getConnection();
		String sql = "insert into user values(0,?,?)";
		//-- 2.通过连接拿预处理
		PreparedStatement preparedStatement = mConnection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, pwd);
		//-- 3.执行
		int result = preparedStatement.executeUpdate();
		//-- 4.关闭资源
		JDBCUtils.closePreparedStatement(preparedStatement);
		return result;
	}

}
