/**
 * 
 */
package com.hwua.view;

import java.util.List;

import com.hwua.bean.LinkMan;
import com.hwua.service.LinkManService;
import com.hwua.service.impl.LinkManServiceImpl;

/**
 * @author Administrator
 *
 */
public class ShowLinkManView extends View {

	/**
	 * @param viewName
	 */
	public ShowLinkManView() {
		super("��ʾ��ϵ�˽���");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hwua.view.View#showView()
	 */
	@Override
	protected View showView() {
		LinkManService lms = new LinkManServiceImpl();
		List<LinkMan> allLinkMan = lms.getAllLinkMan();
		if (allLinkMan == null) {
			System.out.println("��ʱû����ϵ����Ϣ!");
		} else {
			for (LinkMan linkMan : allLinkMan) {
				System.out.println(linkMan);
			}
		}
		return new MainView();
	}

}
