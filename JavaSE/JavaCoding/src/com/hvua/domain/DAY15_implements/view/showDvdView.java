package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;
import com.hvua.domain.DAY15_implements.serviceImpl.DvdServiceImpl;

public class showDvdView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println("��ʾ���ѻ�ȡDVDԤ��");
		DvdService dvdService = new DvdServiceImpl();
		if (dvdService.showAll()) {
			System.out.println("��ʾ���ѽ���չʾ");
		} else {
			System.out.println("��ʾ����Ӱ������������");
		}
		nextView = new mainView();
		return nextView;
	}

}
