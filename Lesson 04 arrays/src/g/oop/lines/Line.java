package g.oop.lines;

public class Line {
	
	private int length;
	
	public Line(int length) {
		setLength(length);
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void print() {
		// keyword "this" is a reference to the currently executed object
		for (int i = 0; i < this.length; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	

}
