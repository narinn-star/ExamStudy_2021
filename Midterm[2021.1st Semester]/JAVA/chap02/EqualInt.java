package chap02;

import java.util.Scanner;

public class EqualInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력 >> ");
		int num =sc.nextInt();
		if(num /10 == num % 10) 
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		sc.close();
	}
}
