package carServer.Manager;

import java.sql.SQLException;
import java.util.ArrayList;
import carServer.Entity.Car;
import carServer.Entity.User;
import carServer.Service.CarService;
import carServer.Service.UserService;
import carServer.Service.Impl.CarServiceImp;
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
	ArrayList<Car> listCarArray;
	public ServiceManager() {
		userService = new UserServiceImp();
		carService = new CarServiceImp();
	}

	public String getService(String request) throws SQLException {
		System.out.println(request);
		String[] array = request.split("#");
		String response = "====[�������Ľ���switchǰ]�� response";
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
				// ������������Car#getCarBrand#����
				listCarArray = carService.listCarByBrand(array[2]);
				break;
			case "rentCar":
				break;
			case "returnCar":
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
			case "listRecord":
				break;
			case "rentCar":
				break;
			case "returnCar":
				break;
			default:
				break;
			}
			break;
		default:
			break;
	}
		// ��ӡresponse��ֵ��Ԥ��
		System.out.println("====[��������response]\t"+response);
		return response;
	}

	/**
	 * ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceManager sManager = new ServiceManager();
		String request = "Car#ListCar";
		String request1 ="Car#getCarPrice#1";
		String request2 ="Car#getCarPrice#2";
		String request3 = "Car#getCarCategory#������";
		String request4 = "Car#getCarBrand#����";
		try {
			sManager.getService(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
