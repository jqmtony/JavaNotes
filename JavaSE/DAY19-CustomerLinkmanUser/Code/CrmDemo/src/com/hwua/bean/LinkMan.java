package com.hwua.bean;

import java.io.Serializable;

import com.hwua.util.DataSet;

/**
 * '��ϵ�� ��˾����ҵ��ĸ�����.
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
	 * ��ϵ�˱��
	 */
	private int linkId;
	private String linkName;
	/**
	 * ��ϵ�������Ŀͻ��ı��
	 */
	private int linkCustId;
	/**
	 * ��ϵ���Ա�
	 */
	private String linkGender;
	/**
	 * ��ϵ����ϵ��ʽ
	 */
	private String linkPhone;
	/**
	 * ��ϵ��ְλ
	 */
	private String linkPosition;
	/**
	 * ��ע
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
