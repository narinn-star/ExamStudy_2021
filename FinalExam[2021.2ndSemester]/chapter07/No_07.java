package chapter07;

import java.util.*;

public class No_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> list = new HashMap<>();
		
		System.out.println("미래장학금관리시스템입니다.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String[] input = sc.nextLine().split(" ");
			for(int j = 0; j < input.length; j++) {
				list.put(input[0], Double.parseDouble(input[1]));
			}
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double standard = sc.nextDouble();
		
		Set<String> keys = list.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String key = it.next();
			Double score = list.get(key);
			if(score >= standard)
				System.out.print(key + " ");
		}
		System.out.println();
		sc.close();
	}
}