package chap03;

public class Random {
	public static void main(String[] args) {
		int num[] = new int[10];
		double sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		
		for(int i = 0; i<10; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			sum += num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println("\n" + "Æò±ÕÀº " + sum / 10);
	}
}