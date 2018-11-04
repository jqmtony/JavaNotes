package D19_CustomerContactsUser.Service.Imp;

import D19_CustomerContactsUser.Bean.User;
import D19_CustomerContactsUser.Dao.UserDao;
import D19_CustomerContactsUser.Dao.Imp.UserDaoImp;
import D19_CustomerContactsUser.Service.UserService;

public class UserServiceImp implements UserService {
	private UserDao userDao;

	public UserServiceImp() {
		userDao = new UserDaoImp();
	}

	/**
	 * ��¼���ܣ�����ɹ���¼�������û���Ϣ�������¼ʧ�ܣ�����null
	 */
	@Override
	public User loginUser(String userAccount, String userPsw) {
		User user = null;
		try {
			user = userDao.getUser(userAccount, userPsw);
		} catch (Exception e) {
			System.out.println("�û����������벻���ڣ�");
		}
		return user;
	}



}
