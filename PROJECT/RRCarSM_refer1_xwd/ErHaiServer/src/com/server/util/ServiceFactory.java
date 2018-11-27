package com.server.util;

import java.util.ArrayList;
import java.util.List;

import com.server.bean.Car;
import com.server.bean.CarBrandCategory;
import com.server.bean.Record;
import com.server.bean.User;
import com.server.service.CarService;
import com.server.service.RecordService;
import com.server.service.UserService;
import com.server.service.impl.CarServiceImpl;
import com.server.service.impl.RecordServiceImpl;
import com.server.service.impl.UserServiceImpl;

public class ServiceFactory {
	
	private static UserService us;
	private static CarService cs;
	private static RecordService rs;
	
	
	private ServiceFactory(){
		us = new UserServiceImpl();
		cs = new CarServiceImpl();
		rs = new RecordServiceImpl();
    }

    private static ServiceFactory instance;

    public static ServiceFactory getInstance(){
        if (instance == null){
            instance = new ServiceFactory();
        }
        return instance;
    }
	
	public String getService(String str)  {
		String[] array = str.split("#");
		String response = null;
		switch (array[0]) {
		case "UserService":
			User user;
			switch (array[1]) {
			case "login":
				user= us.login(array[2] , array[3]);
				response = JSONUtils.objectToJSONString(user);
				break;
			case "register":
				user = us.register(JSONUtils.JSONStringToObject(array[2], User.class));
				response = JSONUtils.objectToJSONString(user);
				break;	
			default:
				response = null;
				break;
			}
			break;
		case "CarService":
			Car car ;
			switch (array[1]) {
			case "getCarCategory":
				String[] carCategory = cs.getCarCategory();
				for (String string : carCategory) {
					response = string + "#";
				}
				break;
			case "getBrand":
				String[] brand = cs.getBrand();
				for (String string : brand) {
					response = string + "#";
				}
				break;
			case "listCar":
				ArrayList<CarBrandCategory> listCar = cs.listCar();
				response = JSONUtils.listToJSONString(listCar);
				break;
			case "addCar":
				car = cs.addCar(JSONUtils.JSONStringToObject(array[2], CarBrandCategory.class));
				response = JSONUtils.objectToJSONString(car);
				break;
			case "adminListCar":
				List<CarBrandCategory> adminListCar = cs.adminListCar();
				response = JSONUtils.listToJSONString(adminListCar);
				break;
			case "updateCarRent":
				car = cs.updateCarRent(array[2] , array[3]);
				response = JSONUtils.objectToJSONString(car);
				break;
			case "updateCarUseable":
				car = cs.updateCarUseable(array[2] , Integer.valueOf(array[3]));
				response = JSONUtils.objectToJSONString(car);
				break;
			default:
				response = null;
				break;
			}
			break;
		case "RecordService":
			Record record;
			switch (array[1]) {
			case "listRecord":
				ArrayList<Record> listRecord = rs.listRecord();
				response = JSONUtils.listToJSONString(listRecord);
				break;
			case "rentCar":
				record = rs.rentCar(JSONUtils.JSONStringToObject(array[2], Record.class));
				response = JSONUtils.objectToJSONString(record);
				break;
			case "listRecord2":
				List<Record> listRecord2 = rs.listRecord2(JSONUtils.JSONStringToObject(array[2], User.class));
				response = JSONUtils.objectToJSONString(listRecord2);
				break;
			case "returnCar":
				record = rs.returnCar(JSONUtils.JSONStringToObject(array[2], Record.class));
				response = JSONUtils.objectToJSONString(record);
				break;
			default:
				response = null;
				break;
			}
			break;
		default:
			response = null;
			break;
		}
		return response;
	}

}
