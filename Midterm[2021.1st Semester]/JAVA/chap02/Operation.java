package chap02;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 _ (if) >> ");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();

		if (s.equals("+"))
			System.out.println(a + s + b + "의 계산 결과는 " + (a + b));
		else if (s.equals("-"))
			System.out.println(a + s + b + "의 계산 결과는 " + (a - b));
		else if (s.equals("*"))
			System.out.println(a + s + b + "의 계산 결과는 " + (a * b));
		else if (s.equals("/")) {
			if (b == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(a + s + b + "의 계산 결과는 " + a / b);
		} else
			System.out.println("ERR");

		System.out.print("연산 _ (switch) >> ");
		int c = sc.nextInt();
		String o = sc.next();
		int d = sc.nextInt();

		switch (o) {
		case "+":
			System.out.println(c + o + d + "의 계산 결과는 " + (c + d));
			break;
		case "-":
			System.out.println(c + o + d + "의 계산 결과는 " + (c - d));
			break;
		case "*":
			System.out.println(c + o + d + "의 계산 결과는 " + (c * d));
			break;
		case "/":
			if (d == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(c + o + d + "의 계산 결과는 " + (c / d));
			break;
		default:
			System.out.println("ERR");
			break;
		}

		sc.close();
	}
}