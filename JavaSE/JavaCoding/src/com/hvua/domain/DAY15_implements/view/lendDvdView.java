package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;

public class lendDvdView extends View {

	@Override
	public View showView() {
		// TODO Auto-generated method stub
		viewTools.showLine();
		System.out.println(">>>> ���DVD");
		System.out.println("������~");
		nextView = new mainView();
		return nextView;
	}

}
