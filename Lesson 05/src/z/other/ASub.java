package z.other;

import z.A;

public class ASub extends A {
	
	public static void main(String[] args) {
		// System.out.println(A.v1); // private
		// System.out.println(A.v2); // default
		System.out.println(A.v3); // protected (sub classes)
		System.out.println(A.v4); // public
	}

}
