package g.oop.accessabilty;

public class Program {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.getId());
		
//		p.id = 111;
		p.setId(50);
		System.out.println(p.getId());
		
	}

}
