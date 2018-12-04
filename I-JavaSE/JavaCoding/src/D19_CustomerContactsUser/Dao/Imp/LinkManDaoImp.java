package D19_CustomerContactsUser.Dao.Imp;

import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Dao.LinkManDao;
import D19_CustomerContactsUser.Util.DataSet;

public class LinkManDaoImp implements LinkManDao {
	/**
	 * ��null�ͷ�����ϵ�˶�����ϵ�˲����ھͷ���null
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
	 * �����ϵ��
	 */
	@Override
	public boolean addLinkMan(String lmName, String lmGender, String lmPhone, String lmPosition, String lmComment) {
		LinkMan lm = new LinkMan(lmName, lmGender, lmPhone, lmPosition, lmComment);
		// ��ӳɹ�����true��ʧ�ܷ���false
		return DataSet.linkMans.add(lm);
	}

	/**
	 * ɾ����ϵ��
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
	 * ��ʾ��ϵ��
	 */
	@Override
	public LinkMan showAllLinkMan() {
		for (LinkMan lm : DataSet.linkMans) {
			System.out.println(lm);
		}
		return null;
	}

}
