package com.server.app;

import com.server.util.ServerPool;
/**
 * ����˵���������
 * @author Administrator
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ServerPool sp = new ServerPool();
		sp.start();
	}
}
