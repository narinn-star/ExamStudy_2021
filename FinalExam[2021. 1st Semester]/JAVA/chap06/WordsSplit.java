package chap06;

import java.util.Scanner;

public class WordsSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String text = sc.nextLine();
			if(text.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			String [] words = text.split(" ");
			System.out.println("���� ������ " + words.length);
			sc.close();
		}
	}

}
