package chap03;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		String subject= "";
		int i = 0;
		
		while(true) {
			System.out.print("���� �̸� >> ");
			subject = sc.next();
			if(subject.equals("�׸�"))
				break;
			for(i = 0; i<course.length; i++) {
				if(course[i].equals(subject)) {
					System.out.println(subject + "�� ������ " + score[i]);
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