package com.hvua.domain.Animal;

public class Test {
	public static void main(String[] args) {
		
		// ��������
		Animal animal = new Animal("����", 1, "�������������");
		Pet pet1 = new Pet("����", 2, "�����"); 
		Dog dog = new Dog("��ë", 3, "ǳ��ɫ");
		Cat cat = new Cat("����è", 4, "�ذ�ɫ");
 		Rabbit rabbit = new Rabbit("С����", 5, "��ɫ");
		// �������
		System.out.println(animal);
		System.out.println(pet1);
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(rabbit);
		
		// �������
		animal.animalVoice();
		pet1.animalVoice();
		dog.animalVoice();
		cat.animalVoice();
		rabbit.animalVoice();
		
	}
}
