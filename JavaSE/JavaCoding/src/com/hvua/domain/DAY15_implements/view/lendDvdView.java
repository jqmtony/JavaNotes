package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;

public class lendDvdView extends View {

	@Override
	public View showView() {
		// TODO Auto-generated method stub
		viewTools.showLine();
		System.out.println(">>>> 借出DVD");
		System.out.println("开发中~");
		nextView = new mainView();
		return nextView;
	}

}
