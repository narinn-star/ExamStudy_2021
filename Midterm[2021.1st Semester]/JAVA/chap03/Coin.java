package chap03;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		for(int i = 0; i<unit.length; i++) {
			int count = 0;
			if(money >= unit[i]) {
				count = money / unit[i];
				money %= unit[i];
				System.out.println(unit[i] + "짜리 : " + count + "개");
			}
		}
		sc.close();
	}
}