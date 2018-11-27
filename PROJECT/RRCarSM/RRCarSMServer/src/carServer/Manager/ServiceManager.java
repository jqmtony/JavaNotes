package carServer.Manager;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Entity.User;
import carServer.Entity.insertCar;
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
	ArrayList<insertCar> listInsertCarArray;
	ArrayList<Record> listRecordArray;

	public ServiceManager() {
		userService = new UserServiceImp();
		carService = new CarServiceImp();
		recordService = new RecordServiceImpl();
		listInsertCarArray = new ArrayList<>();
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
				System.out.println("[ServiceManager/Login返回值]\t" + user);
				System.out.println(user.getUserName());
				System.out.println(user != null);
				if (user.getUserName() != null) {
					response = "SUCCESS";
				} else {
					response = "FAIL";
				}
				break;
			case "adminLogin":
				user = userService.loginUser(array[2], array[3]);
				System.out.println("[ServiceManager/Login返回值]\t" + user);
				if (user != null && user.getType()==1) {
					response = "管理员登录成功";
				} else {
					response = "登录失败";
				}
				break;
			case "Register":
				userService = new UserServiceImp();
				// 整个user内容在array[2]里面，直接转为User对象
				user = JSONUtils.JSONStringToObject(array[2], User.class);
				System.out.println("[ServiceManager/Register返回值]\t" + user);
				Boolean result = userService.registerUser(user);
				if (result == true) {
					response = "添加成功";
				} else {
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
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "adminListCar":
				// 查看指定车辆：Car#adminListCar#2
				listCarArray = carService.adminListCar(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "getCarPrice":
				if (array[2].equals("1")) {
					// 顺序：Car#getCarPrice#1
					listCarArray = carService.listCarByPrice();
					response = JSONUtils.listToJSONString(listCarArray);
				} else if (array[2].equals("2")) {
					// 逆序：Car#getCarPrice#2
					listCarArray = carService.listCarByPriceDESC();
					response = JSONUtils.listToJSONString(listCarArray);
				} else {
					System.out.println("选择1按照价格[升序]排序，选择2按照价格[降序]排序！");
				}
				break;
			case "getCarCategory":
				// 按类型搜索：Car#getCarCategory#舒适型
				listCarArray = carService.listCarByCategory(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "getCarBrand":
				// 按品牌搜索：Car#getCarBrand#大众
				listCarArray = carService.listCarByBrand(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "adminAddCar":
				// 输入6 添加汽车：Car#adminAddCar#carString
				insertCar car = JSONUtils.JSONStringToObject(array[2], insertCar.class);
				if (carService.adminAddCar(car) != false) {
					System.out.println("添加成功");
					listInsertCarArray.add(car);
					response = JSONUtils.listToJSONString(listInsertCarArray);
				} else {
					System.out.println("添加失败");
				}
				break;
			case "adminUpdateCar":
				// 输入7+汽车编号+1（或2）+具体修改内容，前台直接调用adminListCar
				// Car#adminUpdateCar#1#2#0 将汽车1的useable改为0
				if (carService.adminUpdateCar(array[2], array[3], array[4]) != false) {
					for (insertCar car2 : listInsertCarArray) {
						System.out.println(car2);
					}
					response = "修改成功！";
				} else {
					response = "修改失败！";
				}
				break;
			default:
				break;
			}
			System.out.println("[控制中心打印listCarArray]");
			if (listCarArray != null) {
				for (Car string : listCarArray) {
					System.out.println(string);
				}
			} else {
				System.out.println("null");
			}
			break;
		/**
		 * 记录类，6 查看租车记录
		 */
		case "Record":
			switch (array[1]) {
			case "rentCar":
				// 租车：Car#rentCar#1(car_id)#2(user_id)
				listRecordArray = recordService.rentRecord(array[2], array[3]);
				break;
			case "returnCar":
				// 还车：Record#returnCar#2#1
				listRecordArray = recordService.returnRecord(array[2], array[3]);
				break;
			case "listRecord":
				// 查看：Record#listRecord#2(userId)
				listRecordArray = recordService.listRecord(array[2]);
				break;
			case "adminListRecord":
				// Record#adminListRecord
				listRecordArray = recordService.adminListRecord();
				break;
			default:
				break;
			}
			System.out.println("[控制中心打印listRecordArray]");
			for (Record record : listRecordArray) {
				System.out.println(record);
			}
			response = JSONUtils.listToJSONString(listRecordArray);
			break;
		default:
			break;
		}
		// 结果预览
		System.out.println("[控制中心打印response]" + response);
		return response;
	}

}
