package com.hvua.domain.DAY15_implements.app;

import com.hvua.domain.DAY15_implements.view.View;
import com.hvua.domain.DAY15_implements.view.welcomeView;

public class main {
	public static void main(String[] args) {
		View view = new welcomeView(); // ������һ��ҳ���ֵ��Ȼ��ִ����һ��

		while (view != null) {
			view =view.showView(); // ���õ��ǵ�ǰҳ���showView������
		}

	}
}
