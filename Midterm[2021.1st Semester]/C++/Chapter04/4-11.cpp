#include <iostream>
using namespace std;

class Container {
	int size;
public:
	Container() {
		size = 10;
	}
	void fill() {
		size = 10;
	}
	void consume() {
		size--;
	}
	int getSize() {
		return size;
	}
};

class CoffeeVendingMachine {
	Container tong[3];
	void fill() {
		for (int i = 0; i < 3; i++) {
			tong[i].fill();
		}
		show();
	}
	void selectEspresso() {
		for (int i = 0; i < 3; i++) {
			if (tong[i].getSize() == 0) {
				cout << "원료가 부족합니다." << endl;
				run();
			}
		}

		tong[0].consume();
		tong[1].consume();

		cout << "에스프레소 드세요" << endl;
	}
	void selectAmericano() {
		for (int i = 0; i < 3; i++) {
			if (tong[i].getSize() == 0) {
				cout << "원료가 부족합니다." << endl;
				run();
			}
		}

		tong[0].consume();
		tong[1].consume();
		tong[1].consume();

		cout << "아메리카노 드세요" << endl;
	}
	void selectSugarCoffee() {
		for (int i = 0; i < 3; i++) {
			if (tong[i].getSize() == 0) {
				cout << "원료가 부족합니다." << endl;
				run();
			}
		}
		
		tong[0].consume();
		tong[1].consume();
		tong[1].consume();
		tong[2].consume();

		cout << "설탕커피 드세요" << endl;
	}
	void show() {
		cout << "커피 " << tong[0].getSize() << ", 물 " << tong[1].getSize() << ", 설탕 " << tong[2].getSize() << endl;
	}
public:
	void run() {
		int select;
		while (1) {
			cout << "메뉴를 눌러주세요(1:에스프레소, 2:아메리카노, 3:설탕타기, 4:잔량보기, 5:채우기) >> ";
			cin >> select;
			switch (select) {
			case 1:
				selectEspresso();
				break;
			case 2:
				selectAmericano();
				break;
			case 3:
				selectSugarCoffee();
				break;
			case 4:
				show();
				break;
			case 5:
				fill();
				break;
			default:
				cout << "ERROR" << endl;
			}
		}

	}
};

int main() {
	CoffeeVendingMachine coffee;
	cout << "***** 커피자판기를 작동합니다. *****" << endl;
	coffee.run();
}
