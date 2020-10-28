package a;

public class Carpenter extends Employee {

	public Carpenter() {
		super();
	}

	public Carpenter(int id, String name, int age) {
		super(id, name, age);
	}
	
	@Override
	public void work() {
		System.out.println(getName() + " is working with wood");
	}

}
