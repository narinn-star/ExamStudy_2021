package chapter09;

import java.awt.*;
import javax.swing.*;

public class Color_Frame extends JFrame {
	public Color_Frame() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		Color[] color = { Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.magenta, 
				Color.gray, Color.pink, Color.LIGHT_GRAY, Color.white, Color.DARK_GRAY, Color.black, Color.orange,
				Color.blue, Color.magenta };
		JLabel[] label = new JLabel[16];
		
		for(int i = 0; i < 16; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setBackground(color[i]);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
		
		setSize(700, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Color_Frame();
	}
}