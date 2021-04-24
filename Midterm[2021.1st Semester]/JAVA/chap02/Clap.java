package chap02;

import java.util.Scanner;

public class Clap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int num = sc.nextInt();
		int count = 0;

		if (num < 10) {
			if (num % 3 == 0)
				count++;
		} else {
			if (((num % 10) % 3 == 0) && ((num % 10) != 0)) {
				count++;
			}
			if ((num / 10) % 3 == 0)
				count++;
		}

		if (count == 1)
			System.out.print("박수짝");
		else if (count == 2)
			System.out.print("박수짝짝");
		else
			System.out.print("---");

		sc.close();
	}
}