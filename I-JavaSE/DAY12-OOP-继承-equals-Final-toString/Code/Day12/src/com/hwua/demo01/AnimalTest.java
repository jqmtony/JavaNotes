package com.hwua.demo01;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog1 = new Dog();//0x1
		Dog dog2 = new Dog();//0x2
		
		//-- �Ƚϵ���dog1��dog2��������Ķ��еĵ�ַ.
		//-- ��Ϊ������ռ�����ֱ��ʹ�õȵ��ǿ϶�����ȵ�.
		System.out.println(dog1 == dog2);
		int i = 0;
		int j = 0;
		//-- �ȵȱȽ��ǱȽ�ֵ.
		System.out.println(i == j);
		//-- ��һ����ȷ��Ŀ��Ҫ��: �ж����������ǲ���ͬһ������.
		//-- ����ıȽ����ʵ�����Ǹ��ݶ���������������ж�.
		//-- ���ǿ������ľ�������equals���Ƚ�����.
		
		dog1.setAge(3);
		dog1.setName("����");
		dog1.setColor("��ɫ");
		
		dog2.setAge(4);
		dog2.setName("����");
		dog2.setColor("��ɫ");
		
		System.out.println(dog1.getAge());
		System.out.println(dog1.getColor());
		System.out.println(dog1.getName());
		System.out.println(dog2.getAge());
		System.out.println(dog2.getColor());
		System.out.println(dog2.getName());
		
		
		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
		
		
		
		
		
		
		
		
	}
}
