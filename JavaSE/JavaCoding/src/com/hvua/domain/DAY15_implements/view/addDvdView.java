package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class addDvdView extends View {

	@Override
	public View showView() {
		DvdService dvdService = new DvdServiceImpl();
		viewTools.showLine();
		System.out.println(">>>> 添加DVD");
		System.out.println("请输入电影名称：");
		String name = scan.next();
		if(dvdService.addDvd(name)) {
			System.out.println("提示：你已添加成功");
			nextView =new mainView();
		}
		return nextView;
	}

}
