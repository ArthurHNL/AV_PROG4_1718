package nl.arthurheidt.av.prog4.hipToBeSquare;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {
	private Color myColor = Color.WHITE;
	private double scaling = 1.0;
	private final static int SQUARE_SIDE = 180;
	
	public DrawPanel() {
		this.setPreferredSize(new Dimension(300, 300));
		this.setBackground(Color.WHITE);
	}
	
	public void setColor(Color c) {
		myColor = c;
	}
	
	public void setScaling(int scale) {
		scaling = 1.0 + ((double) scale) / 100;
		this.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Dimension panelSize = this.getSize();
		int panelX = panelSize.width;
		int panelY = panelSize.height;
		int scaledSquareSide = (int) (SQUARE_SIDE * scaling);
		
		int squareX = (int) ((0.5 * panelX) - (0.5 * scaledSquareSide));
		int squareY = (int) ((0.5 * panelY) - (0.5 * scaledSquareSide));
		
		g.setColor(myColor);
		g.fillRect(squareX, squareY, scaledSquareSide, scaledSquareSide);
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, scaledSquareSide, scaledSquareSide);
	}
	
	
}
