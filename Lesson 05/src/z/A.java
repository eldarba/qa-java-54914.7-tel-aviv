package z;

public class A {
	
	static private int v1; // accessible from class only
	static int v2; // default access level - package private
	static protected int v3; // accessible to all sub classes (regardless of package)
	static public int v4; // accessible from anywhere
	
	public static void main(String[] args) {
		System.out.println(A.v1);
		System.out.println(A.v2);
		System.out.println(A.v3);
		System.out.println(A.v4);
	}

}
