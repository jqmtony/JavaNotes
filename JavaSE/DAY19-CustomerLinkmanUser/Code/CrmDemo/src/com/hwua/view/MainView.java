package com.hwua.view;

import com.hwua.util.InputTools;

/**
 * 
 * @author Administrator
 *
 */
public class MainView extends View {

	public MainView() {
		super("������");
	}

	@Override
	protected View showView() {
		System.out.println("1.�鿴���пͻ�");
		System.out.println("2.���ӿͻ�");
		System.out.println("3.ɾ���ͻ�");
		System.out.println("4.�޸Ŀͻ�����ϵ��");
		System.out.println("5.�鿴������ϵ��");
		System.out.println("6.������ϵ��");
		System.out.println("7.ɾ����ϵ��");
		System.out.println("8.�޸���ϵ�˵Ŀͻ�");
		System.out.println("9.�˳�");
		//-- �����ϼ��˵���ôд!
		
		int itemChoose = InputTools.nextInt();
		switch (itemChoose) {
		case 1:
			nextView = new ShowCustomerView();
			break;
		case 2:
			nextView = new AddCustomer();
			break;
		case 3:
			break;
		case 4:
			nextView = new UpdateCustomerView();
			break;
		case 5:
			nextView = new ShowLinkManView();
			break;
		case 6:
			nextView = new AddLinkManView();
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			nextView = null;
			break;
		default:
			System.out.println("û�и�ѡ��");
			nextView = this;
			break;
		}
		
		
		return nextView;
	}

}
