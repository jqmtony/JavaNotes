package com.hwua.view;

import com.hwua.service.CustomerService;
import com.hwua.service.impl.CustomerServiceImpl;
import com.hwua.util.InputTools;

public class AddCustomer extends View {

	public AddCustomer() {
		super("添加客户页面");
	}

	@Override
	protected View showView() {
		//-- 1.获取信息
		System.out.println("请输入客户名称");
		String custName = InputTools.next();
		System.out.println("请输入客户来源");
		String custSource = InputTools.next();
		System.out.println("请输入客户所属行业");
		String custIndustry = InputTools.next();
		System.out.println("请输入客户级别");
		int custLevel = InputTools.nextInt();
		System.out.println("请输入客户联系方式");
		String custPhone = InputTools.next();
		
		//-- 2.把信息交给Service
		CustomerService cs = new CustomerServiceImpl();
		
		//-- 3.调用Service中的方法
		boolean result = cs.insertCustomer(custName,custSource,custIndustry,custLevel,custPhone);
		
		//-- 4.根据结果来返回相应的页面
		return result ? (nextView = new MainView()) : (nextView = this);
	}

}
