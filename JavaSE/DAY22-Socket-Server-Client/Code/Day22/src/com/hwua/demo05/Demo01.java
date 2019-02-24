/**
 * 
 */
package com.hwua.demo05;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- 创建面板容器
		JFrame frame = new JFrame();
		frame.setBackground(Color.BLUE);
		frame.setLocation(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		//-- 创建一个按钮
		JButton btn = new JButton("点我呀!");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("111");
		}
	});
		
		frame.add(btn);
		frame.pack();
		frame.setVisible(true);
	}
}
