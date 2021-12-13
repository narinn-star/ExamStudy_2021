package chapter08;

import java.io.*;
import java.util.*;

public class No_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fr1 = null;
		FileReader fr2 = null;
		FileWriter fw = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요");
		String file1 = sc.next();	//file/elvis1.txt
		
		System.out.print("두번째 파일 이름을 입력하세요");
		String file2 = sc.next();	//file/elvis2.txt
		
		try {
			fr1 = new FileReader(file1);
			fr2 = new FileReader(file2);
			fw = new FileWriter("file/appended.txt");
			
			int n;
			while((n = fr1.read()) != -1) {
					fw.write((char)n);
			}
			while((n = fr2.read()) != -1) {
				fw.write((char)n);
			}
			
			fr1.close();
			fr2.close();
			fw.close();
			sc.close();
			System.out.println("저장하여씀니다");
		}
		catch(IOException e) {
			System.out.println("오류");
		}
		
	}
}