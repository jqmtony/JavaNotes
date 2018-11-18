package ManagerSystem.App;

import java.sql.SQLException;

import ManagerSystem.View.View;
import ManagerSystem.View.WelcomeView;

/**
 * 通过main接收每个页面的页面跳转结果，要么跳转，要么在本页面
 * @author Administrator
 *
 */
public class main {
	public static void main(String[] args) {
		View view = new WelcomeView();
		while(view!=null) {
			try {
				view = view.showView();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
