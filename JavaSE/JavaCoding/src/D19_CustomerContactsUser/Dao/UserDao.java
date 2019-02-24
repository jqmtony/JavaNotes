package D19_CustomerContactsUser.Dao;

import D19_CustomerContactsUser.Bean.User;

public interface UserDao {


	User getUser(String userAccount, String userPsw);

	boolean insertCust();


}
