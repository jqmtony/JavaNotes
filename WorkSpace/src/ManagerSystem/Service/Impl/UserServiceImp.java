package ManagerSystem.Service.Impl;

import java.sql.SQLException;

import ManagerSystem.Dao.UserDao;
import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;

/**
 * ʵ��Userҵ���ľ��巽�����߼�
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	private UserDao ud;

	/**
	 * LoginUser���û���¼ҵ���
	 * �������������ݿ⣬���õ�����ֵ��������û��������û������û���û�������null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd) throws SQLException {
		return ud.getUser(userName,userPwd);
	}

}
