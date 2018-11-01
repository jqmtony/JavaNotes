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
		super("增加联系人界面");
	}

	@Override
	protected View showView() {
		System.out.println("请输入联系人姓名");
		String linkName = InputTools.next();
		System.out.println("请输入联系人性别");
		String linkGender = InputTools.next();
		System.out.println("请输入联系人职位");
		String linkPosition = InputTools.next();
		System.out.println("请输入联系人联系方式");
		String linkPhone = InputTools.next();
		System.out.println("请输入联系人备注");
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
