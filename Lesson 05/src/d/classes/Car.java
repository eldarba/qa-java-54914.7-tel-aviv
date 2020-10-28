package d.classes;

public class Car {

	// attributes
	private int number;
	private int km;
	private String color;

	// CTORs
	public Car() {
	}

	public Car(int number) {
		super();
		this.number = number;
	}

	// getters and setters (methods)
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// other methods

	@Override
	public String toString() {
		return "Car [number=" + number + ", km=" + km + ", color=" + color + "]";
	}

	public void drive(int distance) {
		System.out.println("car " + number + " starts at " + km + " km");
//		km = km + distance;
		km += distance;
		System.out.println("car " + number + " ended at " + km + " km");
	}

}
