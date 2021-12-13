package chapter08;

import java.io.*;

public class No_09 {
	public static void main(String[] args) {
		File f = new File("file/삭제");
		File[] subFiles = f.listFiles();

		System.out.println("file/삭제 디렉터리의 .txt 파일을 모두 삭제합니다.");

		for (int i = 0; i < subFiles.length; i++) {
			if (subFiles[i].getName().lastIndexOf(".txt") != -1) {
				System.out.println(subFiles[i].getPath() + " 삭제");
				subFiles[i].delete();				
			}
		}
		
		System.out.println("총 " + subFiles.length + "개의 .txt 파일을 삭제하였습니다.");
	}
}