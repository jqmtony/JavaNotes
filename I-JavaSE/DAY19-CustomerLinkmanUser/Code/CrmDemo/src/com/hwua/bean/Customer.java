package com.hwua.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.hwua.util.DataSet;

/**
 *   '客户类
 *   	一般指的是公司
 * @author Administrator
 *
 */
public class Customer implements Serializable,Comparable<Customer>{
	
	/**
	 * 序列化ID.提供就可以了.其它不用管.这涉及到反序列化.
	 */
	private static final long serialVersionUID = 7426146831835688014L;

	/**
	 * ' 客户的编号.唯一标识客户存在.
	 */
	private int custId;
	
	private String custName;
	/**
	 * 客户来源
	 */
	private String custSource;
	/**
	 * 	客户的所属行业
	 */
	private String custIndustry;
	/**
	 * 客户的级别
	 */
	private int custLevel;
	/**
	 * 客户的联系方式
	 */
	private String custPhone;	
	
	/**
	 * 应该用List还是用Set
	 * 如果一个业务对口一个负责人.那应该用Set比较好.因为Set中的数据唯一.
	 * 如果一个负责人可以对口多个业务.那就用List.
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
		//-- 实例化联系人的集合对象
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
		String line = "客户编号:\t" + custId + "\n客户名称:\t" + custName + "\n客户来源:\t" + custSource
				+ "\n客户所属行业:\t" + custIndustry + "\n客户等级:\t" + custLevel + "\n客户联系方式:\t" + custPhone
				+ "\n客户的联系人:\t";
		if (linkMans.size() == 0) {
			line  = line +"暂无联系人";
		}else {
			for (LinkMan linkMan : linkMans) {
				line = line + linkMan.toString();
			}
		}
		return  line;
	}

	/**
	 * 当需要对客户进行排序时要使用该方法.
	 * 	按照客户等级降序排序
	 *  客户对象1.compareTo(客户对象2)
	 */
	@Override
	public int compareTo(Customer o) {
		return -(this.getCustLevel() - o.getCustLevel());
	}
}
