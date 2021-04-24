package chap02;

import java.util.Scanner;

public class Middle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int res;
		if((num1 < num2) && (num1 > num3) || ((num1 > num2) && (num1 < num3))){
			res = num1;
			System.out.println("중간값은 " + res);
		}
		else if((num2 > num1) && (num2 < num3) || ((num2 < num1) && (num2 > num3))) {
			res = num2;
			System.out.println("중간값은 " + res);
		}
		else if((num3 > num1) && (num3 < num2) || ((num3 < num1) && (num3 > num2))) {
			res = num3;
			System.out.println("중간값은 " + res);
		}
		sc.close();
	}
}