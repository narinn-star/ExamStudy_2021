package chapter13;

import java.util.Scanner;

class FirstThread extends Thread {
	public void run() {
		int i = 1;
		try {
			System.out.println("스레드 실행 시작");
			while (i <= 10) {
				sleep(1000);
				System.out.print(i + " ");
				i++;
			}
			System.out.println("\n스레드 종료");
			
		} catch (InterruptedException e) {
			return;
		}
	}

}

public class No_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FirstThread th = new FirstThread();
		System.out.println("아무 키나 입력");
		sc.next();
		th.start();
		sc.close();
	}
}