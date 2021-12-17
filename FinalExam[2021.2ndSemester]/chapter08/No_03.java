package chapter08;

import java.io.*;

public class No_03 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("C:\\windows\\system.ini");
			fw = new FileWriter("file/copySystem.txt");
			
			//외우기
			int n;
			while ((n = fr.read()) != -1) {
				if(Character.isUpperCase(n))
					n = Character.toLowerCase(n);
				else if(Character.isLowerCase(n))
					n = Character.toUpperCase(n);
				
				fw.write(n);

			}

			fr.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("오류");
		}
	}
}