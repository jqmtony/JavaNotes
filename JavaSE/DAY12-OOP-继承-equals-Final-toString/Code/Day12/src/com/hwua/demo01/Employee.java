package com.hwua.demo01;

public class Employee extends Person{
	private String position;
	
	

	public Employee() {
		//-- ����Ĭ��ӵ�е�.������ʲô����д����ҲĬ�ϴ���.
		super();
	}

	public Employee(int age, char gender, String name,String position) {
		//-- ���ø��๹�췽��.
		//Constructor call must be the first statement in a constructor
		super(age, gender, name);
		// Alt + ���¼�ͷ
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		//-- super ���������
		return "Employee [position=" + position + 
				", toString()=" + super.toString() + "]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		//-- ��֤����������
		/*
		 * �߼�������ж�·����.�����������������.
		 * 
		 */
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		//-- ת������
		Employee e = (Employee) obj;
		
		//-- �������������ж�
		if (this.getAge() == e.getAge() && this.getGender() == e.getGender() && this.getName().equals(e.getName()) && this.getPosition().equals(e.getPosition())) {
			return true;
		}
		
		return false;
	}

	
	
	

}
