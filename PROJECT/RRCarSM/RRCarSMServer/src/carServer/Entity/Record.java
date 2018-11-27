package carServer.Entity;

import java.io.Serializable;
/**
 * ������������黹����Ҫ���ֶ�
 * @author ���ľ�
 *
 */
import java.util.Date;

public class Record implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ���
	private int record_id;
	// ��������
	private String car_number;
	// ÿ�����
	private double rent;
	// �����
	private double payment;
	// ��ע
	private String t_comments;
	// Ʒ��
	private String brand_name;
	// ����
	private String category_name;
	// �賵ʱ��
	private Date start_date;
	// ����ʱ��
	private Date return_date;


	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
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

	/**
	 * �вι���
	 * @param record_id
	 * @param car_number
	 * @param rent
	 * @param payment
	 * @param t_comments
	 * @param brand_name
	 * @param category_name
	 * @param start_date
	 * @param return_date
	 */
	public Record(int record_id, String car_number, double rent, double payment, String t_comments, String brand_name,
			String category_name, Date start_date, Date return_date) {
		super();
		this.record_id = record_id;
		this.car_number = car_number;
		this.rent = rent;
		this.payment = payment;
		this.t_comments = t_comments;
		this.brand_name = brand_name;
		this.category_name = category_name;
		this.start_date = start_date;
		this.return_date = return_date;
	}

	@Override
	public String toString() {
//		System.out.println("�������\t���ƺ�\t���\tƷ����\t������\tÿ�����\t�ܽ��\t��������\t\t�黹����");
		return record_id +"\t"+ car_number +"\t"+ t_comments +"\t"+ brand_name+"\t"+ category_name+"\t"+ rent +"\t"+ payment +"\t"+ start_date +"\t"+ return_date;
	}

}
