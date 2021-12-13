package chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MoveThread extends Thread {
	private MyPanel panel;

	public MoveThread(MyPanel panel) {
		this.panel = panel;
	}

	public void run() {
		while (true) {
			try {
				sleep(400);
				panel.repaint();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int x = (int) (Math.random() * 350);
		int y = (int) (Math.random() * 350);
		g.drawOval(x, y, 50, 50);
	}
}

public class No_02 extends JFrame {
	private MyPanel panel = new MyPanel();

	public No_02() {
		super("원을 0.5초 간격으로 랜덤하게 움직임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MoveThread th = new MoveThread(panel);
		setContentPane(panel);

		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				th.start();
			}
		});

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new No_02();
	}
}