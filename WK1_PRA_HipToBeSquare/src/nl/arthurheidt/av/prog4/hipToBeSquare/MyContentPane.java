package nl.arthurheidt.av.prog4.hipToBeSquare;

import java.awt.BorderLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyContentPane extends JPanel {

	public MyContentPane() {
		DrawPanel dp = new DrawPanel();
		ControlPanel cp = new ControlPanel(dp);
		
		this.setLayout(new BorderLayout());
		this.add(dp, BorderLayout.CENTER);
		this.add(cp, BorderLayout.LINE_END);
	}
	
}
