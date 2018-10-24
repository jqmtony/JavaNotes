package com.hvua.domain.D12_extends;

public class Employee extends Person{
	
	private String position;

	// �޲ι���
	public Employee() {
	}
	
	// ���в����Ĺ��췽��
	public Employee(String name, int age, String gender, String position) {
		super(name, age, gender);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public boolean equals(Object obj) {
		/**
		 *  �߼�������ж�·���󣬿����������������
		 *  �ڲ�����������������ã�System.out.println(e1.equals(e2));
		 *  ����ȣ����Ϊtrue��������ȣ����Ϊfalse
		 */
		if(obj==null || obj.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee) obj; // ת������
		
		if(this.getAge()==e.getAge() && this.getGender()==e.getGender() 
				&& this.getPosition()==e.getPosition() && this.getName()==e.getName()) {
			return true;
		}
		return false;
	}

	/**
	 * ��дtoString�������Լ���Ҫ�������ʽ�������
	 */
	public String toString() {
		return "ְλ��" + position + "\n������" + getName() + "\n���䣺" + getAge()
				+ "\n�Ա�" + getGender() + "\n------------" ;
	}


}
