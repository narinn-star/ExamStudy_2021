package chapter08;

import java.io.*;
import java.util.*;

public class No_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream fr1 = null;
		FileInputStream fr2 = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요");
		String file1 = sc.next();	//file/elvis1.txt
		
		System.out.print("두번째 파일 이름을 입력하세요");
		String file2 = sc.next();	//file/elvis1복사본.txt
		System.out.println(file1 + "와 " + file2 + "를 비교합니다.");
		
		try {
			boolean same = true;
			
			fr1 = new FileInputStream(file1);
			fr2 = new FileInputStream(file2);
			
			byte[] fr1Buf = new byte[1024];
			byte[] fr2Buf = new byte[1024];
			
			int fr1Cnt = 0, fr2Cnt;
			while(true) {
				fr1Cnt = fr1.read(fr1Buf, 0, fr1Buf.length);
				fr2Cnt = fr2.read(fr2Buf, 0, fr2Buf.length);
				
				if(fr1Cnt != fr2Cnt)
					same = false;
				
				if(fr1Cnt == -1)
					break;
				
				for(int i = 0; i < fr1Cnt; i++) {
					if(fr1Buf[i] != fr2Buf[i])
						same = false;
				}
				if(same)
					System.out.println("같음");
			}
			
		}
		catch(IOException e) {
			System.out.println("오류");
		}
		
		sc.close();
		
	}

}
