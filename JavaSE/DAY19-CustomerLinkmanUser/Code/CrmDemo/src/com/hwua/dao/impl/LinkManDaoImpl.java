/**
 * 
 */
package com.hwua.dao.impl;

import java.util.List;

import com.hwua.bean.Customer;
import com.hwua.bean.LinkMan;
import com.hwua.dao.LinkManDao;
import com.hwua.util.DataSet;

/**
 * @author Administrator
 *
 */
public class LinkManDaoImpl implements LinkManDao {


	@Override
	public boolean insertLinkMan(String linkName, String linkGender, String linkPosition, String linkPhone,
			String linkComment) {
		//-- 1.构建联系人
		LinkMan lm = new LinkMan(linkName, linkGender, linkPhone, linkPosition, linkComment);
		
		//-- 2.把联系人添加到数据库中
		return DataSet.linkManList.add(lm);
	}


	@Override
	public List<LinkMan> listLinkMans() {
		return DataSet.linkManList;
	}

	
	@Override
	public LinkMan getLinkMan(int id) {
		for (LinkMan l : DataSet.linkManList) {
			if (l.getLinkId() == id) {
				return l;
			}
		}
		return null;
	}
	

}
