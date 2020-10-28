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
		
		p2.speak();
		p1.speak();
		
		System.out.println("=== program ends =====");
	}

}
