package chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextField_JComboBox extends JFrame {
	public JTextField_JComboBox() {
		setTitle("JTextField and JComboBox Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(10);
		JComboBox<String> box = new JComboBox<>();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				box.addItem(input);
				tf.setText("");
			}
		});
		
		c.add(tf);
		c.add(box);
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextField_JComboBox();
	}
}