package d.classes;

public class RectangleProgram1 {

	public static void main(String[] args) {
		
		Rectangle[] arr = new Rectangle[5];
		
		for (int i = 0; i < arr.length; i++) {
			int length = (int) (Math.random()*8) + 3;
			int width = (int) (Math.random()*8) + 3;
			arr[i] = new Rectangle(length, width);
			
			System.out.println(i + ") " + arr[i] + " area:\t" + arr[i].getArea());
		}

	}

}
