package com.hwua.demo02;

import java.sql.Connection;

import com.hwua.utils.JDBCUtils;

public class Test {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 30; i++) {
				Connection connection = JDBCUtils.getConnection();
				System.out.println("µÚ" + (i+1) + ":\t" + connection.toString());
				//connection.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
