package carClient.Service.Impl;

import carClient.Entity.User;
import carClient.Service.UserService;

/**
 * ʵ��Userҵ���ľ��巽�����߼�
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	
	/**
	 * LoginUser���û���¼ҵ���
	 * �������������ݿ⣬���õ�����ֵ��������û��������û������û���û�������null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd)  {
		User user = null;
		// TODO socket.getresponse
		return user;
	}

}
