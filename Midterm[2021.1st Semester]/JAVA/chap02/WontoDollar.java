package chap02;

import java.util.Scanner;

public class WontoDollar {
	public static void main(String[] args) {
		System.out.print("��ȭ �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		System.out.println(won + "���� $" + (double)(won/1100) + "�Դϴ�.");
		sc.close();
	}
}
