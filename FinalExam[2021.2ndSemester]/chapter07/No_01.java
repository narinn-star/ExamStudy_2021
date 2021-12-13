package chapter07;

import java.util.*;

public class No_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<>();
		int n = 0;
		
		System.out.print("정수 (-1이 입력될 때까지) >> ");
		while(n != -1) {
			n = sc.nextInt();
			v.add(n);
		}
		int big = 0;
		for(int i = 0; i < v.size(); i++) {
			if(v.get(i) > big)
				big = v.get(i);
		}
		
		System.out.println("가장 큰 수는 " + big);
		sc.close();
	}
}