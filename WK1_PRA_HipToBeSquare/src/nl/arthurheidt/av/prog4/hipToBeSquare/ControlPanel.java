package nl.arthurheidt.av.prog4.hipToBeSquare;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel {
	private DrawPanel drawPanel;
	private BoxLayout layout;
	private ButtonGroup rb_group;
	private JSlider slider;
	
	public ControlPanel(DrawPanel dp) {
		drawPanel = dp;
		layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		
		String red = "Red";
		String yellow = "Yellow";
		String blue = "Blue";
		
		JRadioButton rb_red = new JRadioButton(red);
		JRadioButton rb_yellow = new JRadioButton(yellow);
		JRadioButton rb_blue = new JRadioButton(blue);
		
		rb_group = new ButtonGroup();
		rb_group.add(rb_red);
		rb_group.add(rb_yellow);
		rb_group.add(rb_blue);
		
		rb_red.addActionListener(e -> {
			setDrawPanelColor(Color.RED);
		});	
		rb_yellow.addActionListener(e -> {
			setDrawPanelColor(Color.YELLOW);
		});
		rb_blue.addActionListener(e -> {
			setDrawPanelColor(Color.BLUE);
		});
		
		this.add(rb_red);
		this.add(rb_yellow);
		this.add(rb_blue);
		
		slider = new JSlider(JSlider.VERTICAL, -50, 50, 0);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(e -> {
			drawPanel.setScaling(slider.getValue());
		});
		
		Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(-50, new JLabel("-50"));
		labelTable.put(0, new JLabel("0"));
		labelTable.put(50, new JLabel("50"));
				
		slider.setLabelTable(labelTable);
		slider.setPaintLabels(true);
		
		this.add(slider);
		
	}
	
	private void setDrawPanelColor(Color c) {
		drawPanel.setColor(c);
		drawPanel.repaint();
	}
	
}
