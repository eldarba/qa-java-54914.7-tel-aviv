package g.oop.accessabilty;

public class Car {

	private int number;
	private int speed;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int val) {
		if (val > 100 && val <= 200) {
			number = val;
		}
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int val) {
		if (val >= 0 && val <= 180) {
			speed = val;
		}
	}
}
