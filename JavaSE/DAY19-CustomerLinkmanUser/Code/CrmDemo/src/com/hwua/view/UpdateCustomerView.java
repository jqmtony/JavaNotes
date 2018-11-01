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
		super("�޸Ŀͻ�����ϵ�˽���");
	}

	/* (non-Javadoc)
	 * @see com.hwua.view.View#showView()
	 */
	@Override
	protected View showView() {

		//-- ����ϵ��Service.��ȷ��Id�Ƿ����
		LinkManService lms = new LinkManServiceImpl();
		CustomerService cs = new CustomerServiceImpl();
		LinkMan lm = null;
		//-- �õ���ϵ�˵ı��
		System.out.println("������Ҫ�󶨵���ϵ��ID");
		while(true) {			
			
			if ((lm = lms.getLinkManById(InputTools.nextInt())) != null) {
				break;
			}
			System.out.println("��Ų�������������");
		}
		
		//-- �õ��ͻ��ı��
		System.out.println("������Ҫ�󶨵Ŀͻ�ID");
		Customer cu = null;
		while(true) {			
			if ((cu = cs.getCustomerById(InputTools.nextInt())) != null) {
				break;
			}
			System.out.println("��Ų�������������");
		}
		
		System.out.println("�Ƿ������(y/n)");
		String choose = InputTools.next();
		if ("y".equalsIgnoreCase(choose)) {
			//-- ����ϵ�����ӵ��ͻ�����ϵ���б���
			cu.getLinkMans().add(lm);
		}
		return new MainView();
	}

}
