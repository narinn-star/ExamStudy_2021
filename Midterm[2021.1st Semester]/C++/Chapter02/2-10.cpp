#include <iostream>
using namespace std;

int main() {
	cout << "���ڿ� �Է� >> ";
	string hello;
	cin >> hello;
	for (int i = 0; i < hello.length(); i++) {
		for (int j = 0; j <= i; j++) {
			cout << hello[j];
		}
		cout << endl;
	}
}