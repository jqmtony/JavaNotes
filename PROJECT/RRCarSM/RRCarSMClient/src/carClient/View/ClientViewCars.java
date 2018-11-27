package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Receiver;

import carClient.Entity.Car;
import carClient.Entity.Record;
import carClient.Entity.User;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.ShowFormatUtils;
import carClient.Utils.getServerResponse;

/**
 * 查询页面
 * 
 * @author 李文娟
 *
 */
public class ClientViewCars extends ClientView {
	String request;
	String response;
	List<Car> listCarArray;
	List<Record> listRecordArray;

	public ClientViewCars() throws UnknownHostException, IOException {
		super("查询主界面");
		listCarArray = new ArrayList<>();
		listRecordArray = new ArrayList<>();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		String chooseFun = inputUtils.myInputString();
		String[] params = chooseFun.split("\\+");
		// 2,3,4,5 Car 1,6,7 Record
		User user = new User("admin123-", "admin123-");
		currentUser = user;
		currentUser.setUserId(1);
		currentUser.setUserName("admin123");
		System.out.println("欢迎 " + currentUser.getUserName()+"（用户ID："+currentUser.getUserId()+"）回来！");
		switch (params[0]) {
		case "0":
			nextView = new ClientWelcomeView();
			return nextView;
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
			ShowFormatUtils.showCarQueryHeader();
			break;
		// 品牌查询
		case "4":
			request = "Car#getCarBrand#" + params[1];
			ShowFormatUtils.showCarQueryHeader();
			break;
		case "5":
			request = "Car#ListCar";
			ShowFormatUtils.showCarQueryHeader();
			break;
		case "1":
			request = "Record#rentCar#" + params[1] + "#" + currentUser.getUserId();
			System.out.println("订单编号\t车牌号\t简介\t品牌名\t类型名\t每日租金\t总金额\t出借日期\t归还日期");
			break;
		case "6":
			request = "Record#listRecord#" + currentUser.getUserId();
			ShowFormatUtils.showRecordQueryHeader();
			break;
		case "7":
			request = "Record#returnCar#" + params[1] + "#" + currentUser.getUserId();
			ShowFormatUtils.showRecordQueryHeader();
			break;
		default:
			System.out.println("没有这个选项，请重新输入！");
			break;
		}
		// response
		System.out.println("[客户端发送请求] " + request);
		response = getServerResponse.getResponse(request);
		// 打印查询结果
		if (params[0].equals("2") || params[0].equals("3") || params[0].equals("4") || params[0].equals("5")) {
			listCarArray = JSONUtils.JSONStringToList(response, Car.class);
			for (Car car : listCarArray) {
				if(car.getStatus()==0&&car.getUseable()==0) {
					System.out.println(car);
				}
			}
		} else if (params[0].equals("1") || params[0].equals("6") || params[0].equals("7")) {
			listRecordArray = JSONUtils.JSONStringToList(response, Record.class);
			for (Record record : listRecordArray) {
				System.out.println(record);
			}
		}
		;
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
