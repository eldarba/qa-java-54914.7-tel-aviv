package g.oop.accessabilty;

public class Person {
	
	// private attribute
	private int id; // 0 - 100
	
	// public get method
	public int getId() {
		return id;
	}
	
	// public set method
	public void setId(int val) {
		if(val >= 0 & val <= 100) {
			id = val;
		}
	}

}
