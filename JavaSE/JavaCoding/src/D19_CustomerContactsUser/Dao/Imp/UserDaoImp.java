package D19_CustomerContactsUser.Dao.Imp;

import D19_CustomerContactsUser.Bean.User;
import D19_CustomerContactsUser.Dao.UserDao;
import D19_CustomerContactsUser.Service.UserService;
import D19_CustomerContactsUser.Util.DataSet;

public class UserDaoImp implements UserDao{

	@Override
	public User getUser(String userAccount, String userPsw) {
		User user = null;
		for (int i = 0; i < DataSet.users.size(); i++) {
			user = DataSet.users.get(i);
			// ���û�ҵ��������ң����˷Ѿ���������������
			if(user==null) {
				continue;
			}
			// �ж��Ƿ�Ϊ�û�
			if(user.getUserAccount().equals(userAccount)&&user.getUserPwd().equals(userPsw)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean insertCust() {
		// �����ݿ������һ���ͻ���Ϣ
		
		return Us;
	}

	
	
}

	
