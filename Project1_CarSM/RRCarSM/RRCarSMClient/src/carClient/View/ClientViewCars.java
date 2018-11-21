package carClient.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import carClient.Entity.Car;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.ShowFormatUtils;
import carClient.Utils.getServerResponse;

/**
 * ��ѯҳ�棺ListCar�������棬5 getCarPrice, 2+1,2+2 getCarCategory��3+���ͱ��
 * getCarBrand��4+Ʒ�Ʊ�� String request = "Car#ListCar"; String request1
 * ="Car#getCarPrice#1"; String request2 ="Car#getCarPrice#2"; String request3 =
 * "Car#getCarCategory#������"; String request4 = "Car#getCarBrand#����";
 * 
 * @author ���ľ�
 *
 */
public class ClientViewCars extends ClientView {
	getServerResponse getServerResponse;
	String request;
	String response;
	List<Car> listCarArray;
	public ClientViewCars() {
		super("��ѯ������");
		listCarArray = new ArrayList<>();
		getServerResponse = new getServerResponse();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		String chooseFun = InputUtils.myInputString();
		// �ж�ѡ��
		switch (chooseFun) {
		case "2+1":
			request = "Car#getCarPrice#1";
			break;
		case "2+2":
			request = "Car#getCarPrice#2";
			break;
		case "[^&3]":
			String[] carCategory = chooseFun.split("+"); 
			request = "Car#getCarCategory#"+carCategory[1];
			break;
		case "[^&4]":
			String[] carBrand = chooseFun.split("+"); 
			request = "Car#getCarBrand#"+carBrand[1];
			break;
		case "5":
			request = "Car#ListCar";
			break;
		default:
			break;
		}
		System.out.println("====[ClientViewCars]: request before socket >>"+request);
		response = getServerResponse.getResponse(request);
		listCarArray = JSONUtils.JSONStringToList(response, Car.class);
		ShowFormatUtils.showCarQueryHeader();
		System.out.println(listCarArray);
		nextView = new ClientViewCars();
		return nextView;
	}
/**
 * ����
 * @throws IOException 
 */
	public static void main(String[] args) throws IOException {
		ClientViewCars clientViewCars = new ClientViewCars();
		while(clientViewCars!=null) {
			clientViewCars.showCurrentView();
		}
	}
}
