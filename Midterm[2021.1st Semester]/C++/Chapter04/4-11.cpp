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
				cout << "���ᰡ �����մϴ�." << endl;
				run();
			}
		}

		tong[0].consume();
		tong[1].consume();

		cout << "���������� �弼��" << endl;
	}
	void selectAmericano() {
		for (int i = 0; i < 3; i++) {
			if (tong[i].getSize() == 0) {
				cout << "���ᰡ �����մϴ�." << endl;
				run();
			}
		}

		tong[0].consume();
		tong[1].consume();
		tong[1].consume();

		cout << "�Ƹ޸�ī�� �弼��" << endl;
	}
	void selectSugarCoffee() {
		for (int i = 0; i < 3; i++) {
			if (tong[i].getSize() == 0) {
				cout << "���ᰡ �����մϴ�." << endl;
				run();
			}
		}
		
		tong[0].consume();
		tong[1].consume();
		tong[1].consume();
		tong[2].consume();

		cout << "����Ŀ�� �弼��" << endl;
	}
	void show() {
		cout << "Ŀ�� " << tong[0].getSize() << ", �� " << tong[1].getSize() << ", ���� " << tong[2].getSize() << endl;
	}
public:
	void run() {
		int select;
		while (1) {
			cout << "�޴��� �����ּ���(1:����������, 2:�Ƹ޸�ī��, 3:����Ÿ��, 4:�ܷ�����, 5:ä���) >> ";
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
	cout << "***** Ŀ�����Ǳ⸦ �۵��մϴ�. *****" << endl;
	coffee.run();
}
