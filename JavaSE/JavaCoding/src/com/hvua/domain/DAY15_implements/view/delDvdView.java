package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class delDvdView extends View {

	@Override
	public View showView() {
		DvdService dvdService = new DvdServiceImpl();
		viewTools.showLine();
		System.out.println(">>>> ɾ��DVD");
		System.out.println("������Ҫɾ����DVD��ţ�");
		int dvdID = 0;
		dvdID = scan.nextInt();
		if (dvdService.delDvd(dvdID)) {
			System.out.println("��ʾ����ɾ����DVD");
			nextView = new mainView();
		} else {
			System.out.println("��ʾ��ɾ��ʧ��");
			nextView = this;
		}
		return nextView;
	}
}
