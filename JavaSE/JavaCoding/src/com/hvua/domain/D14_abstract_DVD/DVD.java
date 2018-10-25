package com.hvua.domain.D14_abstract_DVD;

public class DVD {
	private int id;
	private String name;
	private int lendCount;
	private String lendDate;
	private String status;

	/**
	 * 构造方法
	 */
	public DVD() {
	}

	public DVD(int id, String name, int lendCount, String lendDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.lendCount = lendCount;
		this.lendDate = lendDate;
		this.status = status;
	}

	/**
	 * getter and setter
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLendCount() {
		return lendCount;
	}

	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 输出格式
	 */

	@Override
	public String toString() {
		return "序号：" + id + "，名字：" + name + "，出借次数：" + lendCount + 
				"，出借日期：" + lendDate + "，当前状态："+ status;
	}

}
