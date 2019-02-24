package D19_CustomerContactsUser.Service;

import D19_CustomerContactsUser.Bean.LinkMan;

public interface LinkManService {

	LinkMan getLinkManByID(int nextInt);

	boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment);

	LinkMan showAllLinkMan();

	boolean delLinkMan(int nextInt);

}
