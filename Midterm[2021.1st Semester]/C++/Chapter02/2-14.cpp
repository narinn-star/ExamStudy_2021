#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "���������� 2000��, �Ƹ޸�ī�� 2300��, īǪġ�� 2500���Դϴ�." << endl;
	
	int money = 0;
	while (money < 20000) {
		char coffee[100];
		int num;

		cout << "�ֹ� >> ";
		cin >> coffee >> num;

		if (strcmp(coffee, "����������") == 0) {
			cout << 2000 * num << "���Դϴ�. ���ְ� �弼��" << endl;
			money += 2000 * num;
		}
		else if (strcmp(coffee, "�Ƹ޸�ī��") == 0) {
			cout << 2300 * num << "���Դϴ�. ���ְ� �弼��" << endl;
			money += 2300 * num;
		}
		else if (strcmp(coffee, "īǪġ��") == 0) {
			cout << 2500 * num << "���Դϴ�. ���ְ� �弼��" << endl;
			money += 2500 * num;
		}
	}
	cout << "���� " << money << "���� �Ǹ��Ͽ� ī�並 �ݽ��ϴ�. ���ٿ� ~" << endl;
}