package b;

public class Demo1LocalGlobal {
	
	static int y = 1500; // global variable - is defined in the class scope
	
	public static void main(String[] args) {
		
		int x = 500; // local variable - is defined in the method scope
		
		System.out.println(x);
		System.out.println(y);
		
		int theSum = sum(7, 4);
		System.out.println(theSum);
		
	}
	
	public static void anotherMethod(int a) {
//		System.out.println(x); // x is local to main only 
		System.out.println(y);
		System.out.println(a);
	}

	// method declaration
	static int sum (int a, int b) {
		int sum = a+b;
		return sum;
	}

}
