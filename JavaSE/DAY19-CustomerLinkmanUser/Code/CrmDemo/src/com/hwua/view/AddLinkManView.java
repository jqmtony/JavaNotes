/**
 * 
 */
package com.hwua.view;

import com.hwua.service.LinkManService;
import com.hwua.service.impl.LinkManServiceImpl;
import com.hwua.util.InputTools;

/**
 * @author Administrator
 *
 */
public class AddLinkManView extends View {

	/**
	 * @param viewName
	 */
	public AddLinkManView() {
		super("������ϵ�˽���");
	}

	@Override
	protected View showView() {
		System.out.println("��������ϵ������");
		String linkName = InputTools.next();
		System.out.println("��������ϵ���Ա�");
		String linkGender = InputTools.next();
		System.out.println("��������ϵ��ְλ");
		String linkPosition = InputTools.next();
		System.out.println("��������ϵ����ϵ��ʽ");
		String linkPhone = InputTools.next();
		System.out.println("��������ϵ�˱�ע");
		String linkComment = InputTools.next();
		
		LinkManService lms = new LinkManServiceImpl();
		
		boolean result = lms.addLinkMan(linkName,linkGender,linkPosition,linkPhone,linkComment);
				
		if (result) {
			nextView = new MainView();
		}else {
			nextView = this;
		}
			
		return nextView;
	}

}
