#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "���ڿ� �Է� >> ";
	string s;
	int count = 0;
	getline(cin, s);
	for (int i = 0; i < s.length(); i++) {
		if (s[i] == 'a')
			count++;
	}
	cout << "���� a�� " << count << "�� �ֽ��ϴ�." << endl;
}