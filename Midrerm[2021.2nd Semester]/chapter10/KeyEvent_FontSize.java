package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEvent_FontSize extends JFrame {
	public KeyEvent_FontSize() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int size = la.getFont().getSize();
				if(e.getKeyChar() == '+')
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				else if(e.getKeyCode() == KeyEvent.VK_MINUS && size > 5)
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
			}
		});
		
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEvent_FontSize();
	}
}