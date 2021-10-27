package chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSlider_Value extends JFrame {
	public JSlider_Value() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 100, 200, 128);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setPaintLabels(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(0);
		
		JLabel la = new JLabel(Integer.toString(sl.getValue()));
		la.setOpaque(true);
		la.setBackground(Color.green);
		
		sl.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int val = sl.getValue();
				la.setText(Integer.toString(val));
			}
		});
		
		c.add(la);
		c.add(sl);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSlider_Value();
	}
}