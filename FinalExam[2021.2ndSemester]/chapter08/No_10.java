package chapter08;

import java.util.*;
import java.io.*;

public class No_10 {
	public static void main(String[] args) {
		HashMap<String, String> phonebook = new HashMap<>();
		try {
			Scanner sc = new Scanner(new FileReader(new File("file/phone.txt")));
			while(sc.hasNext()) {
				String name = sc.next();
				String tel = sc.next();
				phonebook.put(name, tel);
			}
			sc.close();
		
		} catch (IOException e) {
			System.out.println("오류");
		}
		
		System.out.println("총 " + phonebook.size() + "개의 전화번호");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("이름 >> ");
			String search = s.next();
			if(search.equals("그만"))
				break;
			if(phonebook.get(search) != null) {
				System.out.println(phonebook.get(search));
			}
			else
				System.out.println("찾는 이름이 없습니다.");
		}
		s.close();
	}
}