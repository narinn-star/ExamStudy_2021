package chapter07;

import java.util.*;

public class No_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> input = new HashMap<>();
		
		System.out.println("** 포인트 관리 프로그램입니다. ");
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			
			String name = sc.next();
			if(name.equals("그만"))
				break;
			int point = sc.nextInt();
			
			if(input.containsKey(name))
				point += input.get(name);
			
			input.put(name, point);
			
			Set<String> keys = input.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("(" + key + ", " + input.get(key) + ") ");
			}
		}
		sc.close();
	}
}