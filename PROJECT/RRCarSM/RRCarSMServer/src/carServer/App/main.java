package carServer.App;

import carServer.Utils.ServerPool;

/**
 * ִ�к󣬷�������ʼ����
 * 
 * @author ���ľ�
 *
 */
public class main {
	public static void main(String[] args) {
		ServerPool serverPool = new ServerPool();
		serverPool.start();
	}
}
