package a;

public class Engineer extends Employee {

	public Engineer() {
		super();
	}

	public Engineer(int id, String name, int age) {
		super(id, name, age);
	}
	
	// method override
	public void work() {
		System.out.println(getName() + " is working like an Engineer");
	}

}
