package com.hwua.demo04;

public class CarFactory {
	
	public static Car createCar(String type) {
		Car car = null;
		switch (type) {
		case "tractor":
			car = Tractor.getInstance(); // car = new Tractor();
			break;

		default:
			break;
		}
		return car;
	}
	
	public static Car createCar(String type,boolean flag) {
		Car car = null;
		if (flag) {
			car = createCar(type);
			return car;
		}
		
		switch (type) {
		case "tractor":
			car = Tractor.getInstance(false);
			break;
		default:
			break;
		}
		return car;
	}
	

}
