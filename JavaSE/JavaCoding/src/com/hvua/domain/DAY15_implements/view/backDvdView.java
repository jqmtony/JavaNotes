package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;

public class backDvdView extends View {

	@Override
	public View showView() {
		// TODO Auto-generated method stub
		viewTools.showLine();
		System.out.println(">>>> �黹DVD");
		System.out.println("������~");
		nextView = new mainView();
		return nextView;
	}

}
