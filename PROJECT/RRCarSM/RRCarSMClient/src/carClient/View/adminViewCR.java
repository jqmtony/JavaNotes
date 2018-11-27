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
 * ����Ա��ѯ���޸�ҳ��
 * 
 * @author ���ľ�
 *
 */
public class adminViewCR extends ClientView {
	List<Car> listCarArray;
	List<Record> listRecordArray;
	InputUtils inputUtils;

	public adminViewCR() throws UnknownHostException, IOException {
		super("����ҳ��");
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
//		// ��תҳ����������г���
//				response = getServerResponse.getResponse("Car#ListCar");
//				for (Car car : JSONUtils.JSONStringToList(response, Car.class)) {
//					System.out.println(car);
//				}
		/**
		 * ����ģ��
		 */
		switch (params[0]) {
		// �۸��ѯ
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
		// ���Ͳ�ѯ
		case "3":
			request = "Car#getCarCategory#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		// Ʒ�Ʋ�ѯ
		case "4":
			request = "Car#getCarBrand#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		case "5":
			request = "Car#ListCar";
			response = getServerResponse.getResponse(request);
			break;
		case "1":
			// ����1+������� �鿴�ƶ�����
			request = "Car#adminListCar#" + params[1];
			response = getServerResponse.getResponse(request);
			break;
		case "6":
			// ����6 �������
			insertCar car = InputUtils.adminAddCar();
			request = "Car#adminAddCar#" + JSONUtils.objectToJSONString(car);
			response = getServerResponse.getResponse(request);
			if (response != null) {
				System.out.println("��ӳɹ���");
				ShowFormatUtils.showCarQueryHeader();
				System.out.println(car);
			} else {
				System.out.println("���ʧ�ܣ�");
			}
			break;
		case "7":
			// �鿴����
			String carId = "Car#adminListCar#" + params[1];
			response = getServerResponse.getResponse(carId);
			System.out.println(JSONUtils.JSONStringToList(response, Car.class).get(0));
//			 �޸����ݣ�Car#adminUpdateCar#9����ID��#1�����/���¼ܣ�#���޸����ݣ�
			String result = inputUtils.getUpdInfo();
			System.out.println("��������ݣ�"+result);
			request = "Car#adminUpdateCar#" + params[1] + "#" + result;
//			inputUtils.myInputString();
//			request = "Car#adminUpdateCar#1#1#444.0";
			response = getServerResponse.getResponse(request);
			if (response.equals("�޸ĳɹ���")) {
				System.out.println("�޸ĳɹ���");
			} else {
				System.out.println("�޸�ʧ�ܣ������²�����");
			}
			break;
		case "8":
			// ����8 �鿴������¼��Record#adminListRecord
			request = "Record#adminListRecord";
			response = getServerResponse.getResponse(request);
			break;
		default:
			System.out.println("û�����ѡ����������룡");
			break;
		}
		// ��ӡ��ѯ���
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
		// ��תҳ��
		nextView = new adminViewCR();
		return nextView;
	}

	

}
