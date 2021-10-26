package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEvent_Left_Move extends JFrame {
	static String str = "Love Java";
	
	public KeyEvent_Left_Move() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel(str);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String tmp = str.substring(0, 1);
					str = str.substring(1) + tmp;
					la.setText(str);
				}
			}
		});
		
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEvent_Left_Move();
	}
}