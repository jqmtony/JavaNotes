package ManagerSystem.View;

import ManagerSystem.Utils.InputUtils;

public class WelcomeView extends View {
	/**
	 * ����ҳ��϶����޲ι��죬ͨ��super��ֵ����viewName
	 */
	public WelcomeView() {
		super("��ӭҳ��");
	}

	/**
	 * ʵ�ֻ�ӭҳ��Ĺ��ܣ��������ݴ���Service 1. ��¼�������¼���ɹ�����תע�ᣬ�ɹ�����ת������
	 * 2.ע�ᣬ���ע��ɹ�����ת��¼��ִ�е�¼������߼�
	 */
	@Override
	public View showView() {
		int chooseNum = 0;
		// ����������ݲ�����Ҫ����쳣����������ж�
		while(true) {
			System.out.println("1.��¼ 2.ע��");
			chooseNum = InputUtils.nextInt();
			switch (chooseNum) {
			case 1:
				nextView =new LoginView();
				break;
			case 2:
				nextView = new RegisterView();
				break;
			default:
				System.out.println("û�и�ѡ����������룡");
				continue;
			}
			break;
		}
		return nextView;
	}

}
