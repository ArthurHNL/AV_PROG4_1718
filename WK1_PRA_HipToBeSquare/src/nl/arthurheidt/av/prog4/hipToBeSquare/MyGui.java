package nl.arthurheidt.av.prog4.hipToBeSquare;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGui extends JFrame {
	public MyGui() {
		this.setTitle("Hip to be Square!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(new MyContentPane());
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
		
	
}
