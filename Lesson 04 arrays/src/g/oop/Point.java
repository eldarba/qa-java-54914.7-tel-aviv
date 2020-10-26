package g.oop;

/*
 * a class defines the structure of future objects
 * 
 * from a class we can create many object
 * 
 * a class is like a blueprint for objects
 * */
public class Point {
	
	
	// modifier - some keyword that gives a certain feature
	// access modifiers (private, public)

	// 1. ATTRIBUTES OF A POINT
	private int x; // 0 - 100
	private int y; // 0 - 100

	// 2. CONSTRUCTORS - METHODS FOR OBJECT CREATION (DIFFER BY PARAMETERS)
	// constructor method
	Point(int a, int b) {
		setX(a);
		setY(b);
	}

	// constructor method
	Point() {

	}
	
	// get set methods - works with the attributes
	public void setX(int val) {
		if(val >= 0 && val <= 100) {
			x = val;
		}
	}
	
	public void setY(int val) {
		if(val >= 0 && val <= 100) {
			y = val;
		}
	}
	

	// 3. METHODS - WHAT THE OBJECT CAN DO
	// method definition has 1. return type 2. method name 3. method parameters

	// method for moving this point to the right
	void moveRight() {
		x++;
	}

	// method for moving this point to the left
	void moveLeft() {
		x--;
	}

	void moveUp() {
		y++;
	}

	void moveDown() {
		y--;
	}

}
