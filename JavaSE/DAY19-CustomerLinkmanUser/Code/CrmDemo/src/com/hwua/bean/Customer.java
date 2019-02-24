package com.hwua.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.hwua.util.DataSet;

/**
 *   '�ͻ���
 *   	һ��ָ���ǹ�˾
 * @author Administrator
 *
 */
public class Customer implements Serializable,Comparable<Customer>{
	
	/**
	 * ���л�ID.�ṩ�Ϳ�����.�������ù�.���漰�������л�.
	 */
	private static final long serialVersionUID = 7426146831835688014L;

	/**
	 * ' �ͻ��ı��.Ψһ��ʶ�ͻ�����.
	 */
	private int custId;
	
	private String custName;
	/**
	 * �ͻ���Դ
	 */
	private String custSource;
	/**
	 * 	�ͻ���������ҵ
	 */
	private String custIndustry;
	/**
	 * �ͻ��ļ���
	 */
	private int custLevel;
	/**
	 * �ͻ�����ϵ��ʽ
	 */
	private String custPhone;	
	
	/**
	 * Ӧ����List������Set
	 * ���һ��ҵ��Կ�һ��������.��Ӧ����Set�ȽϺ�.��ΪSet�е�����Ψһ.
	 * ���һ�������˿��ԶԿڶ��ҵ��.�Ǿ���List.
	 */
	private Set<LinkMan> linkMans;
	
	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustSource() {
		return custSource;
	}

	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}

	public int getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(int custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public Set<LinkMan> getLinkMans() {
		return linkMans;
	}


	public Customer() {
		//-- ʵ������ϵ�˵ļ��϶���
		linkMans = new HashSet<>();		 
	}
	
	public Customer(String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		this();
		this.custId = DataSet.getLastCustId();
		this.custName = custName;
		this.custSource = custSource;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.custPhone = custPhone;
		
	}

	@Override
	public String toString() {
		String line = "�ͻ����:\t" + custId + "\n�ͻ�����:\t" + custName + "\n�ͻ���Դ:\t" + custSource
				+ "\n�ͻ�������ҵ:\t" + custIndustry + "\n�ͻ��ȼ�:\t" + custLevel + "\n�ͻ���ϵ��ʽ:\t" + custPhone
				+ "\n�ͻ�����ϵ��:\t";
		if (linkMans.size() == 0) {
			line  = line +"������ϵ��";
		}else {
			for (LinkMan linkMan : linkMans) {
				line = line + linkMan.toString();
			}
		}
		return  line;
	}

	/**
	 * ����Ҫ�Կͻ���������ʱҪʹ�ø÷���.
	 * 	���տͻ��ȼ���������
	 *  �ͻ�����1.compareTo(�ͻ�����2)
	 */
	@Override
	public int compareTo(Customer o) {
		return -(this.getCustLevel() - o.getCustLevel());
	}
}
