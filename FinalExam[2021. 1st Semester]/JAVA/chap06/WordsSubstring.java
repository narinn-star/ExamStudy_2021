package chap06;

import java.util.Scanner;

public class WordsSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		
		String text = sc.nextLine();
		for(int i = 1; i<= text.length(); i++) {
			System.out.print(text.substring(i));
			System.out.println(text.substring(0, i));
		}
		sc.close();
	}

}
