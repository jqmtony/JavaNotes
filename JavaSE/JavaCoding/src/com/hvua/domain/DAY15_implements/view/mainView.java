package com.hvua.domain.DAY15_implements.view;

import java.util.InputMismatchException;
import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.DvdService;;

public class mainView extends View {

	@Override
	/**
	 * �û��ɹ���½���ҳ��
	 */
	public View showView() {
		viewTools.showLine();
		System.out.println(">>>> ��ҳ��");
		// �˵���
		System.out.println("��ӭ������");
		System.out.println("1.�鿴DVD");
		System.out.println("2.����DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("�����������ţ�");
		// �쳣����
		int chooseNum = 0;
		try {
			chooseNum = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("��ʾ�������쳣");
		}
		switch (chooseNum) {
		case DvdService.SHOW_ALL_DVD:
			nextView=new showDvdView();
			break;
		case DvdService.ADD_DVD:
			nextView=new addDvdView();
			break;
		case DvdService.DEL_DVD:
			nextView=new delDvdView();
			break;
		case DvdService.LEND_DVD:
			nextView=new lendDvdView();
			break;
		case DvdService.BACK_DVD:
			nextView=new backDvdView();
			break;
		default:
			break;
		}

		return nextView;
	}

}
