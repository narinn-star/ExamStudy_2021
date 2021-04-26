package chap03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
				int n = sc.nextInt();
				int m = sc.nextInt();
				sc.close();
				System.out.print(n + " x " + m + " = " + n*m);
				break;
			}
			catch(InputMismatchException e)	{
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
				continue;
			}
		}
	}
}