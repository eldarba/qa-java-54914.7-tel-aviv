package g.oop;

public class PointsPeogram3 {

	public static void main(String[] args) {
		

		// create a point object
		Point p = new Point();
		System.out.println(p.getX() + ", " + p.getY());
		
		// move the point to the right 3 times
		p.moveRight();
		p.moveRight();
		p.moveRight();
		System.out.println(p.getX() + ", " + p.getY());
		
		// move the point to the left 1 time
		p.moveLeft();
		System.out.println(p.getX() + ", " + p.getY());
	}

}
