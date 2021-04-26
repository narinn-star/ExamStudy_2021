package chap03;

public class Random4 {
	public static void main(String[] args) {
		int count = 0;
		int n1 = 0, n2 = 0;
		int rand[][] = new int[4][4];
		
		for(int i = 0; i<rand.length; i++) {
			for(int j = 0; j<rand[i].length; j++) {
				rand[i][j] = (int)(Math.random()*10 + 1);
			}
		}
		
		while(count < 6) {
			n1 = (int)(Math.random()*3);
			n2 = (int)(Math.random()*3);
			if(rand[n1][n2] != 0) {
				rand[n1][n2] = 0;
				count++;
			}
		}
		
		for(int i = 0; i<rand.length; i++) {
			for(int j = 0; j<rand[i].length; j++) {
				System.out.print(rand[i][j] + " ");
			}
			System.out.println();
		}
	}
}