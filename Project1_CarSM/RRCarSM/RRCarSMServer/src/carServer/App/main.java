package carServer.App;

import carServer.Utils.ServerRequestAndReponse;

/**
 * ִ�к󣬷�������ʼ����
 * @author ���ľ�
 *
 */
public class main {
	public static void main(String[] args) {
		ServerRequestAndReponse myServer=new ServerRequestAndReponse();
		myServer.startServer(3333);
	}
}
