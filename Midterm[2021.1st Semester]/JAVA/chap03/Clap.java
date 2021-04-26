package chap03;

public class Clap {
	public static void main(String[] args) {
		int a, b;
		for (int i = 0; i < 100; i++) {
			a = i / 10;
			b = i % 10;
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9))
				System.out.println("¹Ú¼ö Â¦Â¦");
			else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 || b == 9))
				System.out.println("¹Ú¼ö Â¦");
			else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 || b != 9))
				System.out.println("¹Ú¼ö Â¦");
		}
	}
}