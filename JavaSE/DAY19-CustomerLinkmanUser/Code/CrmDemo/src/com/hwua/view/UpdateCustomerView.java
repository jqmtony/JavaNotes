/**
 * 
 */
package com.hwua.view;

import com.hwua.bean.Customer;
import com.hwua.bean.LinkMan;
import com.hwua.service.CustomerService;
import com.hwua.service.LinkManService;
import com.hwua.service.impl.CustomerServiceImpl;
import com.hwua.service.impl.LinkManServiceImpl;
import com.hwua.util.InputTools;

/**
 * @author Administrator
 *
 */
public class UpdateCustomerView extends View {

	/**
	 * @param viewName
	 */
	public UpdateCustomerView() {
		super("修改客户的联系人界面");
	}

	/* (non-Javadoc)
	 * @see com.hwua.view.View#showView()
	 */
	@Override
	protected View showView() {

		//-- 找联系的Service.来确认Id是否存在
		LinkManService lms = new LinkManServiceImpl();
		CustomerService cs = new CustomerServiceImpl();
		LinkMan lm = null;
		//-- 拿到联系人的编号
		System.out.println("请输入要绑定的联系人ID");
		while(true) {			
			
			if ((lm = lms.getLinkManById(InputTools.nextInt())) != null) {
				break;
			}
			System.out.println("编号不存在重新输入");
		}
		
		//-- 拿到客户的编号
		System.out.println("请输入要绑定的客户ID");
		Customer cu = null;
		while(true) {			
			if ((cu = cs.getCustomerById(InputTools.nextInt())) != null) {
				break;
			}
			System.out.println("编号不存在重新输入");
		}
		
		System.out.println("是否继续绑定(y/n)");
		String choose = InputTools.next();
		if ("y".equalsIgnoreCase(choose)) {
			//-- 被联系编号添加到客户的联系人列表中
			cu.getLinkMans().add(lm);
		}
		return new MainView();
	}

}
