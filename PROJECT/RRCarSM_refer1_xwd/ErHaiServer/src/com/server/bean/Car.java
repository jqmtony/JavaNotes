package com.server.bean;

import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4171634123367820406L;
	/**
	 * 汽车编号
	 */
	private String carId;
	/**
	 * 车牌号
	 */
    private String carNumber;
    /**
     * 品牌编号
     */
    private String brandId;
    /**
     * 汽车名称
     */
    private String model;
    /**
     * 汽车颜色
     */
    private String color;
    /**
     * 类别编号
     */
    private String categoryId;
    /**
     * 汽车简介
     */
    private String carComments;
    /**
     * 汽车市场价
     */
    private double price;
    /**
     * 汽车每日租金
     */
    private double rent;
    /**
     * 汽车状态
     */
    private int status;
    /**
     * 汽车是否上架
     */
    private int useable;
	
    public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCarComments() {
		return carComments;
	}
	public void setCarComments(String carComments) {
		this.carComments = carComments;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUseable() {
		return useable;
	}
	public void setUseable(int useable) {
		this.useable = useable;
	}
	public Car(String carId, String carNumber, String brandId, String model, String color, String categoryId,
			String carComments, double price, double rent, int status, int useable) {
		this.carId = carId;
		this.carNumber = carNumber;
		this.brandId = brandId;
		this.model = model;
		this.color = color;
		this.categoryId = categoryId;
		this.carComments = carComments;
		this.price = price;
		this.rent = rent;
		this.status = status;
		this.useable = useable;
	}
	public Car() {
	}
	
	@Override
	public String toString() {
		return carId + "\t" + carNumber + "\t" + brandId + "\t" + model
				+ "\t" + color + "\t" + categoryId + "\t" + carComments + "\t"
				+ price + "\t" + rent + "\t" + status + "\t" + useable ;
	}
    
    
}
