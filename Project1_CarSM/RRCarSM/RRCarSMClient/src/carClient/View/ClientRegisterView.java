package carClient.View;

import java.io.IOException;

import carClient.Entity.User;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

/**
 * 注册页面，返回注册成功>>登录页面 or 注册失败 >>重新注册
 * @author 李文娟
 *
 */
public class ClientRegisterView extends ClientView {

	public ClientRegisterView( ) {
		super("注册页面");
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		User user = new User();
		// 获取注册信息
		user.setUserName(RegexUtils.getUserName());
		user.setPassWord(RegexUtils.getUserPwd());
		System.out.println("请输入性别：");
		user.setSex(InputUtils.myInputString());
		System.out.println("请输入用户编码（任意）：");
		user.setUserIdNumber(InputUtils.myInputString());
		System.out.println("请输入联系方式：");
		user.setTel(InputUtils.myInputString());
		System.out.println("请输入地址：");
		user.setAddr(InputUtils.myInputString());
		// 发送请求
		String userStr = JSONUtils.objectToJSONString(user);
		String request = "User#Register#"+userStr;
		// 获取响应
		getServerResponse getServerResponse = new getServerResponse();
		String response = getServerResponse.getResponse(request);
		// 跳转页面
		if(response.equals("添加成功")) {
			System.out.println(response);
			nextView = new ClientLoginView();
		}else {
			System.out.println(response);
			nextView = new ClientRegisterView();
		}
		return nextView;
	}

}
