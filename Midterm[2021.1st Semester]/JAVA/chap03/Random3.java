package chap03;

public class Random3 {
	public static void main(String[] args) {
		int rand[][] = new int[4][4];
		
		for(int i =0; i<rand.length; i++) {
			for (int j = 0; j<rand[i].length; j++) {
				rand[i][j] = (int)(Math.random()*10 +1);
				System.out.print(rand[i][j] + "\t");
			}
			System.out.println();
		}
	}
}