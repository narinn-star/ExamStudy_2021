#include <iostream>
using namespace std;

int main() {
	cout << "***** �¸��忡 ���� ���� ȯ���մϴ�. *****" << endl;
	int select;
	int count;
	
	while (true) {
		cout << "«��:1, ¥��:2, ������:3, ����:4 >> ";
		cin >> select;
		
		if (select == 4) {
			cout << "���� ������ �������ϴ�.";
			break;
		}
		else if (select >= 5) {
			cout << "�ٽ� �ֹ��ϼ��� !" << endl;
			continue;
		}

		cout << "���κ�?";
		cin >> count;

		switch (select) {
		case 1: cout << "«�� " << count << "�κ� ���Խ��ϴ�." << endl;
			break;
		case 2:
			cout << "¥��� " << count << "�κ� ���Խ��ϴ�." << endl;
			break;
		case 3:
			cout << "������ " << count << "�κ� ���Խ��ϴ�." << endl;
			break;
		default:
			cout << "�ٽ� �ֹ��ϼ��� !" << endl;
		}
	}
}