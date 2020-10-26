package g.oop.accessabilty;

import javax.swing.JFrame;

public class ApplicationWindowProgram {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame fr = new JFrame("my window");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocation(100, 100);
		fr.setSize(500, 300);
		fr.setVisible(true);
		
		Thread.sleep(1500);
		fr.setLocation(200, 100);
		Thread.sleep(500);
		fr.setLocation(300, 200);
		Thread.sleep(500);
		fr.setLocation(400, 200);

		Thread.sleep(500);
		fr.setSize(800, 500);
	}

}
