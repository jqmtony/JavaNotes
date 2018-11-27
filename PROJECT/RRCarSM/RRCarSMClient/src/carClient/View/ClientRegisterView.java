package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;

import carClient.Entity.User;
import carClient.Test.regexTest;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

/**
 * 注册页面，返回注册成功>>登录页面 or 注册失败 >>重新注册
 * 
 * @author 李文娟
 *
 */
public class ClientRegisterView extends ClientView {
	RegexUtils regexUtils;

	public ClientRegisterView() throws UnknownHostException, IOException {
		super("注册页面");
		regexUtils = new RegexUtils();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		User user = new User();
		System.out.println("是否回到欢迎页面，输入Y返回！");
		if (inputUtils.myInputString().equalsIgnoreCase("Y")) {
			nextView = new ClientWelcomeView();
		} else {
			// 获取注册信息
			user.setUserName(regexUtils.getUserName());
			user.setPassWord(regexUtils.getUserPwd());
			System.out.println("请输入性别：");
			user.setSex(inputUtils.myInputString());
			System.out.println("请输入用户编码（任意）：");
			user.setUserIdNumber(inputUtils.myInputString());
			System.out.println("请输入联系方式：");
			user.setTel(inputUtils.myInputString());
			System.out.println("请输入地址：");
			user.setAddr(inputUtils.myInputString());
			// 发送请求
			String userStr = JSONUtils.objectToJSONString(user);
			String request = "User#Register#" + userStr;
			// 获取响应
			String response = getServerResponse.getResponse(request);
			// 跳转页面
			if (response.equals("添加成功")) {
				System.out.println(response);
				nextView = new ClientLoginView();
			} else {
				System.out.println(response);
				nextView = new ClientRegisterView();
			}
		}
		return nextView;
	}

}
