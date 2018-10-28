package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class delDvdView extends View {

	@Override
	public View showView() {
		DvdService dvdService = new DvdServiceImpl();
		viewTools.showLine();
		System.out.println(">>>> 删除DVD");
		System.out.println("请输入要删除的DVD序号：");
		int dvdID = 0;
		dvdID = scan.nextInt();
		if (dvdService.delDvd(dvdID)) {
			System.out.println("提示：已删除该DVD");
			nextView = new mainView();
		} else {
			System.out.println("提示：删除失败");
			nextView = this;
		}
		return nextView;
	}
}
