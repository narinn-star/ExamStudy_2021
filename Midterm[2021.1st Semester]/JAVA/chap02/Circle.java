package chap02;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double r = sc.nextDouble();
		
		System.out.print("�� �Է� >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(Math.sqrt((x-a)*(x-a) +(y-b)*(y-b)) < r)
			System.out.println("�� (" + a + ", " + b + ")�� �� �ȿ� �ִ�." );
		else
			System.out.println("�� (" + a + ", " + b + ")�� �� �ȿ� ����." );
		
		sc.close();
	}
}