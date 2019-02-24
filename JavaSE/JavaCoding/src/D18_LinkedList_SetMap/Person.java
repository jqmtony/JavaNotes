package D18_LinkedList_SetMap;

public class Person implements Comparable<Person> {

	private int id;
	private int age;
	private String name;

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Person() {
		super();
	}

}
