package carServer.Entity;

import java.io.Serializable;
/**
 * 查询车所需要的字段值
 * @author 李文娟
 *
 */
public class Car implements Serializable{
	private static final long serialVersionUID = -4171634123367820406L;
	
	private int id;
	private String model;
	private String t_comments;
	private String brand_name;
	private String category_name;
	// 汽车价格
	private double price;
	// 租车价格（每天）
	private double rent;
	// 是否借出：0可借，1不可借
	private int status;
	// 是否上架：0上架，1未上架
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
	 * 输出格式，也就是List<Car>的输出格式
	 */
	@Override
	public String toString() {
		return "\n"+id+"\t"+model+"\t"+t_comments+"\t"+brand_name+"\t"+category_name+"\t"+price+"\t"+rent+"\t"+status+"\t"+useable;
	}
	
	/**
	 * 有参构造
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
	public Car(int id, String model, String t_comments, String brand_name, String category_name, double price,
			double rent, int status, int useable) {
		super();
		this.id = id;
		this.model = model;
		this.t_comments = t_comments;
		this.brand_name = brand_name;
		this.category_name = category_name;
		this.price = price;
		this.rent = rent;
		this.status = status;
		this.useable = useable;
	}
}
