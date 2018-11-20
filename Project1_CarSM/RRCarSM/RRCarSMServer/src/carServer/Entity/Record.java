package carServer.Entity;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4330522307971975280L;
	//���ޱ�ţ�Ψһ������
	private Integer id;
	//�������
	private Integer carId;
	//��������
	private String carName;
	//�û����
	private Integer userId;
	//�û�����
	private String userName;
	//ÿ�����
	private double dayprice;
	//�����
	private double totalprice;
	//��ע
	private String detail;
	//Ʒ��
	private String brand;
	//����
	private String type;
	//�賵ʱ��
	private Date fordate;
	//����ʱ��
	private Date enddate;
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getDayprice() {
		return dayprice;
	}

	public void setDayprice(double dayprice) {
		this.dayprice = dayprice;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getFordate() {
		return fordate;
	}

	public void setFordate(Date fordate) {
		this.fordate = fordate;
	}


	public Record(Integer id, Integer carId, String carName, Integer userId, String userName, double dayprice,
			double totalprice, String detail, String brand, String type, Date fordate,Date enddate) {
		super();
		this.id = id;
		this.carId = carId;
		this.carName = carName;
		this.userId = userId;
		this.userName = userName;
		this.dayprice = dayprice;
		this.totalprice = totalprice;
		this.detail = detail;
		this.brand = brand;
		this.type = type;
		this.fordate = fordate;
		this.enddate=enddate;
	}

	public Record(){
		
	}
	
}
