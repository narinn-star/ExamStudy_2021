package chapter07;

import java.util.*;

class Student {
	String name;
	String major;
	int num;
	double score;
	
	public Student() {}
	
	public Student(String name, String major, int num, double score) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getNum() {
		return num;
	}
	
	public double getScore() {
		return score;
	}
}

public class No_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> info = new HashMap<>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] input = sc.nextLine().split(", ");
			for(int j = 0; j < input.length; j++) {
				Student student = new Student(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
				info.put(input[0], student);
			}
		}
		System.out.println("========================");
		
		Set<String> keys = info.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Student st = info.get(key);
			
			System.out.println("이름 : " + st.getName() + "\n학과 : " + st.getMajor() + "\n학번 : " + st.getNum() + "\n학점 평균 : " + st.getScore());
			System.out.println("========================");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String search = sc.next();
			if(search.equals("그만"))
				break;
			Student s = info.get(search);
			System.out.println(s.getName() + ", " + s.getMajor() + ", " + s.getNum() + ", " + s.getScore());
		}
		
		sc.close();
	}
}