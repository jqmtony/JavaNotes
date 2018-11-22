package carServer.Manager;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Entity.User;
import carServer.Service.CarService;
import carServer.Service.RecordService;
import carServer.Service.UserService;
import carServer.Service.Impl.CarServiceImp;
import carServer.Service.Impl.RecordServiceImpl;
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
	RecordService recordService;
	
	ArrayList<Car> listCarArray;
	ArrayList<Record> listRecordArray;
	
	public ServiceManager() {
		userService = new UserServiceImp();
		carService = new CarServiceImp();
		recordService = new RecordServiceImpl();
	}

	public String getService(String request) throws SQLException, ParseException {
		System.out.println(request);
		String[] array = request.split("#");
		String response = "[ 服务器：准备进入功能判断 ]";
		switch (array[0]) {
		/**
		 * 用户服务
		 */
		case "User":
			User user;
			switch (array[1]) {
			case "Login":
				user = userService.loginUser(array[2], array[3]);
				System.out.println("[ServiceManager/Login返回值]\t"+user);
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
			break;
		/**
		 * 汽车类
		 */
		case "Car":
			switch (array[1]) {
			// 查看所有车辆：Car#ListCar
			case "ListCar":
				listCarArray = carService.listCar();
				break;
			case "getCarPrice":
				if(array[2].equals("1")) {
					// 顺序：Car#getCarPrice#1
					listCarArray = carService.listCarByPrice();
				}else if(array[2].equals("2")) {
					// 逆序：Car#getCarPrice#2
					listCarArray = carService.listCarByPriceDESC();
				}else {
					System.out.println("选择1按照价格[升序]排序，选择2按照价格[降序]排序！");
				}
				break;
			case "getCarCategory":
				// 按类型搜索：Car#getCarCategory#舒适型
				listCarArray = carService.listCarByCategory(array[2]);
				break;
			case "getCarBrand":
				// 按品牌搜索：Car#getCarBrand#大众
				listCarArray = carService.listCarByBrand(array[2]);
				break;
			default:
				break;
			}
			System.out.println("====[控制中心打印listCarArray]"+listCarArray);
			response = JSONUtils.listToJSONString(listCarArray);
			break;
		/**
		 * 记录类，6 查看租车记录
		 */
		case "Record":
			switch (array[1]) {
			case "rentCar":
				// 租车：Car#rentCar#1(car_id)#2(user_id)
				listRecordArray = recordService.rentCar(array[2],array[3]);
				break;
			case "returnCar":
				// 还车：Record#returnCar#2#1
				listRecordArray = recordService.returnCar(array[2],array[3]);
				break;
			case "listRecord":
				break;
			default:
				break;
			}
			break;
		default:
			break;
	}
		// 打印response的值，预览
		System.out.println("====[控制中心response]\t"+listRecordArray);
		response = JSONUtils.listToJSONString(listRecordArray);
		return response;
	}

	/**
	 * 测试类
	 * 
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		ServiceManager sManager = new ServiceManager();
		String request = "Car#ListCar";
		String request1 ="Car#getCarPrice#1";
		String request2 ="Car#getCarPrice#2";
		String request3 = "Car#getCarCategory#舒适型";
		String request4 = "Car#getCarBrand#大众";
		String request5 = "Record#rentCar#2#1";
		String request6 = "Record#returnCar#2#1";
		try {
			sManager.getService(request5);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
