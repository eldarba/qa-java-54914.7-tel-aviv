package b.arrays.dimentions;

public class Demo1 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[10][3];
		matrix[4][0] = 100; // assign 100 to 1st grade of 5th student
		
		// 1. assign some grades:
		// student 0 grade 2 ==> 75
		// student 2 grade 0 ==> 80
		// student 9 grade 2 ==> 75
		// student 7 grade 1 ==> 83
		
		matrix[0][2] = 75;
		matrix[2][0] = 80;
		matrix[9][2] = 75;
		matrix[7][1] = 83;
		
		// 2. print the grades you gave
		System.out.println(matrix[0][2]);
		System.out.println(matrix[2][0]);
		System.out.println(matrix[9][2]);
		System.out.println(matrix[7][1]);
		
		
		System.out.println("===");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ",\t");
			}
			System.out.println();
		}
		
		

	}

}
