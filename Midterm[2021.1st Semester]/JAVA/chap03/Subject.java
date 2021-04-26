package chap03;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95,88,76,62,55};
		String subject= "";
		int i = 0;
		
		while(true) {
			System.out.print("과목 이름 >> ");
			subject = sc.next();
			if(subject.equals("그만"))
				break;
			for(i = 0; i<course.length; i++) {
				if(course[i].equals(subject)) {
					System.out.println(subject + "의 점수는 " + score[i]);
					System.out.println(i);
					break;
				}
			}
			if(course.length == i)
				System.out.println(i);
			
		}
		sc.close();
	}
}