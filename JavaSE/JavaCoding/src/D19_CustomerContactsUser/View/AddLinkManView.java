package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class AddLinkManView extends View {

	public AddLinkManView() {
		super("������ϵ��");
	}

	@Override
	protected View showView() {
		// ��ȡ��Ϣ
		System.out.println("������������");
		String lmName = scan.next();
		System.out.println("�������Ա�");
		String lmGender = scan.next();
		System.out.println("��������ϵ��ʽ��");
		String lmPhone = scan.next();
		System.out.println("���������ڵأ�");
		String lmPosition = scan.next();
		System.out.println("�����뱸ע��");
		String lmComment = scan.next();
		// ����Service
		LinkManService lms = new LinkManServiceImp();
		boolean addResult = lms.addLinkMan(lmName, lmGender, lmPhone,lmPosition, lmComment);
		// �Ƿ���
		if (addResult) {
			System.out.println("��ʾ���ѳɹ������ϵ��");
			nextView = new MainView();
		} else {
			System.out.println("��ʾ�����ʧ��");
			nextView = this;
		}
		return nextView;
	}

}
