package d.arrays;

public class Demo2 {

	public static void main(String[] args) {

		// a class of 25 students. each student has a grade (0 - 100)

		int[] grades = new int[25];

		for (int i = 0; i < grades.length; i++) {
			int g = (int) (Math.random()*101);
			grades[i] = g; 
			System.out.println(grades[i]);
		}
		
		

	}

}
