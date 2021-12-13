package chapter08;

import java.util.*;
import java.io.*;

public class No_04 {
	public static void main(String[] args) {
		FileReader fr = null;
		
		System.out.println("파일 출력");
		
		try {
			fr = new FileReader("C:\\windows\\system.ini");
			Scanner sc = new Scanner(fr);
			int i = 1;
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(i + ": " + line);
				i++;
			}
			sc.close();
			fr.close();
		}catch(IOException e) {
			System.out.println("오류");
		}
	}
}