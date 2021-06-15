package chap07;

import java.util.*;

public class Vector_Big {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> nums = new Vector<Integer>();
		
		System.out.print("���� (-1�� �Էµ� ������) >> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1)
				break;
			nums.add(n);
		}
		
		int big = nums.get(0);
		for(int i = 1; i<nums.size(); i++) {
			if(big < nums.get(i))
				big = nums.get(i);
		}
		System.out.println("���� ū ���� " + big);
		scanner.close();
	}

}
