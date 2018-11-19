package com.server.app;

import com.server.util.ServerPool;
/**
 * 服务端的启动程序
 * @author Administrator
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ServerPool sp = new ServerPool();
		sp.start();
	}
}
