package chap03;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보 ! >> ");
			String user = sc.next();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			else {
				int com = (int)(Math.random()*3);
				if(user.equals(str[com]))
					System.out.println("사용자 = " + user + ", 컴퓨터 = "+ str[com] +", DRAW!!");
				else if((user.equals("가위"))&&(str[com].equals("바위")) 
						|| (user.equals("바위"))&&(str[com].equals("보"))
						|| (user.equals("보")) &&(str[com].equals("가위")))
					System.out.println("사용자 = " + user + ", 컴퓨터 = "+ str[com] +", COM 승리");
				else if((user.equals("바위"))&&(str[com].equals("가위")) 
						|| (user.equals("가위"))&&(str[com].equals("보"))
						|| (user.equals("보")) &&(str[com].equals("바위")))
					System.out.println("사용자 = " + user + ", 컴퓨터 = "+ str[com] +", USER 승리");
			}
		}
		sc.close();
	}

}
