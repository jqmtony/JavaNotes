package com.hvua.domain.Animal;

public class Test {
	public static void main(String[] args) {
		
		// 创建对象
		Animal animal = new Animal("动物", 1, "红黄蓝绿青蓝紫");
		Pet pet1 = new Pet("宠物", 2, "红白蓝"); 
		Dog dog = new Dog("金毛", 3, "浅棕色");
		Cat cat = new Cat("扁脸猫", 4, "棕白色");
 		Rabbit rabbit = new Rabbit("小白兔", 5, "白色");
		// 输出对象
		System.out.println(animal);
		System.out.println(pet1);
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(rabbit);
		
		// 输出叫声
		animal.animalVoice();
		pet1.animalVoice();
		dog.animalVoice();
		cat.animalVoice();
		rabbit.animalVoice();
		
	}
}
