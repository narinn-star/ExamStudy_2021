package chap07;

import java.util.*;

public class Vector_Rainfall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> rainfall = new Vector<Integer>();
		
		while(true) {
			int sum = 0;
			
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int rain = sc.nextInt();
			if(rain == 0)
				break;
			rainfall.add(rain);
			
			for(int i = 0; i<rainfall.size(); i++) {
				System.out.print(rainfall.get(i) + " ");
				sum += rainfall.get(i);
			}
			System.out.println("\n현재 평균 " + sum / rainfall.size());
		}
		sc.close();
	}
}