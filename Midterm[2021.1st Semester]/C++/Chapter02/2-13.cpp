#include <iostream>
using namespace std;

int main() {
	cout << "***** 승리장에 오신 것을 환영합니다. *****" << endl;
	int select;
	int count;
	
	while (true) {
		cout << "짬뽕:1, 짜장:2, 군만두:3, 종료:4 >> ";
		cin >> select;
		
		if (select == 4) {
			cout << "오늘 영업은 끝났습니다.";
			break;
		}
		else if (select >= 5) {
			cout << "다시 주문하세요 !" << endl;
			continue;
		}

		cout << "몇인분?";
		cin >> count;

		switch (select) {
		case 1: cout << "짬뽕 " << count << "인분 나왔습니다." << endl;
			break;
		case 2:
			cout << "짜장면 " << count << "인분 나왔습니다." << endl;
			break;
		case 3:
			cout << "군만두 " << count << "인분 나왔습니다." << endl;
			break;
		default:
			cout << "다시 주문하세요 !" << endl;
		}
	}
}