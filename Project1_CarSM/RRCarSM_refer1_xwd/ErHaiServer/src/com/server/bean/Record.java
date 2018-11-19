package com.server.bean;

import java.io.Serializable;
import java.sql.Date;

public class Record implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4330522307971975280L;
	/**
	 * 
	 */
	private int recordId;
	/**
	 * �����û����
	 */
	private int recordUserId;
	/**
	 * ��������
	 */
	private CarBrandCategory carBrandCategory;
	/**
	 * �賵��ʼʱ��
	 */
	private Date recordStartDate;
	/**
	 * ����ʱ��
	 */
	private Date recordReturnDate;
	/**
	 * �ܽ��
	 */
	private int recordPayment;
	
	public Record() {
	}
	
	public Record(int recordId, int recordUserId, CarBrandCategory carBrandCategory, Date recordStartDate, Date recordReturnDate,
			int recordPayment) {
		super();
		this.recordId = recordId;
		this.recordUserId = recordUserId;
		this.carBrandCategory = carBrandCategory;
		this.recordStartDate = recordStartDate;
		this.recordReturnDate = recordReturnDate;
		this.recordPayment = recordPayment;
	}
	
	
	
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getRecordUserId() {
		return recordUserId;
	}
	public void setRecordUserId(int recordUserId) {
		this.recordUserId = recordUserId;
	}
	public Date getRecordStartDate() {
		return recordStartDate;
	}
	public void setRecordStartDate(Date date) {
		this.recordStartDate = date;
	}
	public Date getRecordReturnDate() {
		return recordReturnDate;
	}
	public void setRecordReturnDate(Date recordReturnDate) {
		this.recordReturnDate = recordReturnDate;
	}
	public int getRecordPayment() {
		return recordPayment;
	}
	public void setRecordPayment(int recordPayment) {
		this.recordPayment = recordPayment;
	}

	public CarBrandCategory getCarBrandCategory() {
		return carBrandCategory;
	}

	public void setCarBrandCategory(CarBrandCategory carBrandCategory) {
		this.carBrandCategory = carBrandCategory;
	}
	
	
}
