package b.loops;

public class Demo5NestingLochKefel {

	public static void main(String[] args) {

		
		for (int i = 1; i <= 10; i++) {
			
//			if(i==6) {
//				break; // exit the loop
//			}
			
//			if(i==6) {
//				continue; // continue to next iteration
//			}
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
			
			// end of iteration
			
		}

		
	
	}

}
