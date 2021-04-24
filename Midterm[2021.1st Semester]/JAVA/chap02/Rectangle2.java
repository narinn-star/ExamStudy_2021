package chap02;

import java.util.Scanner;

public class Rectangle2 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		if (inRect(x1, y1, 100, 100, 200, 200) && inRect(x1, y2, 100, 100, 200, 200)
				&& inRect(x2, y1, 100, 100, 200, 200) && inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("�簢���� ��Ĩ�ϴ�.1");
		else if (inRect(x1, y1, 100, 100, 200, 200) || inRect(x1, y2, 100, 100, 200, 200)
				|| inRect(x2, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("�簢���� ��Ĩ�ϴ�.2");
		else if (inRect(100, 100, x1, y1, x2, y2) && inRect(100, 200, x1, y1, x2, y2)
				&& inRect(200, 100, x1, y1, x2, y2) && inRect(200, 200, x1, y1, x2, y2))
			System.out.println("�簢���� ��Ĩ�ϴ�.3");
		else
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");

		sc.close();
	}
}