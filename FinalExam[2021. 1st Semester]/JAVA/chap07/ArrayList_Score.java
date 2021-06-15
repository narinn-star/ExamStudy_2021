package chap07;

import java.util.*;

public class ArrayList_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> score = new ArrayList<Character>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");

		for (int i = 0; i < 6; i++) {
			char s = sc.next().charAt(0);
			score.add(s);
		}

		double sum = 0;
		for (int i = 0; i < score.size(); i++) {
			char s = score.get(i);
			switch (s) {
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
			default:
				continue;
			}
		}
		System.out.println(sum / score.size());
		sc.close();
	}

}
