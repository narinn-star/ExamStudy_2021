package chap06;

import java.util.Scanner;

public class WordsSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세오. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		
		String text = sc.nextLine();
		for(int i = 1; i<= text.length(); i++) {
			System.out.print(text.substring(i));
			System.out.println(text.substring(0, i));
		}
		sc.close();
	}

}
