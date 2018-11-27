package carClient.Entity;

import java.io.Serializable;
/**
 * ��ѯ������Ҫ���ֶ�ֵ
 * @author ���ľ�
 *
 */
public class insertCar implements Serializable{
	private static final long serialVersionUID = -4171634123367820406L;
	
	private int id;
	private String car_number;
	private String model;
	private String color;
	private String t_comments;
	private int brand_id;
	private int category_id;
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
		return "\n"+id+"\t"+"\t"+car_number+"\t"+color+model+"\t"+t_comments+"\t"+price+"\t"+rent+"\t"+status+"\t"+useable;
	}
	
	public insertCar() {
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
	// �������
	public insertCar(String car_number, int brand_id, String model, String color, int category_id, String t_comments, double price, double rent, int status, int useable) {
		super();
		this.id = 0;
		this.car_number = car_number;
		this.brand_id = brand_id;
		this.model = model;
		this.color = color;
		this.category_id = category_id;
		this.t_comments = t_comments;
		this.price = price;
		this.rent = rent;
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
