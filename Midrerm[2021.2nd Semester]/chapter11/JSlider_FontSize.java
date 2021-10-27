package chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSlider_FontSize extends JFrame {
	public JSlider_FontSize() {
		setTitle("JSlider Practic Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 1, 100, 56);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setPaintLabels(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		
		JLabel la = new JLabel("I Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, sl.getValue()));
		
		sl.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				la.setFont(new Font("Arial", Font.PLAIN, sl.getValue()));
			}
		});
		
		c.add(sl, BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSlider_FontSize();
	}
}