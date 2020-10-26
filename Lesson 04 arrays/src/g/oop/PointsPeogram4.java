package g.oop;

public class PointsPeogram4 {

	public static void main(String[] args) {

		// create a point object
		Point p = new Point(150, -30);
		System.out.println(p.getX() + ", " + p.getY());

//		p.x = 1500; // without validation
		p.setX(1500); // with validation
		System.out.println(p.getX() + ", " + p.getY());

	}

}
