package com.hwua.demo01;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal("��������");
		//-- ��Ҫһֻè
		Cat cat = new Cat("Tom");
		Dog dog = new Dog("ʷ�ɿ�");
		Rabbit rabbit = new Rabbit("Խ����");
		
		System.out.println("---------�ö�̬����ôд��");
		
		//-- ��Ҫһֻ����
		Animal cat1 = new Cat("Tom");
		Animal dog1 = new Dog("�˹�");
		Animal rabbit1 = new Rabbit("������");
	}
}
