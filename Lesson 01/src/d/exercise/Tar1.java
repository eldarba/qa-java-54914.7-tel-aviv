package d.exercise;

public class Tar1 {

	// create 5 random numbers in the range 0 - 100
	// print the numbers
	// print the numbers sum
	// print the numbers average

	public static void main(String[] args) {
		// create 5 random numbers in the range 0 - 100

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 101);
		int e = (int) (Math.random() * 101);

		// print the numbers
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);

		// print the numbers sum
		int sum = a + b + c + d + e;
		System.out.println("sum: " + sum);

		// print the numbers average
		double avg = sum / 5D;
		System.out.println("average: " + avg);
	}

}
