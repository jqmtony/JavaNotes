package com.hvua.domain.DAY15_implements.bean;

public class Dvd {
	private int dvdID;
	private String dvdName;
	private int dvdLendCount;
	private String dvdlendDate;
	private Boolean dvdStatus;
	
	/**
	 * get and set
	 * @return
	 */
	public int getDvdID() {
		return dvdID;
	}
	public void setDvdID(int dvdID) {
		this.dvdID = dvdID;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public int getDvdLendCount() {
		return dvdLendCount;
	}
	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}
	public String getDvdlendDate() {
		return dvdlendDate;
	}
	public void setDvdlendDate(String dvdlendDate) {
		this.dvdlendDate = dvdlendDate;
	}
	public Boolean getDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(Boolean dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	/**
	 * ���췽��
	 */
	public Dvd() {
		
	}
	// ����Ҫ����IDֵ������createDvdID�Զ�����
	public Dvd(int dvdID, String dvdName) {
		super();
		this.dvdID = dvdID;
		this.dvdName = dvdName;
		this.dvdLendCount = 0;
		this.dvdlendDate = null;
		this.dvdStatus = true;
	}
	/**
	 * ���
	 */
	@Override
	public String toString() {
		return "Dvd [dvdID=" + dvdID + ", dvdName=" + dvdName + ", "
				+ "dvdLendCount=" + dvdLendCount + ", dvdlendDate="
				+ dvdlendDate + ", dvdStatus=" + dvdStatus + "]";
	}
	

}
