package chapter07;

import java.util.*;

class Location {
	private String city;
	private int longt;
	private int lat;

	Location(String city, int longt, int lat) {
		this.city = city;	//도시
		this.longt = longt;	//경도
		this.lat = lat;		//위도
	}

	public String getCity() {
		return city;
	}

	public int getLongt() {
		return longt;
	}

	public int getLat() {
		return lat;
	}
}

public class No_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> loc = new HashMap<>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] input = sc.nextLine().split(", ");
			for(int j = 0; j < input.length; j++) {
				Location lo = new Location(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
				loc.put(input[0], lo);
			}
		}
		
		Set<String> keys = loc.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.println("========================");

		while(it.hasNext()) {
			String key = it.next();
			Location l = loc.get(key);
			System.out.println(l.getCity() + "\t" + l.getLongt() + "\t" + l.getLat());
		}
		System.out.println("========================");

		while(true) {
			System.out.print("도시 이름 >> ");
			String search = sc.next();
			if(search.equals("그만"))
				break;
			Location l = loc.get(search);
			if(l != null)
				System.out.println(l.getCity() + "\t" + l.getLongt() + "\t" + l.getLat());
			else
				System.out.println(search + "는 없습니다.");
		}
		sc.close();
	}
}