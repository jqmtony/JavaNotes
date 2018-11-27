package com.client.bean;

public class CarBrandCategory extends Car {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6279661583901930130L;
	private Brand brand ;
	private Category category;
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public CarBrandCategory(String carNumber, String brandId, String model, String color, String categoryId,
			String carComments, double price, double rent, int status, int useable, Brand brand, Category category) {
		super(carNumber, brandId, model, color, categoryId, carComments, price, rent, status, useable);
		this.brand = brand;
		this.category = category;
	}
	
	public CarBrandCategory() {
	}
	
}
