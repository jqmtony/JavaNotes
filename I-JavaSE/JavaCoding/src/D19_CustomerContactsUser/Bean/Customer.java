package D19_CustomerContactsUser.Bean;

import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.Data;

import D19_CustomerContactsUser.Util.DataSet;

public class Customer {
	private int custId;
	private String custName;
	private String custSource;
	private String custIndustry;
	private int custLevel;
	private String custPhone;
	private Set<LinkMan> linkMans;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

	public void setLinkMans(Set<LinkMan> linkMans) {
		this.linkMans = linkMans;
	}

	public Customer() {
		linkMans=new HashSet<>();
	}

	public Customer(int custId, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		super();
		this.custId = DataSet.getLastCustomerID();
		this.custName = custName;
		this.custSource = custSource;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.custPhone = custPhone;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custSource=" + custSource
				+ ", custIndustry=" + custIndustry + ", custLevel=" + custLevel + ", custPhone=" + custPhone
				;
	}

}
