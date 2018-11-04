package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class AddLinkManView extends View {

	public AddLinkManView() {
		super("增加联系人");
	}

	@Override
	protected View showView() {
		// 获取信息
		System.out.println("请输入姓名：");
		String lmName = scan.next();
		System.out.println("请输入性别：");
		String lmGender = scan.next();
		System.out.println("请输入联系方式：");
		String lmPhone = scan.next();
		System.out.println("请输入所在地：");
		String lmPosition = scan.next();
		System.out.println("请输入备注：");
		String lmComment = scan.next();
		// 传入Service
		LinkManService lms = new LinkManServiceImp();
		boolean addResult = lms.addLinkMan(lmName, lmGender, lmPhone,lmPosition, lmComment);
		// 是否传入
		if (addResult) {
			System.out.println("提示：已成功添加联系人");
			nextView = new MainView();
		} else {
			System.out.println("提示：添加失败");
			nextView = this;
		}
		return nextView;
	}

}
