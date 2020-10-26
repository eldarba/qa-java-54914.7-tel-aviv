package g.oop;

public class PointsPeogram1 {

	public static void main(String[] args) {
		
		// create a primitive variable
		int x = 5;
		System.out.println(x);

		// create a complex variable - point object
		Point p = new Point(); // Point class must be defined before creating objects
		// print
		System.out.println(p.getX() + ", " + p.getY());
		// change object state
//		p.x = 5;
		p.setX(5);
//		p.y = 3;
		p.setY(3);
		// print
		System.out.println(p.getX() + ", " + p.getY());
	}

}
