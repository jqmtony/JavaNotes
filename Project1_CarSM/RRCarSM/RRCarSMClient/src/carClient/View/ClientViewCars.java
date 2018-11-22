package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import carClient.Entity.Car;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.ShowFormatUtils;
import carClient.Utils.getServerResponse;

/**
 * 查询页面：ListCar，主界面，5 getCarPrice, 2+1,2+2 getCarCategory，3+类型编号
 * getCarBrand，4+品牌编号 String request = "Car#ListCar"; String request1
 * ="Car#getCarPrice#1"; String request2 ="Car#getCarPrice#2"; String request3 =
 * "Car#getCarCategory#舒适型"; String request4 = "Car#getCarBrand#大众";
 * 
 * @author 李文娟
 *
 */
public class ClientViewCars extends ClientView {
	getServerResponse getServerResponse;
	String request;
	String response;
	List<Car> listCarArray;

	public ClientViewCars() throws UnknownHostException, IOException {
		super("查询主界面");
		listCarArray = new ArrayList<>();
		getServerResponse = new getServerResponse();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		String chooseFun = InputUtils.myInputString();
		String[] params = chooseFun.split("\\+");
		switch (params[0]) {
		// 价格查询
		case "2":
			switch (params[1]) {
			case "1":
				request = "Car#getCarPrice#1";
				break;
			case "2":
				request = "Car#getCarPrice#2";
				break;
			default:
				break;
			}
			break;
		// 类型查询
		case "3":
  			request = "Car#getCarCategory#" + params[1];
			break;
		// 品牌查询
		case "4":
			request = "Car#getCarBrand#" + params[1];
			break;
		case "5":
			request = "Car#ListCar";
			break;
		default:
			break;
		}
		System.out.println("====[ClientViewCars]: request before socket >>" + request);
		response = getServerResponse.getResponse(request);
		listCarArray = JSONUtils.JSONStringToList(response, Car.class);
		// 打印查询结果
		ShowFormatUtils.showCarQueryHeader();
		System.out.println(listCarArray);
		// 跳转页面
		nextView = new ClientViewCars();
		return nextView;
	}

	/**
	 * 测试
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ClientViewCars clientViewCars = new ClientViewCars();
		while (clientViewCars != null) {
			clientViewCars.showCurrentView();
		}
	}
}
