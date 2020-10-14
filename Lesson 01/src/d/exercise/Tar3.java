package d.exercise;

public class Tar3 {

	public static void main(String[] args) {

		// create 2 random numbers in the range 5 - 20
		// the numbers are the sides of a rectangle
		// print the sides
		// length: 9
		// width: 3

		// print the area
		// print the perimeter

		// create 2 random numbers in the range 0 - 10
		int length = (int) (Math.random() * 16) + 5;
		int width = (int) (Math.random() * 16) + 5;

		// print the sides
		System.out.println("length: " + length);
		System.out.println("width: " + width);

		// print the area
		int area = length * width;
		System.out.println("area: " + area);

		// print the perimeter
		int perimeter = 2 * length + 2 * width;
		System.out.println("perimeter: " + perimeter);
	}

}
