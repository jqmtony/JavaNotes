package com.hvua.domain.D14_abstract;

public class vehicleTest {
	public static void main(String[] args) {
		Vehicle tractor = new Tractor();
		Vehicle truck = new Truck();
		Vehicle saloon = new Saloon();
		Vehicle vehicle = new Vehicle() {

			@Override
			public void run() {
				System.out.println("≥ÈœÛ¿‡");
			}
		};
		tractor.run();
		truck.run();
		saloon.run();
		vehicle.run();
	}
}
