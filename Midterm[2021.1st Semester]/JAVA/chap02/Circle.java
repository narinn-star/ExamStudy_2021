package chap02;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		
		System.out.print("점 입력 >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(Math.sqrt((x-a)*(x-a) +(y-b)*(y-b)) < r)
			System.out.println("점 (" + a + ", " + b + ")는 원 안에 있다." );
		else
			System.out.println("점 (" + a + ", " + b + ")는 원 안에 없다." );
		
		sc.close();
	}
}