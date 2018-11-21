package carClient.View;

import java.io.IOException;

import carClient.Entity.User;
import carClient.Utils.ShowFormatUtils;
import carClient.Utils.getServerResponse;

/**
 * ����View�Ĺ�ͬ���ԣ�Ϊ��ʡ�¶�
 * 
 * @author ���ľ�
 *
 */
public abstract class ClientView {
	protected String viewName;
	protected getServerResponse getServerResponse;
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
	 * @throws IOException 
	 */
	public abstract ClientView showCurrentView() throws IOException;

	public ClientView nextView;
	/**
	 * �û�һ����¼������ҳ��ɻ������Ϣ�����
	 */
	protected User currentUser;
	/**
	 * ����Socket
	 */
	
}
