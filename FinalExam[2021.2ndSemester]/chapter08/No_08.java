package chapter08;

import java.io.*;

public class No_08 {
	public static void main(String[] args) {
		File file = new File("file");
		File[] subfiles = file.listFiles();
		
		String name = "";
		long big = 0;
		for(int i = 0; i < subfiles.length; i++	) {
			long len = subfiles[i].length();
			if(big < len) {
				big = len;
				name = subfiles[i].getName();
			}
		}
		System.out.println("가장 큰 파일은 " + name + " " + big + "바이트");
	}
}