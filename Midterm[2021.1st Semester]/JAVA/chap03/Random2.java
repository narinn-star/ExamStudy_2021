package chap03;

import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개 ? ");
		int num = sc.nextInt();
		int rand[] = new int[num];
		
		for(int i = 0; i<num; i++) {
			rand[i] = (int)(Math.random()*100 + 1);
			for(int j = 0; j<i; j++) {
				if(rand[i] == rand[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i<num; i++) {
			System.out.print(rand[i] + " ");
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		sc.close();
	}
}
