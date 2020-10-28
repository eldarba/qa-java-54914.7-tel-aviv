package a;

public class Person {

	// attributes (fields)
	private int id;
	private String name;
	private int age;

	// CTOR
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// methods
	public void speak() {
		System.out.println(this.name + " is speaking");
	}

	// get/set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
