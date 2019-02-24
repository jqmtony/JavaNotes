/**
 * 
 */
package com.hwua.service.impl;

import java.util.List;

import com.hwua.bean.LinkMan;
import com.hwua.dao.LinkManDao;
import com.hwua.dao.impl.LinkManDaoImpl;
import com.hwua.service.LinkManService;

/**
 * @author Administrator
 *
 */
public class LinkManServiceImpl implements LinkManService {

	private LinkManDao lmd;
	
	/**
	 * 
	 */
	public LinkManServiceImpl() {
		lmd = new LinkManDaoImpl();
	}
	
	@Override
	public boolean addLinkMan(String linkName, String linkGender, String linkPosition, String linkPhone,
			String linkComment) {
		return lmd.insertLinkMan(linkName,linkGender,linkPosition,linkPhone,linkComment);
	}

	
	@Override
	public List<LinkMan> getAllLinkMan() {
		return lmd.listLinkMans();
	}
	
	


	@Override
	public LinkMan getLinkManById(int id) {
		return lmd.getLinkMan(id);
	}

}
