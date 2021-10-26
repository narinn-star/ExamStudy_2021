package chapter09;

import java.awt.*;
import javax.swing.*;

public class Ten_Color_Buttons_Frame extends JFrame {
	public Ten_Color_Buttons_Frame () {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, 
				Color.blue, Color.magenta, Color.DARK_GRAY, Color.pink, Color.gray};
		JButton[] label = new JButton[10];
		
		for(int i = 0; i < 10; i++) {
			label[i] = new JButton(Integer.toString(i));
			label[i].setBackground(color[i]);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
		
		setSize(450, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ten_Color_Buttons_Frame();
	}
}