package ManagerSystem.View;

import java.sql.SQLException;

import ManagerSystem.Domain.User;

public abstract class View {
	/**
	 * �вι��죬ǿ���������������ڳ�ʼ��ʱ�����ǰҳ������
	 */
	private String viewName;

	public View(String viewName) {
		this.viewName = viewName;
		showHeader();
	}

	private void showHeader() {
		System.out.println(">>>>>>>>>>>>>>" + viewName);
	}

	/**
	 * ҳ��������showView����ִ��
	 * @throws SQLException 
	 */
	public abstract View showView() throws SQLException;

	/**
	 * ��תҳ��ͨ��return nextViewʵ��
	 */
	protected View nextView;
	/**
	 * ��ǰ�û���֮����Ҫ�ṩ����Ϊ����ҳ����ͨ�ģ����¼�˾Ϳ��Է������е�ҳ��
	 *
	 */
	protected User currentUser;
}
