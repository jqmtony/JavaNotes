package D19_CustomerContactsUser.Dao;

import D19_CustomerContactsUser.Bean.LinkMan;

public interface LinkManDao{

	LinkMan getLinkMan(int nextInt);

	boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment);

	LinkMan showAllLinkMan();

	boolean delLinkMan(int nextInt);

	


}
