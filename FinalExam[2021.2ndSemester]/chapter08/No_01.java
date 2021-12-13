package chapter08;

import java.io.*;
import java.util.*;

public class No_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		FileWriter fw = null;

		try {
			fw = new FileWriter("file/phone.txt");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String info = sc.nextLine();
				if (info.equals("그만"))
					break;

				fw.write(info, 0, info.length());
				fw.write("\r\n", 0, 2);

			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file/phone.txt에 저장하였습니다.");

		sc.close();
	}
}