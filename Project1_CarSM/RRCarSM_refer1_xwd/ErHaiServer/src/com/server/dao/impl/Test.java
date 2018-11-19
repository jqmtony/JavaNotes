package com.server.dao.impl;

import java.sql.SQLException;

import com.server.bean.User;

public class Test {

	public static void main(String[] args) {
		UserDaoImpl ud = new UserDaoImpl() ;
		try {
			User user = ud.selectByUserNamePassWord("xiaoming", "111111");
			System.out.println(user.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
