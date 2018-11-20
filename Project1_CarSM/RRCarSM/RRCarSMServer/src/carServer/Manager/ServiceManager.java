package carServer.Manager;

import java.sql.SQLException;
import java.util.ArrayList;

import carServer.Entity.Car;
import carServer.Entity.Record;
import carServer.Entity.User;
import carServer.Service.UserService;
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

	public String getService(String request) throws SQLException {
		System.out.println(request);
		String[] array = request.split("#");
		String response = null;
		// ����request����
		for (String string : array) {
			System.out.println(string);
		}
		switch (array[0]) {
		/**
		 * �û�����
		 */
		case "User":
			User user;
			switch (array[1]) {
			case "Login":
				userService = new UserServiceImp();
				user = userService.loginUser(array[2], array[3]);
				System.out.println("[ServiceManager/Login����ֵ]\t"+user);
				// ��֪�û�������
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
		/**
		 * ������
		 */
		case "Car":
			Car car;
			switch (array[1]) {
			case "ListCar":
				ArrayList<Car> listCarArray=
				break;
			case "getCarPrice":
				break;
			case "getCarCategory":
				break;
			case "getCarBrand":
				break;
			case "rentCar":
				break;
			case "returnCar":
				break;
			default:
				break;
			}
		/**
		 * ��¼�࣬6 �鿴�⳵��¼
		 */
		case "Record":
			Record record;
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
		default:
			break;
	}
		// ��ӡresponse��ֵ��Ԥ��
		System.out.println("[ServiceManger, response��ֵ]\t"+response);
		return response;
	}

	/**
	 * ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceManager sManager = new ServiceManager();
		User user = new User(0, "testRegister", "testRegister", "female", "123", "123456", "�Ϻ�", 1);
		String userRequest = JSONUtils.objectToJSONString(user);
		String string = "User#Register#"+userRequest;
		try {
			sManager.getService(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
