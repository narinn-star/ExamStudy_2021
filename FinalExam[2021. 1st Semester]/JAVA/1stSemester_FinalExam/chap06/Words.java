package chap06;

import java.util.*;

public class Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String text = sc.nextLine();
			if(text.equals("그만")) {
				System.out.println("종료합니다...");
				return;
			}
			StringTokenizer st = new StringTokenizer(text, " ");
			int count = st.countTokens();
			System.out.println("어절 개수는 " + count);
			sc.close();
		}
	}

}
