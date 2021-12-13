package chapter08;

import java.io.*;

public class No_02 {
	public static void main(String[] args) {
		System.out.println("file/phone.txt를 출력");
		FileReader fr = null;

		try {
			fr = new FileReader("file/phone.txt");
			int n;
			
			while((n = fr.read()) != -1)
				System.out.print((char)n);
			
			fr.close();

		} catch (IOException e) {
			System.out.println("오류");
		}
	}
}