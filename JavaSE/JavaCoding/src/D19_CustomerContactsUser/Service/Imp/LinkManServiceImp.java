package D19_CustomerContactsUser.Service.Imp;

import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Dao.LinkManDao;
import D19_CustomerContactsUser.Dao.Imp.LinkManDaoImp;
import D19_CustomerContactsUser.Service.LinkManService;

public class LinkManServiceImp implements LinkManService {
	private LinkManDao lmd;

	public LinkManServiceImp() {
		lmd = new LinkManDaoImp();
	}

	/**
	 * 通过传入的ID查找联系人对象
	 */
	@Override
	public LinkMan getLinkManByID(int nextInt) {
		return lmd.getLinkMan(nextInt);
	}

	/**
	 * 添加联系人
	 */
	@Override
	public boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment) {
		return lmd.addLinkMan(lmName, lmGender, lmPhone, lmPosition, lmComment);
	}

	/**
	 * 删除联系人
	 */
	@Override
	public boolean delLinkMan(int nextInt) {
		return lmd.delLinkMan(nextInt);
	}

	/**
	 * 显示所有联系人
	 */
	@Override
	public LinkMan showAllLinkMan() {
		return lmd.showAllLinkMan();
	}

}
