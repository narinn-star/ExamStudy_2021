package chap02;

import java.util.Scanner;

public class EqualInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է� >> ");
		int num =sc.nextInt();
		if(num /10 == num % 10) 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		sc.close();
	}
}
