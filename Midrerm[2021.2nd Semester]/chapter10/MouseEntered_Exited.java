package chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEntered_Exited extends JFrame {
	public MouseEntered_Exited() {
		setTitle("���콺 �ø��� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("�����");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("Love Java");
			}
		});
		
		c.add(label);
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEntered_Exited();
	}
}