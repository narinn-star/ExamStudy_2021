package chap06;

import java.util.*;

public class Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String text = sc.nextLine();
			if(text.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				return;
			}
			StringTokenizer st = new StringTokenizer(text, " ");
			int count = st.countTokens();
			System.out.println("���� ������ " + count);
			sc.close();
		}
	}

}
