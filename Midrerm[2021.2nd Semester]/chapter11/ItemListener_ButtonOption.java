package chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemListener_ButtonOption extends JFrame {
	public ItemListener_ButtonOption() {
		setTitle("CheckBox Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox box1 = new JCheckBox("버튼 비활성화");
		JCheckBox box2 = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");
		
		box1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(box1.isSelected())
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
				
			}
		});
		
		box2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(box2.isSelected())
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		c.add(box1);
		c.add(box2);
		c.add(btn);
		
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ItemListener_ButtonOption();
	}
}