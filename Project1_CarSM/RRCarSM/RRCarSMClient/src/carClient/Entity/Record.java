package carClient.Entity;

import java.io.Serializable;
/**
 * 车辆的租赁与归还所需要的字段
 * @author 李文娟
 *
 */
import java.util.Date;

public class Record implements Serializable {
	private static final long serialVersionUID = -4330522307971975280L;
	// 编号
	private int record_id;
	// 汽车名称
	private String car_number;
	// 每日租金
	private double rent;
	// 总租金
	private double payment;
	// 备注
	private String t_comments;
	// 品牌
	private String brand_name;
	// 类型
	private String category_name;
	// 借车时间
	private Date start_date;
	// 还车时间
	private Date return_date;

	/**
	 * get set
	 * 
	 * @return
	 */
	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	@Override
	public String toString() {
		return "Record [record_id=" + record_id + ", car_number=" + car_number + ", rent=" + rent + ", payment="
				+ payment + ", t_comments=" + t_comments + ", brand_name=" + brand_name + ", category_name="
				+ category_name + ", start_date=" + start_date + ", return_date=" + return_date + "]";
	}

}
