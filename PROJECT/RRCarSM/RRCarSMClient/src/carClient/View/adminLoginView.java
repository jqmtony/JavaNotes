package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import carClient.Entity.User;
import carClient.Utils.RegexUtils;

/**
 * 实现管理员登陆
 * 
 * @author 李文娟
 *
 */
public class adminLoginView extends ClientView {
	User user = new User();
	RegexUtils regexUtils = new RegexUtils();
	
	public adminLoginView() throws UnknownHostException, IOException {
		super("管理员登陆");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// 登陆input
		
		while(true) {
			System.out.println("1. 登陆 2. 退出");
			int choose1 = inputUtils.myInputInt();
			// 登陆
			if(choose1==1) {
				user.setUserName(regexUtils.getUserName());
				user.setPassWord(regexUtils.getUserPwd());
				// 发送请求
				String request = "User#adminLogin#" + user.getUserName() + "#" + user.getPassWord();
				// 获取响应
				String response = getServerResponse.getResponse(request);
				// 判断管理员身份
				if (response.equals("管理员登录成功")) {
					currentUser = user;
					System.out.println(response);
					// 进入管理页面
					nextView = new adminViewCR();
					break;
				} else {
					System.out.println(response+"！请重新输入！");
				}
			}else if(choose1==2 ) {
				// 退出
				nextView = new ClientWelcomeView();
				break;
			}
		}
		
		return nextView;
	}

}
