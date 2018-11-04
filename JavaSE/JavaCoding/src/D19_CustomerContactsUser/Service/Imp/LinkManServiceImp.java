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
	 * ͨ�������ID������ϵ�˶���
	 */
	@Override
	public LinkMan getLinkManByID(int nextInt) {
		return lmd.getLinkMan(nextInt);
	}

	/**
	 * �����ϵ��
	 */
	@Override
	public boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment) {
		return lmd.addLinkMan(lmName, lmGender, lmPhone, lmPosition, lmComment);
	}

	/**
	 * ɾ����ϵ��
	 */
	@Override
	public boolean delLinkMan(int nextInt) {
		return lmd.delLinkMan(nextInt);
	}

	/**
	 * ��ʾ������ϵ��
	 */
	@Override
	public LinkMan showAllLinkMan() {
		return lmd.showAllLinkMan();
	}

}
