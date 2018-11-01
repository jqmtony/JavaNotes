package com.hwua.view;

import java.util.Scanner;

import com.hwua.bean.User;
import com.hwua.util.ViewUtils;

/**
 * ʹ�ô�����ģ��һ�������γ���
 * 
 * 	View ��������ͼ��ĸ���.������ͼ��Ҫʹ�õ���Դ.���ǿ�����
 *  ������������.���ؼ̳�,�����ֱ��ӵ����
 * @author Administrator
 *
 */
public abstract class View {
	/**
	 * ������һ��������˭
	 */
	protected View nextView;
	protected String viewName;
	/**
	 * ��ǰ��¼���û�
	 */
	protected User currUser;
	
	protected Scanner scan;
	
	private View() {
		scan = new Scanner(System.in);
	}
	
	public View(String viewName) {
		this();
		this.viewName = viewName;
	}
	
	protected abstract View showView();
	
	/**
	 * ģ��ģʽ
	 * 	�涨���ڲ����㷨�߼�.
	 * 
	 */
	
	public final View showCurrentView() {
		ViewUtils.showHeadLine(viewName);
		return showView();
	}
}
