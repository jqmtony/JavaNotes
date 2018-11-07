package SpeciesShift;

public class Test {
	public static void main(String[] args) {
		Species monkey = new Monkey();
		Species rabbit = new Rabbit(monkey);
		
		Species flies1 = new Flies(monkey);
		Species flies2 = new Flies(rabbit);
		
		Species cucumber1 = new Cucumber(monkey);
		Species cucumber2 = new Cucumber(flies1);
		Species cucumber3 = new Cucumber(flies2);
		
		System.out.println(monkey.getDescription());
		System.out.println(rabbit.getDescription());
		System.out.println(flies1.getDescription());
		System.out.println(flies2.getDescription());
		System.out.println(cucumber1.getDescription());
		System.out.println(cucumber2.getDescription());
		System.out.println(cucumber3.getDescription());
	}
}
