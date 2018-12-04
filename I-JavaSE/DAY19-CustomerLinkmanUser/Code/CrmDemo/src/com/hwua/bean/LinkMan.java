package com.hwua.bean;

import java.io.Serializable;

import com.hwua.util.DataSet;

/**
 * '联系人 公司对外业务的负责人.
 * 
 * @author Administrator
 *
 */
public class LinkMan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3686176088193556974L;
	/**
	 * 联系人编号
	 */
	private int linkId;
	private String linkName;
	/**
	 * 联系人所属的客户的编号
	 */
	private int linkCustId;
	/**
	 * 联系人性别
	 */
	private String linkGender;
	/**
	 * 联系人联系方式
	 */
	private String linkPhone;
	/**
	 * 联系人职位
	 */
	private String linkPosition;
	/**
	 * 备注
	 */
	private String linkComment;

	public int getLinkId() {
		return linkId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public int getLinkCustId() {
		return linkCustId;
	}

	public void setLinkCustId(int linkCustId) {
		this.linkCustId = linkCustId;
	}

	public String getLinkGender() {
		return linkGender;
	}

	public void setLinkGender(String linkGender) {
		this.linkGender = linkGender;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getLinkPosition() {
		return linkPosition;
	}

	public void setLinkPosition(String linkPosition) {
		this.linkPosition = linkPosition;
	}

	public String getLinkComment() {
		return linkComment;
	}

	public void setLinkComment(String linkComment) {
		this.linkComment = linkComment;
	}

	public LinkMan(String linkName,String linkGender, String linkPhone,
			String linkPosition, String linkComment) {
		super();
		this.linkId = DataSet.getLastLinkId();
		this.linkName = linkName;
		this.linkGender = linkGender;
		this.linkPhone = linkPhone;
		this.linkPosition = linkPosition;
		this.linkComment = linkComment;
	}

	public LinkMan() {
		super();
	}

	@Override
	public String toString() {
		return "LinkMan [linkId=" + linkId + ", linkName=" + linkName + ", linkCustId=" + linkCustId + ", linkGender="
				+ linkGender + ", linkPhone=" + linkPhone + ", linkPosition=" + linkPosition + ", linkComment="
				+ linkComment + "]";
	}
}
