package chap03;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� �� ! >> ");
			String user = sc.next();
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			else {
				int com = (int)(Math.random()*3);
				if(user.equals(str[com]))
					System.out.println("����� = " + user + ", ��ǻ�� = "+ str[com] +", DRAW!!");
				else if((user.equals("����"))&&(str[com].equals("����")) 
						|| (user.equals("����"))&&(str[com].equals("��"))
						|| (user.equals("��")) &&(str[com].equals("����")))
					System.out.println("����� = " + user + ", ��ǻ�� = "+ str[com] +", COM �¸�");
				else if((user.equals("����"))&&(str[com].equals("����")) 
						|| (user.equals("����"))&&(str[com].equals("��"))
						|| (user.equals("��")) &&(str[com].equals("����")))
					System.out.println("����� = " + user + ", ��ǻ�� = "+ str[com] +", USER �¸�");
			}
		}
		sc.close();
	}

}
