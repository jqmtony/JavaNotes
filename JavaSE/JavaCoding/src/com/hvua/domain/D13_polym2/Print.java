package com.hvua.domain.D13_polym2;

public class Print extends School{
	private String type;
	
	public Print(String type) {  // ��ӡ�Ǻڰ׵Ļ��ǲ�ɫ��
		super(type);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void printStu(Student student) {
//		System.out.println("*****��ע�⣬��ѡ��Ĵ�ӡ����Ϊ��"+getType());
		if(student.getClass()==Student.class) {
			System.out.println(student.toString());
		}else {
			System.out.println("��ӡ�������");
		}
	}

}
