#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "5명의 이름을 ';'으로 구분하여 입력하세요" << endl << ">> ";
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
	cout << "가장 긴 이름은 " << result;
}