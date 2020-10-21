package c.breakAndContonue;

public class Demo2 {

	public static void main(String[] args) {

		outer: for (int i = 1; i <= 100; i++) {
			
			// divides by 7
			if(i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}
			
			
			// contains 7
			int c = i;
			while(c!=0) {
				if(c%10 == 7) {
					System.out.println("BOOM");
					continue outer;
				}else {
					c = c / 10;
				}
			}
			
			
			System.out.println(i);
		}
	}

}
