package carServer.Service.Impl;
import java.sql.SQLException;
import java.util.List;

import carServer.Dao.UserDao;
import carServer.Dao.Imp.UserDaoImpl;
import carServer.Entity.User;
import carServer.Service.UserService;

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
/**
 * ����û�
 * @throws SQLException 
 */
	@Override
	public Boolean registerUser(User user) throws SQLException {
		return ud.addUser(user);
	}
}
