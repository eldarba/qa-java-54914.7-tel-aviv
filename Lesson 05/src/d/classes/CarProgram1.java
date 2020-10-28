package d.classes;

public class CarProgram1 {

	public static void main(String[] args) {
		
		Car c1 = new Car(101);
		c1.setColor("Red");
		
		System.out.println(c1);
		
		c1.drive(250);
		c1.drive(30);

	}

}
