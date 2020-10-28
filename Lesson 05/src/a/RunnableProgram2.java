package a;

public class RunnableProgram2 {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[5];
		
		emps[0] = new Employee(101, "Dana", 22);
		emps[1] = new Carpenter(102, "Moshe", 22);
		emps[2] = new Engineer(103, "Yosi", 22);
		emps[3] = new Employee(104, "Rina", 22);
		emps[4] = new Carpenter(105, "Mark", 22);
		
		for (int i = 0; i < emps.length; i++) {
			Employee currEmp = emps[i];
			currEmp.work(); // each employee has its form of working - polymorphism: [poly] many,  [morph] shape
		}
		
		// polymorphism is when you point to a specific object
		// with a general reference
		Person p1 = new Person();
		Person p2 = new Employee();
		Person p3 = new Carpenter();
		Person p4 = new Engineer();
		

	}

}
