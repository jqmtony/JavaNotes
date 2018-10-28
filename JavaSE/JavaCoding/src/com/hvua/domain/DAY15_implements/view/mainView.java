package com.hvua.domain.DAY15_implements.view;

import java.util.InputMismatchException;
import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;;

public class mainView extends View {

	@Override
	/**
	 * 用户成功登陆后的页面
	 */
	public View showView() {
		viewTools.showLine();
		System.out.println(">>>> 主页面");
		// 菜单栏
		System.out.println("欢迎回来！");
		System.out.println("1.查看DVD");
		System.out.println("2.增加DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("请输入操作序号：");
		// 异常处理
		int chooseNum = 0;
		try {
			chooseNum = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("提示：输入异常");
		}
		switch (chooseNum) {
		case DvdService.SHOW_ALL_DVD:
			nextView=new showDvdView();
			break;
		case DvdService.ADD_DVD:
			nextView=new addDvdView();
			break;
		case DvdService.DEL_DVD:
			nextView=new delDvdView();
			break;
		case DvdService.LEND_DVD:
			nextView=new lendDvdView();
			break;
		case DvdService.BACK_DVD:
			nextView=new backDvdView();
			break;
		default:
			break;
		}

		return nextView;
	}

}
