package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class keyListener_Text extends JFrame {
	public keyListener_Text() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JTextArea area = new JTextArea();
		area.setLocation(5, 5);
		area.setSize(375, 180);
		c.add(area);

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, area.getText().length());
		slider.setPaintLabels(true); 		// �����̴� �� ����
		slider.setPaintTicks(true); 		// �����̴� ���� ����
		slider.setPaintTrack(true); 		// �����̴� Ʈ�� ����
		slider.setMajorTickSpacing(20); 	// ū ���� ���� 20���� ����
		slider.setMinorTickSpacing(5);
		slider.setLocation(5, 180);
		slider.setSize(370, 100);
		c.add(slider);
		
		area.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				String text = area.getText();
				
				if(text.length() <= 100)
					slider.setValue(text.length());
				else
					text = text.substring(0, 99);
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String text = area.getText();
				
				if(area.getText().length() <= slider.getValue())
					slider.setValue(text.length());
				else
					area.setText(text.substring(0, slider.getValue()));
			}
		});
		
		setSize(400, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new keyListener_Text();
	}
}