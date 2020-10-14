package d.exercise;

public class Tar4 {

	public static void main(String[] args) {
		// create a random value for a radius of a circle (2 - 7)
		// print the radius
		// print the area

		// create a random value for a radius of a circle (2 - 7)
		int r = (int) (Math.random() * 6) + 2;
		// print the radius
		System.out.println("radius: " + r);

		// print the area
//		double area = 3.14 * r * r;
//		System.out.println("area: " + area);
		
		// you can print the calculation if you don't need the area in memory
		System.out.println("area: " + 3.14 * r * r);

//		System.out.println("=======================");
//		System.out.println(Math.PI);
//		System.out.println(Math.pow(3, 5)); // 3^5

//		double area = Math.PI * Math.pow(r, 2);
	}

}
