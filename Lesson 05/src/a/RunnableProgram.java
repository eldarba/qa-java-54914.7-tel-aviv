package a;

public class RunnableProgram {

	/*
	 * main method turns the class
	 * 
	 * into a runnable program 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("=== program starts ===");
		
		Person p1 = new Person(101, "Dan", 25);
		Person p2 = new Person(102, "Ronit", 27);
		Employee e1 = new Employee(103, "Oved", 32);
		Employee e2 = new Employee(104, "Yafa", 32);
		Engineer eng1 = new Engineer(201, "Dina", 40);
		Engineer eng2 = new Engineer(202, "Moshe", 40);
		Carpenter c = new Carpenter(301, "Dan HaNager", 33);
		
		p2.speak();
		p1.speak();
		e1.speak();
		e1.work(); // standard work
//		p1.work();
		eng1.work(); // work like engineer
		e2.work();
		eng2.work(); // work like engineer
		c.work();
		
		System.out.println("=== program ends =====");
	}

}
