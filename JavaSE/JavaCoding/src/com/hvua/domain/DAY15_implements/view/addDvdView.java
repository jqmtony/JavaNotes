package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class addDvdView extends View {

	@Override
	public View showView() {
		DvdService dvdService = new DvdServiceImpl();
		viewTools.showLine();
		System.out.println(">>>> ���DVD");
		System.out.println("�������Ӱ���ƣ�");
		String name = scan.next();
		if(dvdService.addDvd(name)) {
			System.out.println("��ʾ��������ӳɹ�");
			nextView =new mainView();
		}
		return nextView;
	}

}
