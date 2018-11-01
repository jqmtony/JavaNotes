/**
 * 
 */
package com.hwua.dao;

import java.util.List;

import com.hwua.bean.LinkMan;

/**
 * @author Administrator
 *
 */
public interface LinkManDao {

	/**
	 * @param linkName
	 * @param linkGender
	 * @param linkPosition
	 * @param linkPhone
	 * @param linkComment
	 * @return
	 */
	boolean insertLinkMan(String linkName, String linkGender, String linkPosition, String linkPhone,
			String linkComment);
	
	/**
	 * 获取所有的联系人
	 * @return
	 */
	List<LinkMan> listLinkMans();

	/**
	 * @param id
	 * @return
	 */
	LinkMan getLinkMan(int id);

}
