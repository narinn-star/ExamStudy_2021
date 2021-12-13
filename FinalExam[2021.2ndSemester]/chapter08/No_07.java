package chapter08;

import java.io.*;

public class No_07 {
	public static void main(String[] args) {
		System.out.println("file/apple.jpg를 file/copyApple.jpg로 복사합니다.");
		System.out.println("10%마다 *를 출력합니다.");
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		int n;
		int percent = 0;
		try {
			fin = new FileInputStream("file/apple.jpg");
			fout = new FileOutputStream("file/copyApple.jpg");
			
			File file = new File("file/apple.jpg");
			long size = file.length();
			
			while((n = fin.read()) != -1) {
				fout.write((byte)n);
				percent++;
				if(percent == size / 10) {
					System.out.print("*");
					percent = 0;
				}
			}
			
			fin.close();
			fout.close();
		}
		catch(IOException e) {
			System.out.println("오류");
		}
	}
}