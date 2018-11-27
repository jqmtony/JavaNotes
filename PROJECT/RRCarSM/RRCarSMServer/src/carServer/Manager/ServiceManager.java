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
 * ��ȡrequest������Service>>Dao>>database������response
 * 
 * @author ���ľ�
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
		String response = "[ ��������׼�����빦���ж� ]";
		switch (array[0]) {
		/**
		 * �û�����
		 */
		case "User":
			User user;
			switch (array[1]) {
			case "Login":
				user = userService.loginUser(array[2], array[3]);
				System.out.println("[ServiceManager/Login����ֵ]\t" + user);
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
				System.out.println("[ServiceManager/Login����ֵ]\t" + user);
				if (user != null && user.getType()==1) {
					response = "����Ա��¼�ɹ�";
				} else {
					response = "��¼ʧ��";
				}
				break;
			case "Register":
				userService = new UserServiceImp();
				// ����user������array[2]���棬ֱ��תΪUser����
				user = JSONUtils.JSONStringToObject(array[2], User.class);
				System.out.println("[ServiceManager/Register����ֵ]\t" + user);
				Boolean result = userService.registerUser(user);
				if (result == true) {
					response = "��ӳɹ�";
				} else {
					response = "���ʧ��";
				}
				break;
			default:
				break;
			}
			break;
		/**
		 * ������
		 */
		case "Car":
			switch (array[1]) {
			// �鿴���г�����Car#ListCar
			case "ListCar":
				listCarArray = carService.listCar();
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "adminListCar":
				// �鿴ָ��������Car#adminListCar#2
				listCarArray = carService.adminListCar(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "getCarPrice":
				if (array[2].equals("1")) {
					// ˳��Car#getCarPrice#1
					listCarArray = carService.listCarByPrice();
					response = JSONUtils.listToJSONString(listCarArray);
				} else if (array[2].equals("2")) {
					// ����Car#getCarPrice#2
					listCarArray = carService.listCarByPriceDESC();
					response = JSONUtils.listToJSONString(listCarArray);
				} else {
					System.out.println("ѡ��1���ռ۸�[����]����ѡ��2���ռ۸�[����]����");
				}
				break;
			case "getCarCategory":
				// ������������Car#getCarCategory#������
				listCarArray = carService.listCarByCategory(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "getCarBrand":
				// ��Ʒ��������Car#getCarBrand#����
				listCarArray = carService.listCarByBrand(array[2]);
				response = JSONUtils.listToJSONString(listCarArray);
				break;
			case "adminAddCar":
				// ����6 ���������Car#adminAddCar#carString
				insertCar car = JSONUtils.JSONStringToObject(array[2], insertCar.class);
				if (carService.adminAddCar(car) != false) {
					System.out.println("��ӳɹ�");
					listInsertCarArray.add(car);
					response = JSONUtils.listToJSONString(listInsertCarArray);
				} else {
					System.out.println("���ʧ��");
				}
				break;
			case "adminUpdateCar":
				// ����7+�������+1����2��+�����޸����ݣ�ǰֱ̨�ӵ���adminListCar
				// Car#adminUpdateCar#1#2#0 ������1��useable��Ϊ0
				if (carService.adminUpdateCar(array[2], array[3], array[4]) != false) {
					for (insertCar car2 : listInsertCarArray) {
						System.out.println(car2);
					}
					response = "�޸ĳɹ���";
				} else {
					response = "�޸�ʧ�ܣ�";
				}
				break;
			default:
				break;
			}
			System.out.println("[�������Ĵ�ӡlistCarArray]");
			if (listCarArray != null) {
				for (Car string : listCarArray) {
					System.out.println(string);
				}
			} else {
				System.out.println("null");
			}
			break;
		/**
		 * ��¼�࣬6 �鿴�⳵��¼
		 */
		case "Record":
			switch (array[1]) {
			case "rentCar":
				// �⳵��Car#rentCar#1(car_id)#2(user_id)
				listRecordArray = recordService.rentRecord(array[2], array[3]);
				break;
			case "returnCar":
				// ������Record#returnCar#2#1
				listRecordArray = recordService.returnRecord(array[2], array[3]);
				break;
			case "listRecord":
				// �鿴��Record#listRecord#2(userId)
				listRecordArray = recordService.listRecord(array[2]);
				break;
			case "adminListRecord":
				// Record#adminListRecord
				listRecordArray = recordService.adminListRecord();
				break;
			default:
				break;
			}
			System.out.println("[�������Ĵ�ӡlistRecordArray]");
			for (Record record : listRecordArray) {
				System.out.println(record);
			}
			response = JSONUtils.listToJSONString(listRecordArray);
			break;
		default:
			break;
		}
		// ���Ԥ��
		System.out.println("[�������Ĵ�ӡresponse]" + response);
		return response;
	}

}
