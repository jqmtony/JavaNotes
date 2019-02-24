package com.hwua.view;

import com.hwua.service.CustomerService;
import com.hwua.service.impl.CustomerServiceImpl;
import com.hwua.util.InputTools;

public class AddCustomer extends View {

	public AddCustomer() {
		super("��ӿͻ�ҳ��");
	}

	@Override
	protected View showView() {
		//-- 1.��ȡ��Ϣ
		System.out.println("������ͻ�����");
		String custName = InputTools.next();
		System.out.println("������ͻ���Դ");
		String custSource = InputTools.next();
		System.out.println("������ͻ�������ҵ");
		String custIndustry = InputTools.next();
		System.out.println("������ͻ�����");
		int custLevel = InputTools.nextInt();
		System.out.println("������ͻ���ϵ��ʽ");
		String custPhone = InputTools.next();
		
		//-- 2.����Ϣ����Service
		CustomerService cs = new CustomerServiceImpl();
		
		//-- 3.����Service�еķ���
		boolean result = cs.insertCustomer(custName,custSource,custIndustry,custLevel,custPhone);
		
		//-- 4.���ݽ����������Ӧ��ҳ��
		return result ? (nextView = new MainView()) : (nextView = this);
	}

}
