package carServer.App;

import carServer.Utils.ServerRequestAndReponse;

/**
 * 执行后，服务器开始运行
 * @author 李文娟
 *
 */
public class main {
	public static void main(String[] args) {
		ServerRequestAndReponse myServer=new ServerRequestAndReponse();
		myServer.startServer(3333);
	}
}
