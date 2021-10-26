package chapter09;

import java.awt.*;
import javax.swing.*;

public class Random_Labels extends JFrame {
	public Random_Labels() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel[] label = new JLabel[20];
		
		for(int i = 0; i < 20; i++) {
			int la = (int)(Math.random()*20);
			label[i] = new JLabel(Integer.toString(la));
			
			int x = (int)(Math.random()*200 + 50);
			int y = (int)(Math.random()*200 + 50);
			label[i].setLocation(x, y);
			label[i].setBackground(Color.green);
			label[i].setSize(20, 20);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Random_Labels();
	}
}