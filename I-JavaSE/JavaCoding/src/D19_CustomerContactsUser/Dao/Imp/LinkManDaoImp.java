package D19_CustomerContactsUser.Dao.Imp;

import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Dao.LinkManDao;
import D19_CustomerContactsUser.Util.DataSet;

public class LinkManDaoImp implements LinkManDao {
	/**
	 * 非null就返回联系人对象，联系人不存在就返回null
	 */
	@Override
	public LinkMan getLinkMan(int nextInt) {
		for (LinkMan lm : DataSet.linkMans) {
			if (lm.getLinkId() == nextInt) {
				return lm;
			}
		}
		return null;
	}

	/**
	 * 添加联系人
	 */
	@Override
	public boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment) {
		LinkMan lm = new LinkMan(lmName, lmGender, lmPhone, lmPosition, lmComment);
		// 添加成功返回true，失败返回false
		return DataSet.linkMans.add(lm);
	}

	/**
	 * 删除联系人
	 */
	@Override
	public boolean delLinkMan(int nextInt) {
		for (LinkMan lm : DataSet.linkMans) {
			if(lm.getLinkId()==nextInt) {
				return DataSet.linkMans.remove(lm);
			}
		}
		return false;
	}

	/**
	 * 显示联系人
	 */
	@Override
	public LinkMan showAllLinkMan() {
		for (LinkMan lm : DataSet.linkMans) {
			System.out.println(lm);
		}
		return null;
	}

}
