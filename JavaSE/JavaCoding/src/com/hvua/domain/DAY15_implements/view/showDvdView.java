package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class showDvdView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println("提示：已获取DVD预览");
		DvdService dvdService = new DvdServiceImpl();
		if (dvdService.showAll()) {
			System.out.println("提示：已结束展示");
		} else {
			System.out.println("提示：电影库中暂无数据");
		}
		nextView = new mainView();
		return nextView;
	}

}
