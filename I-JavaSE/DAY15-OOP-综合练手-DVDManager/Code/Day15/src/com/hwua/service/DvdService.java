package com.hwua.service;

import com.hwua.bean.Dvd;

/**
 * 在该接口中声明Dvd所涉及的业务
 * 
 * @author Administrator
 *
 */
public interface DvdService {

	/**
	 * 新增Dvd
	 * @param dvd
	 */
	public void insertDvd(Dvd dvd) ;
	
	
	/**
	 * 获取所有的Dvd
	 */
	public void listDvds();
	
	
	/**
	 * 根据DVD的编号移除指定的Dvd
	 * 
	 * @param  dvdID 指定Dvd的编号
	 * @return 返回被移除的Dvd
	 */
	public Dvd removeDvd(int dvdID);
	
}
