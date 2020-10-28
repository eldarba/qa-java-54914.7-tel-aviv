package a;

// to inherit a class use the keyword "extends"
// the inherited class should have parameterless CTOR
public class Employee extends Person {
	
	public Employee(int id, String name, int age) {
		super(id, name, age);
	}
	
	public Employee() {
	}
	
	public void work() {
		System.out.println(getName() + " is working");
	}
	
}
