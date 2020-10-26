package g.oop;

/*
 * a class defines the structure of future objects
 * 
 * from a class we can create many object
 * 
 * a class is like a blueprint for objects
 * */
public class Point {

	// 1. ATTRIBUTES OF A POINT
	int x;
	int y;

	// 2. CONSTRUCTORS - METHODS FOR OBJECT CREATION (DIFFER BY PARAMETERS)
	// constructor method
	Point(int a, int b) {
		x = a;
		y = b;
	}

	// constructor method
	Point() {

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
	

}
