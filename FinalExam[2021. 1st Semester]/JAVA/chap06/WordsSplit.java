package chap06;

import java.util.Scanner;

public class WordsSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String text = sc.nextLine();
			if(text.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String [] words = text.split(" ");
			System.out.println("어절 개수는 " + words.length);
			sc.close();
		}
	}

}
