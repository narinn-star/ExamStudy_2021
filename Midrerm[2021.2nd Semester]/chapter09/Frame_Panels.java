package chapter09;

import java.awt.*;
import javax.swing.*;

public class Frame_Panels extends JFrame {
	public Frame_Panels() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel northP = new JPanel();
		JPanel centerP = new JPanel();
		JPanel southP = new JPanel();
		
		c.add(northP, BorderLayout.NORTH);
		c.add(centerP, BorderLayout.CENTER);
		c.add(southP, BorderLayout.SOUTH);
		
		northP.setBackground(Color.gray);
		northP.setLayout(new FlowLayout());
		northP.add(new JButton("열기"));
		northP.add(new JButton("닫기"));
		northP.add(new JButton("나가기"));
		
		centerP.setLayout(null);
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			JLabel la = new JLabel("*");
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setForeground(Color.red);
			centerP.add(la);
		}
		
		southP.setLayout(new FlowLayout());
		southP.setBackground(Color.green);
		southP.add(new JButton("Word Input"));
		southP.add(new TextField(15));
		
		
		setSize(300, 300 );
		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame_Panels();
	}
}