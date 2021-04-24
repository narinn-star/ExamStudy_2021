package chap02;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� _ (if) >> ");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();

		if (s.equals("+"))
			System.out.println(a + s + b + "�� ��� ����� " + (a + b));
		else if (s.equals("-"))
			System.out.println(a + s + b + "�� ��� ����� " + (a - b));
		else if (s.equals("*"))
			System.out.println(a + s + b + "�� ��� ����� " + (a * b));
		else if (s.equals("/")) {
			if (b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(a + s + b + "�� ��� ����� " + a / b);
		} else
			System.out.println("ERR");

		System.out.print("���� _ (switch) >> ");
		int c = sc.nextInt();
		String o = sc.next();
		int d = sc.nextInt();

		switch (o) {
		case "+":
			System.out.println(c + o + d + "�� ��� ����� " + (c + d));
			break;
		case "-":
			System.out.println(c + o + d + "�� ��� ����� " + (c - d));
			break;
		case "*":
			System.out.println(c + o + d + "�� ��� ����� " + (c * d));
			break;
		case "/":
			if (d == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(c + o + d + "�� ��� ����� " + (c / d));
			break;
		default:
			System.out.println("ERR");
			break;
		}

		sc.close();
	}
}