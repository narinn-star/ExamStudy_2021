package chap02;

import java.util.Scanner;

public class WontoDollar {
	public static void main(String[] args) {
		System.out.print("원화 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		System.out.println(won + "원은 $" + (double)(won/1100) + "입니다.");
		sc.close();
	}
}
