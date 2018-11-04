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
			// 如果没找到，继续找，别浪费精力遍历其他内容
			if(user==null) {
				continue;
			}
			// 判断是否为用户
			if(user.getUserAccount().equals(userAccount)&&user.getUserPwd().equals(userPsw)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean insertCust() {
		// 在数据库中添加一条客户信息
		
		return Us;
	}

	
	
}

	
