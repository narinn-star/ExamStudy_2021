package chap02;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� (1~12) _ (if) >> ");
		int month = sc.nextInt();

		if (month == 3 || month == 4 || month == 5)
			System.out.println("��");
		else if (month == 6 || month == 7 || month == 8)
			System.out.println("����");
		else if (month == 9 || month == 10 || month == 11)
			System.out.println("����");
		else if (month == 12 || month == 1 || month == 2)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		///////////////////////////////////////////////////////
		///////////////////////////////////////////////////////
		System.out.print("���� �Է��ϼ��� (1~12) _ (switch) >> ");
		int month2 = sc.nextInt();

		switch (month2) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸��Է�");
		}
		sc.close();
	}
}