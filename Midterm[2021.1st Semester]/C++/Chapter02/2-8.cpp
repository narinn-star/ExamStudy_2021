#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "5���� �̸��� ';'���� �����Ͽ� �Է��ϼ���" << endl << ">> ";
	char name[100];
	int max = 0;
	string result;
	
	for (int i = 0; i < 5; i++) {
		cin.getline(name, 100, ';');
		cout << i + 1 << " : " << name << endl;

		if (max < strlen(name)) {
			max = strlen(name);
			result = name;
		}
	}
	cout << "���� �� �̸��� " << result;
}