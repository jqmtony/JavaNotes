package ManagerSystem.Service.Impl;

import java.sql.SQLException;

import ManagerSystem.Dao.UserDao;
import ManagerSystem.Dao.Imp.UserDaoImpl;
import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;

/**
 * ʵ��Userҵ���ľ��巽�����߼�
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	UserDao ud;
	public UserServiceImp() {
		ud = new UserDaoImpl();
	}

	/**
	 * LoginUser���û���¼ҵ���
	 * �������������ݿ⣬���õ�����ֵ��������û��������û������û���û�������null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd)  {
		User user = null;
		try {
			user = ud.getUser(userName,userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
