package chap03;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int j = 0; j<100; j++) {
			sum2 = sum2 +j;
			j++;
		}
		System.out.println(sum2);
		
		int sum3 = 0, k = 0;
		do {
			sum3 = sum3 + k;
			k += 2;
		}while(k < 100);
		System.out.println(sum3);
	}
}