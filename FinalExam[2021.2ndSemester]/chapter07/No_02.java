package chapter07;

import java.util.*;

public class No_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> score = new ArrayList<>();
		double sum = 0;

		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			char s = sc.next().charAt(0);
			score.add(s);
		}

		for (int i = 0; i < score.size(); i++) {
			switch (score.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		System.out.println(sum / 6);
		sc.close();
	}
}