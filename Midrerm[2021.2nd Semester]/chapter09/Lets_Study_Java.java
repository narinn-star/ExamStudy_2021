package chapter09;

import javax.swing.*;

public class Lets_Study_Java extends JFrame {
	public Lets_Study_Java() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Lets_Study_Java();
	}
}