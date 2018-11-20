package carServer.Manager;

import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Entity.User;
import carServer.Service.UserService;
import carServer.Service.Impl.UserServiceImp;
import carServer.Utils.JSONUtils;

/**
 * 获取request，调用Service>>Dao>>database并返回response
 * 
 * @author 李文娟
 *
 */
public class ServiceManager {
	UserService userService;
	CarService carService;

	public String getService(String request) throws SQLException {
		System.out.println(request);
		String[] array = request.split("#");
		String response = null;
		// 遍历request内容
		for (String string : array) {
			System.out.println(string);
		}
		switch (array[0]) {
		/**
		 * 用户服务
		 */
		case "User":
			User user;
			switch (array[1]) {
			case "Login":
				userService = new UserServiceImp();
				user = userService.loginUser(array[2], array[3]);
				System.out.println("[ServiceManager/Login返回值]\t"+user);
				// 告知用户处理结果
				if(user!=null) {
					response = "登录成功";
				}else {
					response="登录失败";
				}
				break;
			case "Register":
				userService = new UserServiceImp();
				// 整个user内容在array[2]里面，直接转为User对象
				user  =JSONUtils.JSONStringToObject(array[2], User.class);
				System.out.println("[ServiceManager/Register返回值]\t"+user);
				Boolean result = userService.registerUser(user);
				if(result==true) {
					response = "添加成功";
				}else {
					response = "添加失败";
				}
				break;
			default:
				break;
			}
		/**
		 * 汽车类
		 */
		case "Car":
			Car car;
			switch (array[1]) {
			case "ListCar":
				ArrayList<Car> listCarArray=
				break;
			case "getCarPrice":
				break;
			case "getCarCategory":
				break;
			case "getCarBrand":
				break;
			case "rentCar":
				break;
			case "returnCar":
				break;
			default:
				break;
			}
		/**
		 * 记录类，6 查看租车记录
		 */
		case "Record":
			Record record;
			switch (array[1]) {
			case "listRecord":
				break;
			case "rentCar":
				break;
			case "returnCar":
				break;
			default:
				break;
			}
		default:
			break;
	}
		// 打印response的值，预览
		System.out.println("[ServiceManger, response的值]\t"+response);
		return response;
	}

	/**
	 * 测试类
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceManager sManager = new ServiceManager();
		User user = new User(0, "testRegister", "testRegister", "female", "123", "123456", "上海", 1);
		String userRequest = JSONUtils.objectToJSONString(user);
		String string = "User#Register#"+userRequest;
		try {
			sManager.getService(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
