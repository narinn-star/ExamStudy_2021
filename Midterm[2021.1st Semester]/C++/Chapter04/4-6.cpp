#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "�Ʒ��� �� ���� �Է��ϼ���. (exit�� �Է��ϸ� �����մϴ�.)" << endl;
	string s;
	while (1) {
		cout << ">> ";
		getline(cin, s);
		if (s == "exit")
			break;
		for (int i = s.length(); i >=0; i--) {
			cout << s[i];
		}
		cout << endl;
	}
}