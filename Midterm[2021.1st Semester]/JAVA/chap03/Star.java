package chap03;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� >> ");
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			for(int j = i; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}