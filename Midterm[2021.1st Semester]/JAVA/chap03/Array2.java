package chap03;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		int num[] = new int[10];
		
		for(int i = 0; i<10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i = 0; i<10; i++) {
			if(num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}
		sc.close();
	}
}