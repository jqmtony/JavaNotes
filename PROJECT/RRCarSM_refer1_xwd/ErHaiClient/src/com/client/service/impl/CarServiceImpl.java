package com.client.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.client.bean.Car;
import com.client.bean.CarBrandCategory;
import com.client.service.CarService;
import com.client.util.ClientSocket;
import com.client.util.JSONUtils;

public class CarServiceImpl implements CarService {

	@Override
	public String[] getCarCategory() {
		String str = "CarService#" + "getCarCategory";
		try {
			String response = ClientSocket.getResponse(str);
			String [] responses = response.split("#");
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public String[] getBrand() {
		String str = "CarService#" + "getBrand";
	try {
		String response = ClientSocket.getResponse(str);
		String [] responses = response.split("#");
		return responses;
	} catch (IOException e) {
		e.printStackTrace();
		return null;
	}
	}

	@Override
	public ArrayList<CarBrandCategory> listCar() {
		String str = "CarService#" + "listCar";
		try {
			String response = ClientSocket.getResponse(str);
			ArrayList<CarBrandCategory> responses = (ArrayList<CarBrandCategory>) JSONUtils.JSONStringToList(response, CarBrandCategory.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CarBrandCategory addCar(Car car) {
		String str = "CarService#" + "addCar#" + JSONUtils.objectToJSONString(car);
		try {
			String response = ClientSocket.getResponse(str);
			CarBrandCategory responses = (CarBrandCategory) JSONUtils.JSONStringToList(response, CarBrandCategory.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<CarBrandCategory> adminListCar() {
		String str = "CarService#" + "adminListCar#" ;
		try {
			String response = ClientSocket.getResponse(str);
			ArrayList<CarBrandCategory> responses = (ArrayList<CarBrandCategory>) JSONUtils.JSONStringToList(response, CarBrandCategory.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CarBrandCategory updateCarRent(String carId, String change) {
		String str = "CarService#" + "updateCarRent#" +carId+"#"+change;
		try {
			String response = ClientSocket.getResponse(str);
			CarBrandCategory responses = (CarBrandCategory) JSONUtils.JSONStringToList(response, CarBrandCategory.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CarBrandCategory updateCarUseable(String carId, int useable) {
		String str = "CarService#" + "updateCarUseable#" +carId+"#"+useable;
		try {
			String response = ClientSocket.getResponse(str);
			CarBrandCategory responses = (CarBrandCategory) JSONUtils.JSONStringToList(response, CarBrandCategory.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
