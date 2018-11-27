package carClient.View;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import carClient.Entity.User;
import carClient.Utils.InputUtils;
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
	protected InputUtils inputUtils;
	protected static getServerResponse getServerResponse;
	protected static Socket socket;
	static {
		try {
			socket = new Socket("127.0.0.1", 2222);
			getServerResponse = new getServerResponse(socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ����ҳ����Ϣ
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public ClientView(String viewName) throws UnknownHostException, IOException {
		this.viewName = viewName;
		showHeader();
		if(viewName.equals("����ҳ��")||viewName.equals("����Ա��½")){
			ShowFormatUtils.showAdminMenu();
		}else {
			ShowFormatUtils.showClientMenu();
		}
		inputUtils = new InputUtils();
	}

	public void showHeader() {
		System.out.println("\n****************************" + viewName + "****************************");
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
