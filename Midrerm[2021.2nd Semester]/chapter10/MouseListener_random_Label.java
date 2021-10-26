package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListener_random_Label extends JFrame {
	public MouseListener_random_Label() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("c");
		la.setLocation(100, 100);
		la.setSize(10, 10);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*c.getSize().width);
				int y = (int)(Math.random()*c.getSize().height);
				la.setLocation(x, y);
			}
		});
		
		c.add(la);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListener_random_Label();
	}
}