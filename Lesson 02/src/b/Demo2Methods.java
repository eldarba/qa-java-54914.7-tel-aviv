package b;

public class Demo2Methods {
	
	static int g = 100; // global
	
	public static void main(String[] args) {
		int x = sum(45, 658);
		System.out.println(x);
	}

	// define a sum method
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;
		// the parameters a, b and the variable sum are local
	}
	
	

}