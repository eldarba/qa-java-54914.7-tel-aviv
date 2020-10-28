package d.classes;

public class Location {

	private int x;
	private int y;

	public Location(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("************************************************");
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = 0; i < x; i++) {
			System.out.print("    ");
		}
		System.out.println("X");
	}

}
