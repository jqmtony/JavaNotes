package com.hwua.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.util.JDBCUtils;


public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(String name, String pwd) throws SQLException{
		//-- 1.建立连接
		Connection conn = JDBCUtils.getConnection();
		//-- 2.通过连接获取预处理
		String sql = "select * from user where username = ? and userpwd = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		System.out.println("参数1:\t"+ name);
		System.out.println("参数2:\t"+ pwd);
	
		//-- 3.替换占位符
		statement.setString(1,name);
		statement.setString(2,pwd);
		//-- 4.执行sql语句
		ResultSet rSet = statement.executeQuery();
		//-- 5.处理结果集
		User user = null;
		while (rSet.next()) {
			user = new User();
			user.setUserName(rSet.getString("userName"));
			user.setUserActiveCode(rSet.getString("userActiveCode"));
			user.setUserEmail(rSet.getString("userEmail"));
			user.setUserId(rSet.getString("userId"));
			user.setUserPhone(rSet.getString("userPhone"));
			user.setUserPwd(rSet.getString("userPwd"));
		}	
		//-- 6.返回数据
		return user;
	}
}
