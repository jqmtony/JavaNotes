/**
 * 
 */
package com.hwua.service;

import java.util.List;

import com.hwua.bean.LinkMan;

/**
 * @author Administrator
 *
 */
public interface LinkManService {

	/**
	 * 添加联系人
	 * @param linkName
	 * @param linkGender
	 * @param linkPosition
	 * @param linkPhone
	 * @param linkComment
	 * @return
	 */
	boolean addLinkMan(String linkName, String linkGender, String linkPosition, String linkPhone, String linkComment);

	List<LinkMan> getAllLinkMan();

	/**
	 * @param id
	 * @return
	 */
	LinkMan getLinkManById(int id);
}
