package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEvent_Left_Change extends JFrame {
	public KeyEvent_Left_Change() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		StringBuffer sb = new StringBuffer("Love Java");
		JLabel la = new JLabel("Love Java");
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					la.setText(sb.reverse().toString());
				}
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		c.add(la);
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEvent_Left_Change();
	}
}