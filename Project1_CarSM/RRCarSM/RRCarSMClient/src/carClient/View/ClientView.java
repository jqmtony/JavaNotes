package carClient.View;

import carClient.Entity.User;
import carClient.Utils.ClientRequestAndResponse;
import carClient.Utils.ShowFormatUtils;

/**
 * ����View�Ĺ�ͬ���ԣ�Ϊ��ʡ�¶�
 * 
 * @author ���ľ�
 *
 */
public abstract class ClientView {
	protected String viewName;
	protected ClientRequestAndResponse clientRequestAndResponse;
	/**
	 * ����ҳ����Ϣ
	 */
	public ClientView(String viewName) {
		this.viewName = viewName;
		showHeader();
		ShowFormatUtils.showClientMenu();
	}

	public void showHeader() {
		System.out.println("======" + viewName + "======>>>>");
	}

	/**
	 * չʾ��ǰҳ�沢������һ��ҳ��
	 */
	public abstract ClientView showCurrentView();

	public ClientView nextView;
	/**
	 * �û�һ����¼������ҳ��ɻ������Ϣ�����
	 */
	protected User currentUser;

	
}
