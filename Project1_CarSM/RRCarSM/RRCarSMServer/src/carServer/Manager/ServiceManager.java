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
	ArrayList<Record> listRecordArray;
	
	public ServiceManager() {
		userService = new UserServiceImp();
		carService = new CarServiceImp();
		recordService = new RecordServiceImpl();
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
				System.out.println("[ServiceManager/Login����ֵ]\t"+user);
				if(user!=null) {
					response = "��¼�ɹ�";
				}else {
					response="��¼ʧ��";
				}
				break;
			case "Register":
				userService = new UserServiceImp();
				// ����user������array[2]���棬ֱ��תΪUser����
				user  =JSONUtils.JSONStringToObject(array[2], User.class);
				System.out.println("[ServiceManager/Register����ֵ]\t"+user);
				Boolean result = userService.registerUser(user);
				if(result==true) {
					response = "��ӳɹ�";
				}else {
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
				break;
			case "getCarPrice":
				if(array[2].equals("1")) {
					// ˳��Car#getCarPrice#1
					listCarArray = carService.listCarByPrice();
				}else if(array[2].equals("2")) {
					// ����Car#getCarPrice#2
					listCarArray = carService.listCarByPriceDESC();
				}else {
					System.out.println("ѡ��1���ռ۸�[����]����ѡ��2���ռ۸�[����]����");
				}
				break;
			case "getCarCategory":
				// ������������Car#getCarCategory#������
				listCarArray = carService.listCarByCategory(array[2]);
				break;
			case "getCarBrand":
				// ��Ʒ��������Car#getCarBrand#����
				listCarArray = carService.listCarByBrand(array[2]);
				break;
			default:
				break;
			}
			System.out.println("====[�������Ĵ�ӡlistCarArray]"+listCarArray);
			response = JSONUtils.listToJSONString(listCarArray);
			break;
		/**
		 * ��¼�࣬6 �鿴�⳵��¼
		 */
		case "Record":
			switch (array[1]) {
			case "rentCar":
				// �⳵��Car#rentCar#1(car_id)#2(user_id)
				listRecordArray = recordService.rentCar(array[2],array[3]);
				break;
			case "returnCar":
				// ������Record#returnCar#2#1
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
		// ��ӡresponse��ֵ��Ԥ��
		System.out.println("====[��������response]\t"+listRecordArray);
		response = JSONUtils.listToJSONString(listRecordArray);
		return response;
	}

	/**
	 * ������
	 * 
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		ServiceManager sManager = new ServiceManager();
		String request = "Car#ListCar";
		String request1 ="Car#getCarPrice#1";
		String request2 ="Car#getCarPrice#2";
		String request3 = "Car#getCarCategory#������";
		String request4 = "Car#getCarBrand#����";
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
