package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import carClient.Entity.Car;
import carClient.Entity.Record;
import carClient.Entity.insertCar;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.ShowFormatUtils;

/**
 * 管理员查询与修改页面
 * 
 * @author 李文娟
 *
 */
public class adminViewCR extends ClientView {
	List<Car> listCarArray;
	List<Record> listRecordArray;
	InputUtils inputUtils;

	public adminViewCR() throws UnknownHostException, IOException {
		super("管理页面");
		listCarArray = new ArrayList<>();
		listRecordArray = new ArrayList<>();
		inputUtils = new InputUtils();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		String chooseFun = inputUtils.myInputString();
		String[] params = chooseFun.split("\\+");
		String request = "";
		String response = "";
//		// 跳转页面先输出所有车辆
//				response = getServerResponse.getResponse("Car#ListCar");
//				for (Car car : JSONUtils.JSONStringToList(response, Car.class)) {
//					System.out.println(car);
//				}
		/**
		 * 功能模块
		 */
		switch (params[0]) {
		// 价格查询
		case "0":
			nextView = new ClientWelcomeView();
			break;
		case "2":
			switch (params[1]) {
			case "1":
				request = "Car#getCarPrice#1";
				response = getServerResponse.getResponse(request);
				break;
			case "2":
				request = "Car#getCarPrice#2";
				response = getServerResponse.getResponse(request);
				break;
			default:
				break;
			}
			break;
		// 类型查询
		case "3":
			request = "Car#getCarCategory#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		// 品牌查询
		case "4":
			request = "Car#getCarBrand#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		case "5":
			request = "Car#ListCar";
			response = getServerResponse.getResponse(request);
			break;
		case "1":
			// 输入1+汽车编号 查看制定汽车
			request = "Car#adminListCar#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		case "6":
			// 输入6 添加汽车
			insertCar car = InputUtils.adminAddCar();
			request = "Car#adminAddCar#" + JSONUtils.objectToJSONString(car);
			response = getServerResponse.getResponse(request);
			if (response != null) {
				System.out.println("添加成功！");
				ShowFormatUtils.showCarQueryHeader();
				System.out.println(car);
			} else {
				System.out.println("添加失败！");
			}
			break;
		case "7":
			// 查看汽车
			String carId = "Car#adminListCar#" + params[1];
			response = getServerResponse.getResponse(carId);
			System.out.println(JSONUtils.JSONStringToList(response, Car.class).get(0));
//			 修改内容：Car#adminUpdateCar#9（车ID）#1（租金/上下架）#（修改内容）
			String result = inputUtils.getUpdInfo();
			System.out.println("输入的内容："+result);
			request = "Car#adminUpdateCar#" + params[1] + "#" + result;
//			inputUtils.myInputString();
//			request = "Car#adminUpdateCar#1#1#444.0";
			response = getServerResponse.getResponse(request);
			if (response.equals("修改成功！")) {
				System.out.println("修改成功！");
			} else {
				System.out.println("修改失败，请重新操作！");
			}
			break;
		case "8":
			// 输入8 查看汽车记录，Record#adminListRecord
			request = "Record#adminListRecord";
			response = getServerResponse.getResponse(request);
			break;
		default:
			System.out.println("没有这个选项，请重新输入！");
			break;
		}
		// 打印查询结果
		if (params[0].equals("1") || params[0].equals("2") || params[0].equals("3") || params[0].equals("4") || params[0].equals("5")) {
			listCarArray = JSONUtils.JSONStringToList(response, Car.class);
			ShowFormatUtils.showCarQueryHeader();
			for (Car car : listCarArray) {
					System.out.println(car);
			}
		} else if (params[0].equals("8")) {
			listRecordArray = JSONUtils.JSONStringToList(response, Record.class);
			ShowFormatUtils.showRecordQueryHeader();
			for (Record record : listRecordArray) {
				System.out.println(record);
			}
		}
		// 跳转页面
		nextView = new adminViewCR();
		return nextView;
	}

	

}
