package com.hwua.view;

import java.util.Scanner;

import com.hwua.bean.User;

/**
 * ���View��Ϊ������.
 * 	View �����н���ĸ���
 * 
 * View ֻ������ʾ.��������View�����߼���ҵ����ص�����.
 * 
 * @author Administrator
 *
 */
public abstract class View {

	/**
	 * ������һ��View����
	 */
	protected View nextView;
	
	/**
	 * ���û���¼�ɹ��󱣴��û�����.
	 */
	protected User currentUser;
	
	/**
	 * ��Ϊ�����еĽ��������Ƕ���Ҫʹ��Scanner�����ռ���¼��.�����ڸ�����
	 * ������. ������ѭ�̳о�ֱ��ӵ����
	 */
	protected Scanner scan;
	
	public View() {
		scan = new Scanner(System.in);
	}
	
	
	/**
	 * ��ʾ��ǰ��ͼ�Ľ�������
	 * @return
	 */
	public abstract View showView();
	
	
	
	
	
	
	
}




