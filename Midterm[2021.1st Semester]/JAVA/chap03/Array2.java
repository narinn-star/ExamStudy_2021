package chap03;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		int num[] = new int[10];
		
		for(int i = 0; i<10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i = 0; i<10; i++) {
			if(num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}
		sc.close();
	}
}