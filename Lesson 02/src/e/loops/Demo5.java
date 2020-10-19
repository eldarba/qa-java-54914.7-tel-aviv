package e.loops;

public class Demo5 {

	public static void main(String[] args) {
		
		int c1 = 1;
		while(c1 <= 5) {
			
			int c2 = 1;
			while(c2 <= 9) {
				System.out.print(c2 + ", ");
				c2++;
			}
			System.out.println(c2);
			c1++;
		}
		
	}
}
