package com.hvua.domain.DAY15_implements.app;

import com.hvua.domain.DAY15_implements.view.View;
import com.hvua.domain.DAY15_implements.view.welcomeView;

public class main {
	public static void main(String[] args) {
		View view = new welcomeView(); // 返回下一个页面的值，然后执行下一块

		while (view != null) {
			view =view.showView(); // 调用的是当前页面的showView方法！
		}

	}
}
