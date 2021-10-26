package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mouse_MouseMotion_Dragged extends JFrame {
	public Mouse_MouseMotion_Dragged() {
		setTitle("드래깅동안 YELLOW 유지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.green);
		c.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.green);
			}
			
		});
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.yellow);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Mouse_MouseMotion_Dragged();
	}
}