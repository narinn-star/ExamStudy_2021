package chapter09;

import java.awt.*;
import javax.swing.*;

public class Calculate_Frame extends JFrame {
	static class northP extends JPanel {
		public northP() {
			setLayout(new FlowLayout());
			JLabel input = new JLabel("수식 입력");
			JTextField tf = new JTextField(15);
			setBackground(Color.gray);
			add(input);
			add(tf);
		}
	}

	static class centerP extends JPanel {
		public centerP() {
			setLayout(new GridLayout(4, 4, 5, 5));
			String[] str = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "x", "/" };
			JButton[] btn = new JButton[16];
			
			for(int i = 0; i < 16; i++) {
				btn[i] = new JButton(str[i]);
				if(i > 11) {
					btn[i].setBackground(Color.yellow);
					btn[i].setOpaque(true);
				}
				add(btn[i]);
			}
		}
	}
	
	static class southP extends JPanel {
		public southP() {
			setLayout(new FlowLayout());
			JLabel output = new JLabel("계산 결과");
			JTextField tf2 = new JTextField(15);
			setBackground(Color.green);
			add(output);
			add(tf2);
		}
	}
	
	public Calculate_Frame() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		northP nP = new northP();
		centerP cP = new centerP();
		southP sP = new southP();
		
		c.add(nP, BorderLayout.NORTH);
		c.add(cP, BorderLayout.CENTER);
		c.add(sP, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculate_Frame();
	}

}
