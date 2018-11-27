package com.server.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.server.bean.User;
import com.server.dao.UserDao;
import com.server.service.impl.Utils;

public class UserDaoImpl implements UserDao {

	@Override
	public User selectByUserNamePassWord(String userName, String passWord) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_user where username = ? and password = ?",
				userName , passWord);
		return Utils.resultToUser(rs);
	}

	@Override
	public User selectByUserName(String userName) throws SQLException, Exception {
		ResultSet rs = Utils.SelcetData("select * from t_user where username = ?", userName);
		return Utils.resultToUser(rs);
	}

	@Override
	public void updateUser(User user) throws SQLException, Exception {
		while (Utils.updateData("insert into t_user (username, password, sex, id_number, tel, addr, type) values (?, ?, ?, ?, ?, ?, ?)", 
				user.getUserName() ,user.getPassWord() , user.getSex() , 
				user.getUserIdNumber() , user.getTel() ,
				user.getAddr() , 0) == 0) {
		}
	}

}
