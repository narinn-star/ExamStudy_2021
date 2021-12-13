package chapter13;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class TimerThread extends Thread {
	JLabel label;

	public TimerThread(JLabel label) {
		this.label = label;
	}

	public void run() {
		while (true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);

			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));

			label.setText(clockText);
		}

	}
}

public class No_03 extends JFrame {
	public No_03() {
		super("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Gothic", Font.ITALIC, 100));
		c.add(label, BorderLayout.CENTER);
		
		TimerThread timer = new TimerThread(label);
		timer.start();

		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new No_03();
	}
}