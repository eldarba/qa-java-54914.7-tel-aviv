package g.oop.accessabilty;

public class CarProgram {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setNumber(101);
		c2.setNumber(102);
		
		c1.setSpeed(150);
		c2.setSpeed(180);
		
		System.out.println("c1: number=" + c1.getNumber() + ", speed=" + c1.getSpeed());
		System.out.println("c2: number=" + c2.getNumber() + ", speed=" + c2.getSpeed());
		
		

	}

}
