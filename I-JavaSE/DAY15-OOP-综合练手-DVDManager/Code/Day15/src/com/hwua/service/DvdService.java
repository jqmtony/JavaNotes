package com.hwua.service;

import com.hwua.bean.Dvd;

/**
 * �ڸýӿ�������Dvd���漰��ҵ��
 * 
 * @author Administrator
 *
 */
public interface DvdService {

	/**
	 * ����Dvd
	 * @param dvd
	 */
	public void insertDvd(Dvd dvd) ;
	
	
	/**
	 * ��ȡ���е�Dvd
	 */
	public void listDvds();
	
	
	/**
	 * ����DVD�ı���Ƴ�ָ����Dvd
	 * 
	 * @param  dvdID ָ��Dvd�ı��
	 * @return ���ر��Ƴ���Dvd
	 */
	public Dvd removeDvd(int dvdID);
	
}
