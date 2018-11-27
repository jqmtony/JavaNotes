package carServer.Entity;

import java.io.Serializable;
/**
 * ��ѯ������Ҫ���ֶ�ֵ
 * @author ���ľ�
 *
 */
public class Car implements Serializable{
	private static final long serialVersionUID = -4171634123367820406L;
	
	private int id;
	private String car_number;
	private String model;
	private String color;
	private String t_comments;
	private int brand_id;
	private int category_id;
	private String brand_name;
	private String category_name;
	// �����۸�
	private double price;
	// �⳵�۸�ÿ�죩
	private double rent;
	// �Ƿ�����0�ɽ裬1���ɽ�
	private int status;
	// �Ƿ��ϼܣ�0�ϼܣ�1δ�ϼ�
	private int useable;
	
	/**
	 * get set
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getT_comments() {
		return t_comments;
	}
	public void setT_comments(String t_comments) {
		this.t_comments = t_comments;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * �����ʽ��Ҳ����List<Car>�������ʽ
	 */
	@Override
	public String toString() {
		return id+"\t"+model+"\t"+t_comments+"\t"+brand_name+"\t"+category_name+"\t"+price+"\t"+rent+"\t"+status+"\t"+useable;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * �вι���
	 * @param id
	 * @param model
	 * @param t_comments
	 * @param brand_name
	 * @param category_name
	 * @param price
	 * @param rent
	 * @param status
	 * @param useable
	 */
	// ��ѯ
	public Car(int id,String model, String t_comments, String brand_name, String category_name, Double price, Double rent, int status, int useable ) {
		this.id = id;
		this.t_comments = t_comments;
		this.model = model;
		this.brand_name = brand_name;
		this.category_name = category_name;
		this.price = price;
		this.rent =rent;
		this.status = status;
		this.useable = useable;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
}
