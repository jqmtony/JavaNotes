package com.hwua.demo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = null;
		//--  �ѿ��ܻ�����쳣�Ĵ���ŵ�try��
		try {
			System.out.println("Enter Number:");	
			//-- ����һ���������쳣.��ֱ�ӽ�����֮��Ӧ��catchģ��.
			//-- try��ʣ�������ǲ���ִ�е�.
			//-- ���û����֮��Ӧ��catch����Exception.�����Exception���Ҳ���
			//-- ��ֱ�ӰѴ����׳�
			scan.nextInt();
			System.out.println(str.length());
		}catch (InputMismatchException e)  {
			System.out.println("������1");
		}catch (NullPointerException e) {
			System.out.println("������2");
		}catch (Exception e) {
			System.out.println("������3");
		}
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
	}
}
