package carServer.Test;

import java.sql.SQLException;
import java.text.ParseException;

import carServer.Entity.insertCar;
import carServer.Manager.ServiceManager;
import carServer.Utils.JSONUtils;

public class managerTest {

	/**
	 * 测试类
	 * 
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		ServiceManager sManager = new ServiceManager();
		String request = "Car#ListCar";
		String request1 ="Car#getCarPrice#1";
		String request2 ="Car#getCarPrice#2";
		String request3 = "Car#getCarCategory#1"; // 输入类型的ID，提示输入
		String request4 = "Car#getCarBrand#1"; // 输入品牌的ID，提示输入
		String request5 = "Record#rentCar#4#1"; // 参数1：carId，参数2：userId
		String request6 = "Record#returnCar#4#1"; // 参数1：carId，参数2：userId
		String request7 = "Record#listRecord#1";
		String request8 = "Car#adminListCar#1";
		insertCar car = new insertCar(9, "沪CWR9347",3,"T型", "灰色",4,"1.5T", 498900.00, 798.00, 0, 0);
		String request9 = "Car#adminAddCar#"+JSONUtils.objectToJSONString(car);
		String request10 = "Car#adminUpdateCar#9#1#765";
		String request11 = "Record#adminListRecord";
		try {
			sManager.getService(request10);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
