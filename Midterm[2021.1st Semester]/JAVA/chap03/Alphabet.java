package chap03;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		String s = sc.next();
		char c = s.charAt(0);

		for (char i = c; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}