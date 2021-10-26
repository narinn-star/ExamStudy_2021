package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseWheel_FontSize extends JFrame {
	public MouseWheel_FontSize() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		c.add(la);
		
		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int size = la.getFont().getSize();
				int n = e.getWheelRotation();
				if(n < 0 && size > 5) {
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
				else
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
			}
		});
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseWheel_FontSize();
	}
}